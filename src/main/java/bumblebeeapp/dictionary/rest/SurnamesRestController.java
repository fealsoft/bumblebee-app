package bumblebeeapp.dictionary.rest;

import bumblebeeapp.common.entities.surname.SurnameEng;
import bumblebeeapp.common.entities.surname.SurnameUkr;
import bumblebeeapp.dictionary.services.ISurnamesService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("surnames")
public class SurnamesRestController {

    private final ISurnamesService surnamesService;

    public SurnamesRestController(ISurnamesService surnamesService) {
        this.surnamesService = surnamesService;
    }


    @GetMapping("eng-all")
    public List<SurnameEng> allEnglishSurnames() {
        return surnamesService.getAllEnglishSurnames();
    }

    @GetMapping("ukr-all")
    public List<SurnameUkr> allUkrainianNames() {
        return surnamesService.getAllUkrainianSurnames();
    }

}
