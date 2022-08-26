package bumblebeeapp.dictionary.services;

import bumblebeeapp.common.entities.name.CaseNameUkr;
import bumblebeeapp.common.entities.name.NameEng;
import bumblebeeapp.common.entities.name.NameUkr;
import bumblebeeapp.common.entities.name.TranslateNameUkr;
import bumblebeeapp.dictionary.repositories.name.CaseNameUkrRepository;
import bumblebeeapp.dictionary.repositories.name.NameEngRepository;
import bumblebeeapp.dictionary.repositories.name.NameUkrRepository;
import bumblebeeapp.dictionary.repositories.name.TranslateNameUkrRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NamesService implements INamesService {

    final private NameEngRepository nameEngRepository;
    final private NameUkrRepository nameUkrRepository;
    final private CaseNameUkrRepository caseNameUkrRepository;
    final private TranslateNameUkrRepository translateNameUkrRepository;

    public NamesService(NameEngRepository nameEngRepository, NameUkrRepository nameUkrRepository, CaseNameUkrRepository caseNameUkrRepository, TranslateNameUkrRepository translateNameUkrRepository) {
        this.nameEngRepository = nameEngRepository;
        this.nameUkrRepository = nameUkrRepository;
        this.caseNameUkrRepository = caseNameUkrRepository;
        this.translateNameUkrRepository = translateNameUkrRepository;
    }


    @Override
    public List<NameEng> getAllEnglishNames() {
        return nameEngRepository.findAllByOrderByName();
    }

    @Override
    public List<NameUkr> getAllUkrainianNames() {
        return nameUkrRepository.findAllByOrderByName();
    }

    @Override
    public CaseNameUkr findByNameUkrId(Integer nameUkrId) {
        return caseNameUkrRepository.findByNameUkrId(nameUkrId);
    }

    @Override
    public List<TranslateNameUkr> findTranslateByNameEngId(Integer nameEngId) {
        return translateNameUkrRepository.findAllByNameEngId(nameEngId);
    }
}
