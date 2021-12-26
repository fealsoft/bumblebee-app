package com.example.bumblebeeapp.dictionary.repositories.words;

import com.example.bumblebeeapp.common.entities.words.WordEngLite;
import com.example.bumblebeeapp.dictionary.repositories.words.WordEngLiteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class WordEngLiteRepositoryTest {

    @Autowired
    WordEngLiteRepository wordEngLiteRepository;

    @Test
    void testGetAll() {
        List<WordEngLite> result = (List<WordEngLite>) wordEngLiteRepository.findAll();

        assertTrue(result.size() > 8000);
    }

}
