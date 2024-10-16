package com.example.restservice.controllers;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.restservice.models.Card;
import com.example.restservice.services.CardService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CardController {
	@RequestMapping("/")
	public Card home() {
		var firstCard = CardService.first();
		if (firstCard == null){
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No card data present");
		}else{
			return firstCard;
		}
	}

	@GetMapping("/api/first")
	public Card first() {
		var firstCard = CardService.first();
		if (firstCard == null){
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No card data present");
		}else{
			return firstCard;
		}
	}

	@GetMapping("/api/previous")
	public Card previous(@RequestParam Integer listPosition) {
		var card = CardService.previous(listPosition);
		return card;
	}
	@GetMapping("/api/next")
	public Card next(@RequestParam Integer listPosition) {
		var card = CardService.next(listPosition);
		return card;
	}
	

	@GetMapping("/api/last")
	public Card last() {
		var lastCard = CardService.last();
		if (lastCard == null){
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No card data present");
		}else{
			return lastCard;
		}
	}
	
	@GetMapping("/api/random")
	public Card random() {
		var random = new Random();
		var randomNumber = random.nextInt(CardService.getCount());
		System.out.println("Random Is: " + randomNumber);
		return CardService.getByPosition(randomNumber);
	}

	/**
	 * Returns the first card in the collection that contains the entered value in the name
	 * @param name
	 * @return
	 */
	@GetMapping("/api/searchname")
	public Card search(@RequestParam String name) {
		return CardService.findByName(name).findFirst().orElse(null);
	}
}