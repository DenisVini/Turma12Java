package org.Blog.BlogPessoal.controller;

import java.util.List;
import java.util.Optional;
import org.Blog.BlogPessoal.Repository.PostagensRepository;
import org.Blog.BlogPessoal.model.PostagensModel;
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
public class BlogController {

	@Autowired
	private PostagensRepository repository;
	@GetMapping
	public ResponseEntity<List<PostagensModel>>GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/getById1/{id}")
	public Optional<PostagensModel> encontrarUm(@PathVariable Long id) {
		return repository.findById(id);
	}
	
}
