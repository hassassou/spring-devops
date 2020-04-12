package mh.springframework.springdevops.repositories;

import mh.springframework.springdevops.domain.ProductCategory;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mh on 12/04/2020.
 */
public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Integer> {
}
