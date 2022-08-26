package bumblebeeapp.dictionary.services;

import bumblebeeapp.common.entities.name.CaseNameUkr;
import bumblebeeapp.common.entities.name.NameEng;
import bumblebeeapp.common.entities.name.NameUkr;
import bumblebeeapp.common.entities.name.TranslateNameUkr;

import java.util.List;

public interface INamesService {

    List<NameEng> getAllEnglishNames();

    List<NameUkr> getAllUkrainianNames();

    CaseNameUkr findByNameUkrId(Integer nameUkrId);

    List<TranslateNameUkr> findTranslateByNameEngId(Integer nameEngId);

}
