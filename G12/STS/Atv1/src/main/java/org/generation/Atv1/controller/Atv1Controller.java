package org.generation.Atv1.controller;

import java.util.List;
import java.util.Optional;

import org.generation.Atv1.model.Atv1Model;
import org.generation.Atv1.repository.PostagensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class Atv1Controller {
	
	
	@Autowired
	private PostagensRepository repository;
	@GetMapping
	public ResponseEntity<List<Atv1Model>>GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/getById1/{id}")
	public Optional<Atv1Model> encontrarUm(@PathVariable Long id) {
		return repository.findById(id);
	}

}
