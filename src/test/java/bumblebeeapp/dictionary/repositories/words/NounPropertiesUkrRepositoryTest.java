package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.NounPropertiesUkr;
import bumblebeeapp.dictionary.repositories.words.NounPropertiesUkrRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class NounPropertiesUkrRepositoryTest {

    @Autowired
    NounPropertiesUkrRepository nounPropertiesUkrRepository;

    @Test
    void testGetAll() {
        List<NounPropertiesUkr> result = (List<NounPropertiesUkr>) nounPropertiesUkrRepository.findAll();

        assertTrue(result.size() > 5000);
    }

}
