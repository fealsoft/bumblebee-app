package bumblebeeapp.dictionary.rest;

import bumblebeeapp.common.entities.geographic.CaseGeographicUkr;
import bumblebeeapp.common.entities.geographic.GeographicEng;
import bumblebeeapp.common.entities.geographic.GeographicUkr;
import bumblebeeapp.common.entities.geographic.TranslateGeographicUkr;
import bumblebeeapp.dictionary.services.IGeographicService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("case-ukr")
    public CaseGeographicUkr caseGeographicUkr(@RequestParam Integer geographicUkrId) {
        return geographicService.findByGeographicUkrId(geographicUkrId);
    }

    @GetMapping("translate")
    public GeographicUkr translate(@RequestParam Integer geographicEngId) {

        TranslateGeographicUkr translateGeographicUkr = geographicService.findTranslateByGeographicEngId(geographicEngId);

        return translateGeographicUkr != null ? translateGeographicUkr.getGeographicUkr() : null;
    }
}
