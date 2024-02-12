package com.hans.ejercicioJPA.repo;

import org.springframework.data.repository.CrudRepository;

import com.hans.ejercicioJPA.entities.Users;

public interface UsersRepository extends CrudRepository<Users, Long> {
	
}
