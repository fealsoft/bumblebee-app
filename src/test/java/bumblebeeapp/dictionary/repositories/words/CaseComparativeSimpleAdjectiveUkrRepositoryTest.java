package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.CaseComparativeSimpleAdjectiveUkr;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CaseComparativeSimpleAdjectiveUkrRepositoryTest {

    @Autowired
    CaseComparativeSimpleAdjectiveUkrRepository caseComparativeSimpleAdjectiveUkrRepository;

    @Test
    void testGetAll() {
        List<CaseComparativeSimpleAdjectiveUkr> result = (List<CaseComparativeSimpleAdjectiveUkr>) caseComparativeSimpleAdjectiveUkrRepository.findAll();

        assertTrue(result.size() > 100);
    }

}
