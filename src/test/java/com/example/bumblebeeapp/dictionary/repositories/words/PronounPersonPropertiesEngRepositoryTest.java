package com.example.bumblebeeapp.dictionary.repositories.words;

import com.example.bumblebeeapp.common.entities.words.PronounPersonPropertiesEng;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PronounPersonPropertiesEngRepositoryTest {

    @Autowired
    PronounPersonPropertiesEngRepository pronounPersonPropertiesEngRepository;

    @Test
    void testGetAll() {
        List<PronounPersonPropertiesEng> result = (List<PronounPersonPropertiesEng>) pronounPersonPropertiesEngRepository.findAll();

        assertEquals(12, result.size());
    }

}
