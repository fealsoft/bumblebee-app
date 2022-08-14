package bumblebeeapp.dictionary.services;

import bumblebeeapp.common.entities.name.NameEng;
import bumblebeeapp.common.entities.name.NameUkr;

import java.util.List;

public interface INamesService {

    List<NameEng> getAllEnglishNames();

    List<NameUkr> getAllUkrainianNames();

}
