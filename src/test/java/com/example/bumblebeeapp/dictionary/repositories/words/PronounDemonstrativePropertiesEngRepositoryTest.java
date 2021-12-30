package com.example.bumblebeeapp.dictionary.repositories.words;

import com.example.bumblebeeapp.common.entities.words.PronounDemonstrativePropertiesEng;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PronounDemonstrativePropertiesEngRepositoryTest {

    @Autowired
    PronounDemonstrativePropertiesEngRepository pronounDemonstrativePropertiesEngRepository;

    @Test
    void testGetAll() {
        List<PronounDemonstrativePropertiesEng> result = (List<PronounDemonstrativePropertiesEng>) pronounDemonstrativePropertiesEngRepository.findAll();

        assertEquals(4, result.size());
    }

}
