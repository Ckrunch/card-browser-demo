package com.example.restservice.models;

import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1

public class Identifiers{
    
    @JsonProperty("multiverseId") 
    public String getMultiverseId() { 
		 return this.multiverseId; } 
    public void setMultiverseId(String multiverseId) { 
		 this.multiverseId = multiverseId; } 
    String multiverseId;
    
    @JsonProperty("scryfallId") 
    public String getScryfallId() { 
		 return this.scryfallId; } 
    public void setScryfallId(String scryfallId) { 
		 this.scryfallId = scryfallId; } 
    String scryfallId;
   
    @JsonProperty("cardKingdomFoilId") 
    public String getCardKingdomFoilId() { 
		 return this.cardKingdomFoilId; } 
    public void setCardKingdomFoilId(String cardKingdomFoilId) { 
		 this.cardKingdomFoilId = cardKingdomFoilId; } 
    String cardKingdomFoilId;
  
    @JsonProperty("cardKingdomId") 
    public String getCardKingdomId() { 
		 return this.cardKingdomId; } 
    public void setCardKingdomId(String cardKingdomId) { 
		 this.cardKingdomId = cardKingdomId; } 
    String cardKingdomId;
   
    @JsonProperty("cardsphereId") 
    public String getCardsphereId() { 
		 return this.cardsphereId; } 
    public void setCardsphereId(String cardsphereId) { 
		 this.cardsphereId = cardsphereId; } 
    String cardsphereId;
   
    @JsonProperty("mtgArenaId") 
    public String getMtgArenaId() { 
		 return this.mtgArenaId; } 
    public void setMtgArenaId(String mtgArenaId) { 
		 this.mtgArenaId = mtgArenaId; } 
    String mtgArenaId;
 
    @JsonProperty("mtgjsonV4Id") 
    public String getMtgjsonV4Id() { 
		 return this.mtgjsonV4Id; } 
    public void setMtgjsonV4Id(String mtgjsonV4Id) { 
		 this.mtgjsonV4Id = mtgjsonV4Id; } 
    String mtgjsonV4Id;
  
    @JsonProperty("mtgoId") 
    public String getMtgoId() { 
		 return this.mtgoId; } 
    public void setMtgoId(String mtgoId) { 
		 this.mtgoId = mtgoId; } 
    String mtgoId;
  
    @JsonProperty("scryfallCardBackId") 
    public String getScryfallCardBackId() { 
		 return this.scryfallCardBackId; } 
    public void setScryfallCardBackId(String scryfallCardBackId) { 
		 this.scryfallCardBackId = scryfallCardBackId; } 
    String scryfallCardBackId;
  
    @JsonProperty("scryfallIllustrationId") 
    public String getScryfallIllustrationId() { 
		 return this.scryfallIllustrationId; } 
    public void setScryfallIllustrationId(String scryfallIllustrationId) { 
		 this.scryfallIllustrationId = scryfallIllustrationId; } 
    String scryfallIllustrationId;
  
    @JsonProperty("scryfallOracleId") 
    public String getScryfallOracleId() { 
		 return this.scryfallOracleId; } 
    public void setScryfallOracleId(String scryfallOracleId) { 
		 this.scryfallOracleId = scryfallOracleId; } 
    String scryfallOracleId;
  
    @JsonProperty("tcgplayerProductId") 
    public String getTcgplayerProductId() { 
		 return this.tcgplayerProductId; } 
    public void setTcgplayerProductId(String tcgplayerProductId) { 
		 this.tcgplayerProductId = tcgplayerProductId; } 
    String tcgplayerProductId;
}