package com.example.bumblebeeapp.dictionary;

import com.example.bumblebeeapp.common.entities.DetailLevelEng;
import com.example.bumblebeeapp.dictionary.repositories.DetailLevelEngRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class DetailLevelEngRepositoryTest {

    @Autowired
    DetailLevelEngRepository detailLevelEngRepository;

    @Test
    void testGetAll() {
        List<DetailLevelEng> result = (List<DetailLevelEng>) detailLevelEngRepository.findAll();

        assertTrue(result.size() > 8000);
    }

}
