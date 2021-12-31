package com.example.bumblebeeapp.dictionary.repositories.geographic;

import com.example.bumblebeeapp.common.entities.geographic.GeographicUkr;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class GeographicUkrRepositoryTest {

    @Autowired
    GeographicUkrRepository geographicUkrRepository;

    @Test
    void testGetAll() {
        List<GeographicUkr> result = (List<GeographicUkr>) geographicUkrRepository.findAll();

        assertTrue(result.size() > 200);
    }
}
