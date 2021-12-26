package com.example.bumblebeeapp.dictionary.repositories.words;

import com.example.bumblebeeapp.common.entities.words.WordUkr;
import com.example.bumblebeeapp.dictionary.repositories.words.WordUkrRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class WordUkrRepositoryTest {

    @Autowired
    WordUkrRepository wordUkrRepository;

    @Test
    void testGetAll() {
        List<WordUkr> result = (List<WordUkr>) wordUkrRepository.findAll();

        assertTrue(result.size() > 8000);
    }
}
