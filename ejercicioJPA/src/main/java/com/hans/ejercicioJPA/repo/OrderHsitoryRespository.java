package com.hans.ejercicioJPA.repo;

import org.springframework.data.repository.CrudRepository;

import com.hans.ejercicioJPA.entities.OrderHistory;

public interface OrderHsitoryRespository extends CrudRepository<OrderHistory, Long> {

}
