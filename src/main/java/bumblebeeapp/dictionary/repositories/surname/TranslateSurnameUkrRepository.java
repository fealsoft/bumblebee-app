package bumblebeeapp.dictionary.repositories.surname;

import bumblebeeapp.common.entities.surname.TranslateSurnameUkr;
import org.springframework.data.repository.CrudRepository;

public interface TranslateSurnameUkrRepository extends CrudRepository<TranslateSurnameUkr, Integer> {

    TranslateSurnameUkr findTranslateBySurnameEngId(Integer surnameEngId);

}
