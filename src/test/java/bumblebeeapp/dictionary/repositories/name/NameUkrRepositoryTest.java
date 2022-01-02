package bumblebeeapp.dictionary.repositories.name;

import bumblebeeapp.common.entities.name.NameUkr;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class NameUkrRepositoryTest {

    @Autowired
    NameUkrRepository nameUkrRepository;

    @Test
    void testGetAll() {
        List<NameUkr> result = (List<NameUkr>) nameUkrRepository.findAll();

        assertTrue(result.size() > 200);
    }
}
