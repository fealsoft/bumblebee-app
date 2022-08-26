package bumblebeeapp.dictionary.services;

import bumblebeeapp.common.entities.geographic.CaseGeographicUkr;
import bumblebeeapp.common.entities.geographic.GeographicEng;
import bumblebeeapp.common.entities.geographic.GeographicUkr;
import bumblebeeapp.common.entities.geographic.TranslateGeographicUkr;
import bumblebeeapp.dictionary.repositories.geographic.CaseGeographicUkrRepository;
import bumblebeeapp.dictionary.repositories.geographic.GeographicEngRepository;
import bumblebeeapp.dictionary.repositories.geographic.GeographicUkrRepository;
import bumblebeeapp.dictionary.repositories.geographic.TranslateGeographicUkrRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeographicService implements IGeographicService{

    final private GeographicEngRepository geographicEngRepository;
    final private GeographicUkrRepository geographicUkrRepository;
    final private CaseGeographicUkrRepository caseGeographicUkrRepository;
    final private TranslateGeographicUkrRepository translateGeographicUkrRepository;

    public GeographicService(GeographicEngRepository geographicEngRepository, GeographicUkrRepository geographicUkrRepository, CaseGeographicUkrRepository caseGeographicUkrRepository, TranslateGeographicUkrRepository translateGeographicUkrRepository) {
        this.geographicEngRepository = geographicEngRepository;
        this.geographicUkrRepository = geographicUkrRepository;
        this.caseGeographicUkrRepository = caseGeographicUkrRepository;
        this.translateGeographicUkrRepository = translateGeographicUkrRepository;
    }

    @Override
    public List<GeographicEng> getAllEnglishGeographic() {
        return geographicEngRepository.findAllByOrderByName();
    }

    @Override
    public List<GeographicUkr> getAllUkrainianGeographic() {
        return geographicUkrRepository.findAllByOrderByName();
    }

    @Override
    public CaseGeographicUkr findByGeographicUkrId(Integer geographicUkrId) {
        return caseGeographicUkrRepository.findByGeographicUkrId(geographicUkrId);
    }

    @Override
    public TranslateGeographicUkr findTranslateByGeographicEngId(Integer geographicEngId) {
        return translateGeographicUkrRepository.findByGeographicEngId(geographicEngId);
    }
}
