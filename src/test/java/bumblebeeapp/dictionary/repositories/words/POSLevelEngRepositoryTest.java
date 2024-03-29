package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.POSLevelEng;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class POSLevelEngRepositoryTest {


    @Autowired
    POSLevelEngRepository posLevelEngRepository;

    @Test
    void testGetAll() {
        List<POSLevelEng> result = (List<POSLevelEng>) posLevelEngRepository.findAll();

        assertTrue(result.size() > 8000);
    }

    @Test
    void testFindPOSLevelEngByWordEngId() {
        List<POSLevelEng> result = posLevelEngRepository.findPOSLevelEngByWordEngId(1);

        assertEquals(2, result.size());
    }
}
