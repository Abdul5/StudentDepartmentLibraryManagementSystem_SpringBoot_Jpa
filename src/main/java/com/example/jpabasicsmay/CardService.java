package com.example.jpabasicsmay;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CardService {
    @Autowired LibraryCardRepository libraryCardRepository;
    @Autowired StudentRepository studentRepository;

    public void addCard(LibraryCard card) throws Exception {
    }
}
