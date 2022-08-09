package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.CaseCardinalNumberUkr;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CaseCardinalNumberUkrRepositoryTest {

    @Autowired
    CaseCardinalNumberUkrRepository caseCardinalNumberUkrRepository;

    @Test
    void testGetAll() {
        List<CaseCardinalNumberUkr> result = (List<CaseCardinalNumberUkr>) caseCardinalNumberUkrRepository.findAll();

        assertTrue(result.size() > 20);
    }

}
