package bumblebeeapp.dictionary.services;

import bumblebeeapp.common.entities.name.NameEng;
import bumblebeeapp.common.entities.name.NameUkr;
import bumblebeeapp.dictionary.repositories.name.NameEngRepository;
import bumblebeeapp.dictionary.repositories.name.NameUkrRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NamesService implements INamesService {

    final private NameEngRepository nameEngRepository;
    final private NameUkrRepository nameUkrRepository;

    public NamesService(NameEngRepository nameEngRepository, NameUkrRepository nameUkrRepository) {
        this.nameEngRepository = nameEngRepository;
        this.nameUkrRepository = nameUkrRepository;
    }

    @Override
    public List<NameEng> getAllEnglishNames() {
        return nameEngRepository.findAllByOrderByName();
    }

    @Override
    public List<NameUkr> getAllUkrainianNames() {
        return nameUkrRepository.findAllByOrderByName();
    }
}
