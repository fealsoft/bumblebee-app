package bumblebeeapp.dictionary.repositories.surname;

import bumblebeeapp.common.entities.surname.SurnameEng;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class SurnameEngRepositoryTest {

    @Autowired
    SurnameEngRepository surnameEngRepository;

    @Test
    void testGetAll() {
        List<SurnameEng> result = (List<SurnameEng>) surnameEngRepository.findAll();

        assertTrue(result.size() > 20);
    }
}
