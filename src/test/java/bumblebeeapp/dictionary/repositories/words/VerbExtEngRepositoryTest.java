package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.VerbExtEng;
import bumblebeeapp.dictionary.repositories.words.VerbExtEngRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class VerbExtEngRepositoryTest {

    @Autowired
    VerbExtEngRepository verbExtEngRepository;

    @Test
    void testGetAll() {
        List<VerbExtEng> result = (List<VerbExtEng>) verbExtEngRepository.findAll();

        assertTrue(result.size() > 100);
    }
}
