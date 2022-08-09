package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.CaseAdjectiveUkr;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CaseAdjectiveUkrRepositoryTest {

    @Autowired
    CaseAdjectiveUkrRepository caseAdjectiveUkrRepository;

    @Test
    void testGetAll() {
        List<CaseAdjectiveUkr> result = (List<CaseAdjectiveUkr>) caseAdjectiveUkrRepository.findAll();

        assertTrue(result.size() > 1000);
    }

}
