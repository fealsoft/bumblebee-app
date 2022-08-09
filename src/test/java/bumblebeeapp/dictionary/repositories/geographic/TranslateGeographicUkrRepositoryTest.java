package bumblebeeapp.dictionary.repositories.geographic;

import bumblebeeapp.common.entities.geographic.TranslateGeographicUkr;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TranslateGeographicUkrRepositoryTest {

    @Autowired
    TranslateGeographicUkrRepository translateGeographicUkrRepository;

    @Test
    void testGetAll() {
        List<TranslateGeographicUkr> result = (List<TranslateGeographicUkr>) translateGeographicUkrRepository.findAll();

        assertTrue(result.size() > 200);
    }

}
