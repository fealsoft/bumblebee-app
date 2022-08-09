package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.WordEng;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class WordEngRepositoryTest {

    @Autowired
    WordEngRepository wordEngRepository;

    @Test
    void testGetAll() {
        List<WordEng> result = (List<WordEng>) wordEngRepository.findAll();

        assertTrue(result.size() > 8000);
    }
}
