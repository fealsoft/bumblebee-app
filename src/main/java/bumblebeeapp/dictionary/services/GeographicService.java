package bumblebeeapp.dictionary.services;

import bumblebeeapp.common.entities.geographic.GeographicEng;
import bumblebeeapp.common.entities.geographic.GeographicUkr;
import bumblebeeapp.dictionary.repositories.geographic.GeographicEngRepository;
import bumblebeeapp.dictionary.repositories.geographic.GeographicUkrRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeographicService implements IGeographicService{

    final private GeographicEngRepository geographicEngRepository;
    final private GeographicUkrRepository geographicUkrRepository;

    public GeographicService(GeographicEngRepository geographicEngRepository, GeographicUkrRepository geographicUkrRepository) {
        this.geographicEngRepository = geographicEngRepository;
        this.geographicUkrRepository = geographicUkrRepository;
    }

    @Override
    public List<GeographicEng> getAllEnglishGeographic() {
        return geographicEngRepository.findAllByOrderByName();
    }

    @Override
    public List<GeographicUkr> getAllUkrainianGeographic() {
        return geographicUkrRepository.findAllByOrderByName();
    }
}
