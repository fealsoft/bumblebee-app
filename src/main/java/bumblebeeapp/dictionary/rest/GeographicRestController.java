package bumblebeeapp.dictionary.rest;

import bumblebeeapp.common.entities.geographic.GeographicEng;
import bumblebeeapp.common.entities.geographic.GeographicUkr;
import bumblebeeapp.dictionary.services.IGeographicService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("geographic")
public class GeographicRestController {

    private final IGeographicService geographicService;

    public GeographicRestController(IGeographicService geographicService) {
        this.geographicService = geographicService;
    }

    @GetMapping("eng-all")
    public List<GeographicEng> allEnglishGeographic() {
        return geographicService.getAllEnglishGeographic();
    }

    @GetMapping("ukr-all")
    public List<GeographicUkr> allUkrainianGeographic() {
        return geographicService.getAllUkrainianGeographic();
    }

}
