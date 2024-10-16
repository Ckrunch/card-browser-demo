package com.example.restservice.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.example.restservice.models.Card;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CardService {

    @Value("${app.pathtodata}")
    private static String dataPath;
    private static List<Card> cards = new ArrayList<Card>();
    private static boolean isInitialized = false;

    public CardService(@Value("${app.pathtodata}") String dataPath) {
        CardService.dataPath = dataPath;
    }

    /**
     * Use this method to change the path to card data. Default behavior is to use
     * application.properties
     * 
     * @param pathToData Full filepath to card data json
     * @throws FileNotFoundException
     */
    public static void Configure(String pathToData) throws IllegalArgumentException {

        if (pathToData == null || pathToData.isBlank() || !pathToData.toLowerCase().endsWith(".json")) {
            throw new IllegalArgumentException(
                    "pathToData parameter must not be null or empty string, and must have a .json extension");
        }
        dataPath = pathToData;
    }

    /**
     * Loads data from the configured application.properties file or a path provided
     * to the Configure method.
     * 
     * @throws IllegalStateException
     * @throws IOException
     * @throws DatabindException
     * @throws StreamReadException
     */
    public static void LoadData() throws IllegalStateException, StreamReadException, DatabindException, IOException {
        Path absolutePath = Paths.get(dataPath).toAbsolutePath();
        System.out.println(absolutePath);
        System.out.println("Loading Card Data from..." + dataPath);
        File f = new File(absolutePath.toString());

        ObjectMapper om = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        cards = om.readValue(f, om.getTypeFactory().constructCollectionType(List.class, Card.class)); //Load from file contents
        System.out.println("Size Before: " + cards.size());

        RemoveUnwantedRecords();
        System.out.println("Size After: " + cards.size());
        
        System.out.println("Finished loading card data");
        ApplyOrderNumber();
        isInitialized = true;
    }

    //We want to remove cards that don't have enough info to provide an image
    private static void RemoveUnwantedRecords(){
        boolean didRemove = cards.removeIf(item -> item.getIdentifiers().getMultiverseId() == null);
        System.out.println("Did we remove things? " + didRemove);
    }

    private static void ApplyOrderNumber(){
        Integer i = 0;
        for (Card card : cards) {
            System.out.println(card.getName() + "  " + i);
            card.setListPosition(i);
            i++;
        }
    }

    public static void checkInitialized() {
        if (!isInitialized || cards.size() == 0) {
            throw new IllegalStateException("Card data has not been loaded");
        }
    }

    /**
     * Returns the first card in the dataset
     * 
     * @return
     */
    public static Card first() {
        checkInitialized();
        return cards.get(0);
    }

    public static Card previous(Integer position){
        checkInitialized();
        Integer newPos = position - 1;
        if (newPos < 0 || newPos >= cards.size()){
            return last(); //Wrap around previous to the end of the list
        }
        return getByPosition(newPos);
    }

    public static Card next(Integer position){
        checkInitialized();
        Integer newPos = position + 1;
        if (newPos < 0 || newPos >= cards.size()){
            return first(); //Wrap around previous to the beginning of the list
        }
        return cards.get(newPos);
    }

    /**
     * Returns the last card in the dataset
     * 
     * @return
     */
    public static Card last() {
        checkInitialized();
        return cards.get(cards.size() - 1);
    }


    public static Card getByPosition(Integer position) throws IndexOutOfBoundsException{
        var thisCard = cards.get(position);
        return thisCard;
    }


    public static Stream<Card> findByName(String name){
        checkInitialized();

        String lowerName = name.toLowerCase();
        return cards.stream().filter(item -> item.getName().toLowerCase().contains(lowerName));
    }

    public static String getConfig() {
        return dataPath;
    }

    public static int getCount() {
        return cards.size();
    }
}