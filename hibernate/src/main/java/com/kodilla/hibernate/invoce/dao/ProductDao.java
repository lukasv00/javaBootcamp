package com.kodilla.hibernate.invoce.dao;

import com.kodilla.hibernate.invoce.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {

}
