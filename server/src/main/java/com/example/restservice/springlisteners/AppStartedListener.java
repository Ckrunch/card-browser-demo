package com.example.restservice.springlisteners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.example.restservice.services.CardService;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.boot.context.event.*;

public class AppStartedListener 
        implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(@SuppressWarnings("null") ApplicationStartedEvent event) {
        System.out.println("Starting App Start Event Handler...");
        System.out.println(CardService.getConfig());
        try {
            CardService.LoadData();
        } catch (FileNotFoundException | IllegalStateException e) {
            e.printStackTrace();
        } catch (StreamReadException e) {
            e.printStackTrace();
        } catch (DatabindException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Exiting App Start Event Handler...");
    }
}