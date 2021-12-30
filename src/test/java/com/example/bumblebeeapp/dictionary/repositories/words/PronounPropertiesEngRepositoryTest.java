package com.example.bumblebeeapp.dictionary.repositories.words;

import com.example.bumblebeeapp.common.entities.words.PronounPropertiesEng;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PronounPropertiesEngRepositoryTest {

    @Autowired
    PronounPropertiesEngRepository pronounPropertiesEngRepository;

    @Test
    void testGetAll() {
        List<PronounPropertiesEng> result = (List<PronounPropertiesEng>) pronounPropertiesEngRepository.findAll();

        assertEquals(12, result.size());
    }

}
