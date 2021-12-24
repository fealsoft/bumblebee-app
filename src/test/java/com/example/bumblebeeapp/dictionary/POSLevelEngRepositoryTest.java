package com.example.bumblebeeapp.dictionary;

import com.example.bumblebeeapp.common.entities.POSLevelEng;
import com.example.bumblebeeapp.dictionary.repositories.POSLevelEngRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class POSLevelEngRepositoryTest {


    @Autowired
    POSLevelEngRepository posLevelEngRepository;

    @Test
    void testGetAll() {
        List<POSLevelEng> result = (List<POSLevelEng>) posLevelEngRepository.findAll();

        assertTrue(result.size() > 8000);
    }

}
