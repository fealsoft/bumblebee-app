package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.CaseNounUkr;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CaseNounUkrRepositoryTest {

    @Autowired
    CaseNounUkrRepository caseNounUkrRepository;

    @Test
    void testGetAll() {
        List<CaseNounUkr> result = (List<CaseNounUkr>) caseNounUkrRepository.findAll();

        assertTrue(result.size() > 5000);
    }


}
