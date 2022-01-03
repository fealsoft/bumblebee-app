package bumblebeeapp.dictionary.repositories.surname;

import bumblebeeapp.common.entities.surname.SurnameUkr;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class SurnameUkrRepositoryTest {

    @Autowired
    SurnameUkrRepository surnameUkrRepository;

    @Test
    void testGetAll() {
        List<SurnameUkr> result = (List<SurnameUkr>) surnameUkrRepository.findAll();

        assertTrue(result.size() > 20);
    }
}
