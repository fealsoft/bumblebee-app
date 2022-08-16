package bumblebeeapp.dictionary.repositories.surname;

import bumblebeeapp.common.entities.surname.SurnameUkr;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SurnameUkrRepository extends CrudRepository<SurnameUkr, Integer> {

    List<SurnameUkr> findAllByOrderBySurname();

}
