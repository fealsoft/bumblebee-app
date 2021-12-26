package com.example.bumblebeeapp.dictionary.repositories.words;

import com.example.bumblebeeapp.common.entities.words.NounExtEng;
import com.example.bumblebeeapp.dictionary.repositories.words.NounExtEngRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class NounExtEngRepositoryTest {

    @Autowired
    NounExtEngRepository nounExtEngRepository;

    @Test
    void testGetAll() {
        List<NounExtEng> result = (List<NounExtEng>) nounExtEngRepository.findAll();

        assertTrue(result.size() > 5000);
    }

}
