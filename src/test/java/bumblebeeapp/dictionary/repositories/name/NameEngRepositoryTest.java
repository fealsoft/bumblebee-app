package bumblebeeapp.dictionary.repositories.name;

import bumblebeeapp.common.entities.name.NameEng;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class NameEngRepositoryTest {

    @Autowired
    NameEngRepository nameEngRepository;

    @Test
    void testGetAll() {
        List<NameEng> result = (List<NameEng>) nameEngRepository.findAll();

        assertTrue(result.size() > 200);
    }
}
