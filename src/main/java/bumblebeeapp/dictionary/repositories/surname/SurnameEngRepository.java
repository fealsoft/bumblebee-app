package bumblebeeapp.dictionary.repositories.surname;

import bumblebeeapp.common.entities.surname.SurnameEng;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SurnameEngRepository extends CrudRepository<SurnameEng, Integer> {

    List<SurnameEng> findAllByOrderBySurname();

}
