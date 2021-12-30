package com.example.bumblebeeapp.dictionary.repositories.words;

import com.example.bumblebeeapp.common.entities.words.PronounPossessivePropertiesEng;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PronounPossessivePropertiesEngRepositoryTest {

    @Autowired
    PronounPossessivePropertiesEngRepository pronounPossessivePropertiesEngRepository;

    @Test
    void testGetAll() {
        List<PronounPossessivePropertiesEng> result = (List<PronounPossessivePropertiesEng>) pronounPossessivePropertiesEngRepository.findAll();

        assertEquals(12, result.size());
    }
}
