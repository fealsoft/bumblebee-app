package bumblebeeapp.dictionary.repositories.geographic;

import bumblebeeapp.common.entities.geographic.GeographicEng;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class GeographicEngRepositoryTest {

    @Autowired
    GeographicEngRepository geographicEngRepository;

    @Test
    void testGetAll() {
        List<GeographicEng> result = (List<GeographicEng>) geographicEngRepository.findAll();

        assertTrue(result.size() > 200);
    }
}
