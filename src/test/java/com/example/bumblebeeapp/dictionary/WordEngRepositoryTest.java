package com.example.bumblebeeapp.dictionary;

import com.example.bumblebeeapp.common.entities.WordEng;
import com.example.bumblebeeapp.dictionary.repositories.WordEngRepository;
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
