package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hans.ejercicioJPA.EjercicioJpaApplication;
import com.hans.ejercicioJPA.entities.Users;
import com.hans.ejercicioJPA.repo.UsersRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EjercicioJpaApplication.class)
class EjercicioJpaApplicationTests {
	
	@Autowired
	UsersRepository userRepo;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testOnetoOneCreateUser() {
		Users user = new Users();
		user.setName("Hans");
		user.setLast_name("Bautista");
		user.setEmail("somethin@internet.com");
		user.setBio("A guy whit a computer");
		user.setArea_of_int("Electronics");
		userRepo.save(user);
	}

}
