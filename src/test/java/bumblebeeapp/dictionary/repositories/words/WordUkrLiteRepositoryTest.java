package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.WordUkrLite;
import bumblebeeapp.dictionary.repositories.words.WordUkrLiteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class WordUkrLiteRepositoryTest {

    @Autowired
    WordUkrLiteRepository wordUkrLiteRepository;

    @Test
    void testGetAll() {
        List<WordUkrLite> result = (List<WordUkrLite>) wordUkrLiteRepository.findAll();

        assertTrue(result.size() > 8000);
    }
}
