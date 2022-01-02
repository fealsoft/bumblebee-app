package bumblebeeapp.dictionary.repositories.name;

import bumblebeeapp.common.entities.name.TranslateNameUkr;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TranslateNameUkrRepositoryTest {

    @Autowired
    TranslateNameUkrRepository translateNameUkrRepository;

    @Test
    void testGetAll() {
        List<TranslateNameUkr> result = (List<TranslateNameUkr>) translateNameUkrRepository.findAll();

        assertTrue(result.size() > 200);
    }
}
