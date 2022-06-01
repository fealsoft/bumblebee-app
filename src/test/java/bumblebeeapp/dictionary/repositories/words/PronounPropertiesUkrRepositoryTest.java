package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.PronounPropertiesUkr;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PronounPropertiesUkrRepositoryTest {

    @Autowired
    PronounPropertiesUkrRepository pronounPropertiesUkrRepository;

    @Test
    void testGetAll() {
        List<PronounPropertiesUkr> result = (List<PronounPropertiesUkr>) pronounPropertiesUkrRepository.findAll();

        assertEquals(8, result.size());
    }
}
