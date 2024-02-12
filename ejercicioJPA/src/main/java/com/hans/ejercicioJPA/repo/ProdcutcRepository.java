package com.hans.ejercicioJPA.repo;

import org.springframework.data.repository.CrudRepository;

import com.hans.ejercicioJPA.entities.Products;

public interface ProdcutcRepository extends CrudRepository<Products, Long> {

}
