package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.CasePronounPossessiveUkr;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CasePronounPossessiveUkrRepositoryTest {

    @Autowired
    CasePronounPossessiveUkrRepository casePronounPossessiveUkrRepository;

    @Test
    void testGetAll() {
        List<CasePronounPossessiveUkr> result = (List<CasePronounPossessiveUkr>) casePronounPossessiveUkrRepository.findAll();

        assertEquals(3, result.size());;
    }

}
