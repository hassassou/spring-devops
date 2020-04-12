package mh.springframework.springdevops.repositories;

import mh.springframework.springdevops.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mh on 12/04/2020.
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
