package bumblebeeapp.dictionary.services;

import bumblebeeapp.common.entities.surname.CaseSurnameUkr;
import bumblebeeapp.common.entities.surname.SurnameEng;
import bumblebeeapp.common.entities.surname.SurnameUkr;
import bumblebeeapp.dictionary.repositories.surname.CaseSurnameUkrRepository;
import bumblebeeapp.dictionary.repositories.surname.SurnameEngRepository;
import bumblebeeapp.dictionary.repositories.surname.SurnameUkrRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurnamesService implements ISurnamesService {

    final private SurnameEngRepository surnameEngRepository;
    final private SurnameUkrRepository surnameUkrRepository;
    final private CaseSurnameUkrRepository caseSurnameUkrRepository;

    public SurnamesService(SurnameEngRepository surnameEngRepository, SurnameUkrRepository surnameUkrRepository, CaseSurnameUkrRepository caseSurnameUkrRepository) {
        this.surnameEngRepository = surnameEngRepository;
        this.surnameUkrRepository = surnameUkrRepository;
        this.caseSurnameUkrRepository = caseSurnameUkrRepository;
    }

    @Override
    public List<SurnameEng> getAllEnglishSurnames() {
        return surnameEngRepository.findAllByOrderBySurname();
    }

    @Override
    public List<SurnameUkr> getAllUkrainianSurnames() {
        return surnameUkrRepository.findAllByOrderBySurname();
    }

    @Override
    public CaseSurnameUkr findBySurnameUkrId(Integer surnameUkrId) {
        return caseSurnameUkrRepository.findBySurnameUkrId(surnameUkrId);
    }

}
