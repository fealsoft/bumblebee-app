package bumblebeeapp.dictionary.repositories.surname;

import bumblebeeapp.common.entities.surname.TranslateSurnameUkr;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TranslateSurnameUkrRepositoryTest {

    @Autowired
    TranslateSurnameUkrRepository translateSurnameUkrRepository;

    @Test
    void testGetAll() {
        List<TranslateSurnameUkr> result = (List<TranslateSurnameUkr>) translateSurnameUkrRepository.findAll();

        assertTrue(result.size() > 20);
    }
}
