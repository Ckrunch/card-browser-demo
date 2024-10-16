package com.example.restservice.models;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1



/**
 * Class to hold all properties for our card object.
 */
public class Card{
    private static final String IMAGE_URL_TEMPLATE = "https://gatherer.wizards.com/Handlers/Image.ashx?type=card&multiverseid=%s";

    @JsonProperty("listPosition") 
    public Integer getListPosition() { 
		 return this.listPosition; } 
    public void setListPosition(Integer listPosition) { 
		 this.listPosition = listPosition; } 
    Integer listPosition;

    @JsonProperty("artist") 
    public String getArtist() { 
		 return this.artist; } 
    public void setArtist(String artist) { 
		 this.artist = artist; } 
    String artist;
    
    @JsonProperty("artistIds") 
    public ArrayList<String> getArtistIds() { 
		 return this.artistIds; } 
    public void setArtistIds(ArrayList<String> artistIds) { 
		 this.artistIds = artistIds; } 
    ArrayList<String> artistIds;
   
    @JsonProperty("availability") 
    public ArrayList<String> getAvailability() { 
		 return this.availability; } 
    public void setAvailability(ArrayList<String> availability) { 
		 this.availability = availability; } 
    ArrayList<String> availability;
    
    @JsonProperty("borderColor") 
    public String getBorderColor() { 
		 return this.borderColor; } 
    public void setBorderColor(String borderColor) { 
		 this.borderColor = borderColor; } 
    String borderColor;
    
    @JsonProperty("colorIdentity") 
    public ArrayList<String> getColorIdentity() { 
		 return this.colorIdentity; } 
    public void setColorIdentity(ArrayList<String> colorIdentity) { 
		 this.colorIdentity = colorIdentity; } 
    ArrayList<String> colorIdentity;
    
    @JsonProperty("colors") 
    public ArrayList<String> getColors() { 
		 return this.colors; } 
    public void setColors(ArrayList<String> colors) { 
		 this.colors = colors; } 
    ArrayList<String> colors;
    
    @JsonProperty("convertedManaCost") 
    public double getConvertedManaCost() { 
		 return this.convertedManaCost; } 
    public void setConvertedManaCost(double convertedManaCost) { 
		 this.convertedManaCost = convertedManaCost; } 
    double convertedManaCost;
    
    @JsonProperty("edhrecRank") 
    public int getEdhrecRank() { 
		 return this.edhrecRank; } 
    public void setEdhrecRank(int edhrecRank) { 
		 this.edhrecRank = edhrecRank; } 
    int edhrecRank;
    
    @JsonProperty("edhrecSaltiness") 
    public double getEdhrecSaltiness() { 
		 return this.edhrecSaltiness; } 
    public void setEdhrecSaltiness(double edhrecSaltiness) { 
		 this.edhrecSaltiness = edhrecSaltiness; } 
    double edhrecSaltiness;
    
    @JsonProperty("finishes") 
    public ArrayList<String> getFinishes() { 
		 return this.finishes; } 
    public void setFinishes(ArrayList<String> finishes) { 
		 this.finishes = finishes; } 
    ArrayList<String> finishes;

    @JsonProperty("frameVersion") 
    public String getFrameVersion() { 
		 return this.frameVersion; } 
    public void setFrameVersion(String frameVersion) { 
		 this.frameVersion = frameVersion; } 
    String frameVersion;
    
    @JsonProperty("hasFoil") 
    public boolean getHasFoil() { 
		 return this.hasFoil; } 
    public void setHasFoil(boolean hasFoil) { 
		 this.hasFoil = hasFoil; } 
    boolean hasFoil;
    
    @JsonProperty("hasNonFoil") 
    public boolean getHasNonFoil() { 
		 return this.hasNonFoil; } 
    public void setHasNonFoil(boolean hasNonFoil) { 
		 this.hasNonFoil = hasNonFoil; } 
    boolean hasNonFoil;
    
    @JsonProperty("identifiers") 
    public Identifiers getIdentifiers() { 
		 return this.identifiers; } 
    public void setIdentifiers(Identifiers identifiers) { 
		 this.identifiers = identifiers; } 
    Identifiers identifiers;
    
    @JsonProperty("isStarter") 
    public boolean getIsStarter() { 
		 return this.isStarter; } 
    public void setIsStarter(boolean isStarter) { 
		 this.isStarter = isStarter; } 
    boolean isStarter;
    
    @JsonProperty("keywords") 
    public ArrayList<String> getKeywords() { 
		 return this.keywords; } 
    public void setKeywords(ArrayList<String> keywords) { 
		 this.keywords = keywords; } 
    ArrayList<String> keywords;
    
    @JsonProperty("language") 
    public String getLanguage() { 
		 return this.language; } 
    public void setLanguage(String language) { 
		 this.language = language; } 
    String language;
    
    @JsonProperty("layout") 
    public String getLayout() { 
		 return this.layout; } 
    public void setLayout(String layout) { 
		 this.layout = layout; } 
    String layout;
    
    @JsonProperty("legalities") 
    public Legalities getLegalities() { 
		 return this.legalities; } 
    public void setLegalities(Legalities legalities) { 
		 this.legalities = legalities; } 
    Legalities legalities;
    
    @JsonProperty("manaCost") 
    public String getManaCost() { 
		 return this.manaCost; } 
    public void setManaCost(String manaCost) { 
		 this.manaCost = manaCost; } 
    String manaCost;
    
    @JsonProperty("manaValue") 
    public double getManaValue() { 
		 return this.manaValue; } 
    public void setManaValue(double manaValue) { 
		 this.manaValue = manaValue; } 
    double manaValue;
    
    @JsonProperty("name") 
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
    
    @JsonProperty("number") 
    public String getNumber() { 
		 return this.number; } 
    public void setNumber(String number) { 
		 this.number = number; } 
    String number;
    
    @JsonProperty("originalText") 
    public String getOriginalText() { 
		 return this.originalText; } 
    public void setOriginalText(String originalText) { 
		 this.originalText = originalText; } 
    String originalText;
    
    @JsonProperty("originalType") 
    public String getOriginalType() { 
		 return this.originalType; } 
    public void setOriginalType(String originalType) { 
		 this.originalType = originalType; } 
    String originalType;
    
    @JsonProperty("printings") 
    public ArrayList<String> getPrintings() { 
		 return this.printings; } 
    public void setPrintings(ArrayList<String> printings) { 
		 this.printings = printings; } 
    ArrayList<String> printings;
    
    @JsonProperty("promoTypes") 
    public ArrayList<String> getPromoTypes() { 
		 return this.promoTypes; } 
    public void setPromoTypes(ArrayList<String> promoTypes) { 
		 this.promoTypes = promoTypes; } 
    ArrayList<String> promoTypes;
    
    @JsonProperty("rarity") 
    public String getRarity() { 
		 return this.rarity; } 
    public void setRarity(String rarity) { 
		 this.rarity = rarity; } 
    String rarity;
    
    @JsonProperty("rulings") 
    public ArrayList<Ruling> getRulings() { 
		 return this.rulings; } 
    public void setRulings(ArrayList<Ruling> rulings) { 
		 this.rulings = rulings; } 
    ArrayList<Ruling> rulings;
    
    @JsonProperty("securityStamp") 
    public String getSecurityStamp() { 
		 return this.securityStamp; } 
    public void setSecurityStamp(String securityStamp) { 
		 this.securityStamp = securityStamp; } 
    String securityStamp;
    
    @JsonProperty("setCode") 
    public String getSetCode() { 
		 return this.setCode; } 
    public void setSetCode(String setCode) { 
		 this.setCode = setCode; } 
    String setCode;

    @JsonProperty("subtypes") 
    public ArrayList<String> getSubtypes() { 
		 return this.subtypes; } 
    public void setSubtypes(ArrayList<String> subtypes) { 
		 this.subtypes = subtypes; } 
    ArrayList<String> subtypes;
    
    @JsonProperty("supertypes") 
    public ArrayList<String> getSupertypes() { 
		 return this.supertypes; } 
    public void setSupertypes(ArrayList<String> supertypes) { 
		 this.supertypes = supertypes; } 
    ArrayList<String> supertypes;
    
    @JsonProperty("text") 
    public String getText() { 
		 return this.text; } 
    public void setText(String text) { 
		 this.text = text; } 
    String text;
    
    @JsonProperty("type") 
    public String getType() { 
		 return this.type; } 
    public void setType(String type) { 
		 this.type = type; } 
    String type;
    
    @JsonProperty("types") 
    public ArrayList<String> getTypes() { 
		 return this.types; } 
    public void setTypes(ArrayList<String> types) { 
		 this.types = types; } 
    ArrayList<String> types;
    
    @JsonProperty("uuid") 
    public String getUuid() { 
		 return this.uuid; } 
    public void setUuid(String uuid) { 
		 this.uuid = uuid; } 
    String uuid;
    
    @JsonProperty("variations") 
    public ArrayList<String> getVariations() { 
		 return this.variations; } 
    public void setVariations(ArrayList<String> variations) { 
		 this.variations = variations; } 
    ArrayList<String> variations;
    
    @JsonProperty("imageurl")
    public String getImageUrl(){
        return String.format(IMAGE_URL_TEMPLATE, this.identifiers.getMultiverseId());
    }

}

