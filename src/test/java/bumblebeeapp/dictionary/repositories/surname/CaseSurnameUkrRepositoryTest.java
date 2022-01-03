package bumblebeeapp.dictionary.repositories.surname;

import bumblebeeapp.common.entities.surname.CaseSurnameUkr;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CaseSurnameUkrRepositoryTest {

    @Autowired
    CaseSurnameUkrRepository caseSurnameUkrRepository;

    @Test
    void testGetAll() {
        List<CaseSurnameUkr> result = (List<CaseSurnameUkr>) caseSurnameUkrRepository.findAll();

        assertTrue(result.size() > 20);
    }
}
