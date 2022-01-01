package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.CasePronounDemonstrativeUkr;
import bumblebeeapp.common.entities.words.CasePronounPersonalUkr;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CasePronounPersonalUkrRepositoryTest {

    @Autowired
    CasePronounPersonalUkrRepository casePronounPersonalUkrRepository;

    @Test
    void testGetAll() {
        List<CasePronounPersonalUkr> result = (List<CasePronounPersonalUkr>) casePronounPersonalUkrRepository.findAll();

        assertEquals(8, result.size());
    }
}
