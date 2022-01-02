package bumblebeeapp.dictionary.repositories.name;

import bumblebeeapp.common.entities.name.CaseNameUkr;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CaseNameUkrRepositoryTest {

    @Autowired
    CaseNameUkrRepository caseNameUkrRepository;

    @Test
    void testGetAll() {
        List<CaseNameUkr> result = (List<CaseNameUkr>) caseNameUkrRepository.findAll();

        assertTrue(result.size() > 200);
    }
}
