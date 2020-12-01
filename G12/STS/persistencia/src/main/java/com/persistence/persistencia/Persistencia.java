package com.persistence.persistencia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Persistencia {

	@GetMapping
	public String Persistence() {
		return "Quero melhorar minha persistência e cada vez mais estudar essa linha de spring, que não é tão fácil quanto eu esperava.";
	}
	
}
