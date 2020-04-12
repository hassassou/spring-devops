package mh.springframework.springdevops.services;


import mh.springframework.springdevops.domain.Product;

import java.util.List;

/**
 * Created by mh on 12/04/2020.
 */
public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}
