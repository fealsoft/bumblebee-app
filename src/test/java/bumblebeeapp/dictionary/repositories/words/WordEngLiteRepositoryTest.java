package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.WordEngLite;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class WordEngLiteRepositoryTest {

    @Autowired
    WordEngLiteRepository wordEngLiteRepository;

    @Test
    void testGetAll() {
        List<WordEngLite> result = (List<WordEngLite>) wordEngLiteRepository.findAll();

        assertTrue(result.size() > 8000);
    }

}
