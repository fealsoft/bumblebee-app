package bumblebeeapp.dictionary.services;

import bumblebeeapp.common.entities.geographic.CaseGeographicUkrLite;
import bumblebeeapp.common.entities.geographic.GeographicEng;
import bumblebeeapp.common.entities.geographic.GeographicUkr;
import bumblebeeapp.dictionary.repositories.geographic.CaseGeographicUkrLiteRepository;
import bumblebeeapp.dictionary.repositories.geographic.GeographicEngRepository;
import bumblebeeapp.dictionary.repositories.geographic.GeographicUkrRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeographicService implements IGeographicService{

    final private GeographicEngRepository geographicEngRepository;
    final private GeographicUkrRepository geographicUkrRepository;
    final private CaseGeographicUkrLiteRepository caseGeographicUkrLiteRepository;

    public GeographicService(GeographicEngRepository geographicEngRepository, GeographicUkrRepository geographicUkrRepository, CaseGeographicUkrLiteRepository caseGeographicUkrLiteRepository) {
        this.geographicEngRepository = geographicEngRepository;
        this.geographicUkrRepository = geographicUkrRepository;
        this.caseGeographicUkrLiteRepository = caseGeographicUkrLiteRepository;
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
    public CaseGeographicUkrLite findByGeographicUkrId(Integer geographicUkrId) {
        return caseGeographicUkrLiteRepository.findByGeographicUkrId(geographicUkrId);
    }
}
