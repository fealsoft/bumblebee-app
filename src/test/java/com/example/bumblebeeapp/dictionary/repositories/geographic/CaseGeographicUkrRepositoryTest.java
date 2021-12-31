package com.example.bumblebeeapp.dictionary.repositories.geographic;

import com.example.bumblebeeapp.common.entities.geographic.CaseGeographicUkr;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CaseGeographicUkrRepositoryTest {

    @Autowired
    CaseGeographicUkrRepository caseGeographicUkrRepository;

    @Test
    void testGetAll() {
        List<CaseGeographicUkr> result = (List<CaseGeographicUkr>) caseGeographicUkrRepository.findAll();

        assertTrue(result.size() > 200);
    }
}
