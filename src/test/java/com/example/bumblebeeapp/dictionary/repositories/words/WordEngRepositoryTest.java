package com.example.bumblebeeapp.dictionary.repositories.words;

import com.example.bumblebeeapp.common.entities.words.WordEng;
import com.example.bumblebeeapp.dictionary.repositories.words.WordEngRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

@SpringBootTest
public class WordEngRepositoryTest {

    @Autowired
    WordEngRepository wordEngRepository;

    @Test
    void testGetAll() {
        List<WordEng> result = (List<WordEng>) wordEngRepository.findAll();

        assertTrue(result.size() > 8000);
    }
}
