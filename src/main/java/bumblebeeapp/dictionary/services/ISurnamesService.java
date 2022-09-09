package bumblebeeapp.dictionary.services;

import bumblebeeapp.common.entities.surname.CaseSurnameUkr;
import bumblebeeapp.common.entities.surname.SurnameEng;
import bumblebeeapp.common.entities.surname.SurnameUkr;

import java.util.List;

public interface ISurnamesService {

    List<SurnameEng> getAllEnglishSurnames();

    List<SurnameUkr> getAllUkrainianSurnames();

    CaseSurnameUkr findBySurnameUkrId(Integer surnameUkrId);

}
