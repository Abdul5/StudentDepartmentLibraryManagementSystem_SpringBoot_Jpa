package com.example.jpabasicsmay.controller;


import com.example.jpabasicsmay.CardService;
import com.example.jpabasicsmay.LibraryCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class CardController {
    @Autowired
    CardService cardService;
    @PostMapping("/add")
    public String addCard(@RequestBody LibraryCard card) throws Exception {
        cardService.addCard(card);
        return "Card added";
    }
}
