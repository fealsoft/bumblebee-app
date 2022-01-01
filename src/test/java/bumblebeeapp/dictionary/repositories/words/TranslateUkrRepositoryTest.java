package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.TranslateUkr;
import bumblebeeapp.dictionary.repositories.words.TranslateUkrRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TranslateUkrRepositoryTest {

    @Autowired
    TranslateUkrRepository translateUkrRepository;

    @Test
    void testGetAll() {
        List<TranslateUkr> result = (List<TranslateUkr>) translateUkrRepository.findAll();

        assertTrue(result.size() > 8000);
    }
}
