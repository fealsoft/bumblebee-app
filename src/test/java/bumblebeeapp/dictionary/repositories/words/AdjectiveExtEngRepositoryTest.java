package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.AdjectiveExtEng;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class AdjectiveExtEngRepositoryTest {

    @Autowired
    AdjectiveExtEngRepository adjectiveExtEngRepository;

    @Test
    void testGetAll() {
        List<AdjectiveExtEng> result = (List<AdjectiveExtEng>) adjectiveExtEngRepository.findAll();

        assertTrue(result.size() > 200);
    }


}
