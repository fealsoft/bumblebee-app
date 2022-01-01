package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.CasePronounDemonstrativeUkr;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CasePronounDemonstrativeUkrRepositoryTest {

    @Autowired
    CasePronounDemonstrativeUkrRepository casePronounDemonstrativeUkrRepository;

    @Test
    void testGetAll() {
        List<CasePronounDemonstrativeUkr> result = (List<CasePronounDemonstrativeUkr>) casePronounDemonstrativeUkrRepository.findAll();

        assertEquals(2, result.size());
    }
}
