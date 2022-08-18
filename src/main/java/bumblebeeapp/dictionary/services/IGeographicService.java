package bumblebeeapp.dictionary.services;

import bumblebeeapp.common.entities.geographic.CaseGeographicUkrLite;
import bumblebeeapp.common.entities.geographic.GeographicEng;
import bumblebeeapp.common.entities.geographic.GeographicUkr;
import bumblebeeapp.common.entities.geographic.TranslateGeographicUkr;

import java.util.List;

public interface IGeographicService {

    List<GeographicEng> getAllEnglishGeographic();

    List<GeographicUkr> getAllUkrainianGeographic();

    CaseGeographicUkrLite findByGeographicUkrId(Integer GeographicUkrId);

    TranslateGeographicUkr findTranslateByGeographicEngId(Integer geographicEngId);

}
