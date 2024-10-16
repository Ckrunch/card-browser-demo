package com.example.restservice.models;

import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1

public class Legalities{
    @JsonProperty("alchemy") 
    public String getAlchemy() { 
		 return this.alchemy; } 
    public void setAlchemy(String alchemy) { 
		 this.alchemy = alchemy; } 
    String alchemy;
    
    @JsonProperty("brawl") 
    public String getBrawl() { 
		 return this.brawl; } 
    public void setBrawl(String brawl) { 
		 this.brawl = brawl; } 
    String brawl;
    
    @JsonProperty("commander") 
    public String getCommander() { 
		 return this.commander; } 
    public void setCommander(String commander) { 
		 this.commander = commander; } 
    String commander;
    
    @JsonProperty("duel") 
    public String getDuel() { 
		 return this.duel; } 
    public void setDuel(String duel) { 
		 this.duel = duel; } 
    String duel;
    
    @JsonProperty("explorer") 
    public String getExplorer() { 
		 return this.explorer; } 
    public void setExplorer(String explorer) { 
		 this.explorer = explorer; } 
    String explorer;
    
    @JsonProperty("future") 
    public String getFuture() { 
		 return this.future; } 
    public void setFuture(String future) { 
		 this.future = future; } 
    String future;
    
    @JsonProperty("gladiator") 
    public String getGladiator() { 
		 return this.gladiator; } 
    public void setGladiator(String gladiator) { 
		 this.gladiator = gladiator; } 
    String gladiator;
    
    @JsonProperty("historic") 
    public String getHistoric() { 
		 return this.historic; } 
    public void setHistoric(String historic) { 
		 this.historic = historic; } 
    String historic;
   
    @JsonProperty("legacy") 
    public String getLegacy() { 
		 return this.legacy; } 
    public void setLegacy(String legacy) { 
		 this.legacy = legacy; } 
    String legacy;
   
    @JsonProperty("modern") 
    public String getModern() { 
		 return this.modern; } 
    public void setModern(String modern) { 
		 this.modern = modern; } 
    String modern;
  
    @JsonProperty("oathbreaker") 
    public String getOathbreaker() { 
		 return this.oathbreaker; } 
    public void setOathbreaker(String oathbreaker) { 
		 this.oathbreaker = oathbreaker; } 
    String oathbreaker;
 
    @JsonProperty("pioneer") 
    public String getPioneer() { 
		 return this.pioneer; } 
    public void setPioneer(String pioneer) { 
		 this.pioneer = pioneer; } 
    String pioneer;
  
    @JsonProperty("standard") 
    public String getStandard() { 
		 return this.standard; } 
    public void setStandard(String standard) { 
		 this.standard = standard; } 
    String standard;
  
    @JsonProperty("standardbrawl") 
    public String getStandardbrawl() { 
		 return this.standardbrawl; } 
    public void setStandardbrawl(String standardbrawl) { 
		 this.standardbrawl = standardbrawl; } 
    String standardbrawl;
  
    @JsonProperty("timeless") 
    public String getTimeless() { 
		 return this.timeless; } 
    public void setTimeless(String timeless) { 
		 this.timeless = timeless; } 
    String timeless;
   
    @JsonProperty("vintage") 
    public String getVintage() { 
		 return this.vintage; } 
    public void setVintage(String vintage) { 
		 this.vintage = vintage; } 
    String vintage;
}