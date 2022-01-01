package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.CaseSuperlativeSimpleAdjectiveUkr;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CaseSuperlativeSimpleAdjectiveUkrRepositoryTest {

    @Autowired
    CaseSuperlativeSimpleAdjectiveUkrRepository caseSuperlativeSimpleAdjectiveUkrRepository;

    @Test
    void testGetAll() {
        List<CaseSuperlativeSimpleAdjectiveUkr> result = (List<CaseSuperlativeSimpleAdjectiveUkr>) caseSuperlativeSimpleAdjectiveUkrRepository.findAll();

        assertTrue(result.size() > 1);
    }
}
