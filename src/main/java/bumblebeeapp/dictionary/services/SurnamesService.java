package bumblebeeapp.dictionary.services;

import bumblebeeapp.common.entities.surname.SurnameEng;
import bumblebeeapp.common.entities.surname.SurnameUkr;
import bumblebeeapp.dictionary.repositories.surname.SurnameEngRepository;
import bumblebeeapp.dictionary.repositories.surname.SurnameUkrRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurnamesService implements ISurnamesService {

    final private SurnameEngRepository surnameEngRepository;
    final private SurnameUkrRepository surnameUkrRepository;

    public SurnamesService(SurnameEngRepository surnameEngRepository, SurnameUkrRepository surnameUkrRepository) {
        this.surnameEngRepository = surnameEngRepository;
        this.surnameUkrRepository = surnameUkrRepository;
    }

    @Override
    public List<SurnameEng> getAllEnglishSurnames() {
        return surnameEngRepository.findAllByOrderBySurname();
    }

    @Override
    public List<SurnameUkr> getAllUkrainianSurnames() {
        return surnameUkrRepository.findAllByOrderBySurname();
    }
}
