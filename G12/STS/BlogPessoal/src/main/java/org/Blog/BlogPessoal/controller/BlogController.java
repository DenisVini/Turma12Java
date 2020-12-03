package org.Blog.BlogPessoal.controller;

import java.util.List;
import java.util.Optional;

import org.Blog.BlogPessoal.Repository.PostagensRepository;
import org.Blog.BlogPessoal.model.PostagensModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<PostagensModel>>GetByTitulo(@PathVariable String titulo) {
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	@PostMapping
	public ResponseEntity<PostagensModel> post(@RequestBody PostagensModel postagem){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}
	@PutMapping
	public ResponseEntity<PostagensModel> put(@RequestBody PostagensModel postagem){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
