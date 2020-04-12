package mh.springframework.springdevops.repositories;

import mh.springframework.springdevops.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mh on 12/04/2020.
 */
public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
