package org.generation.Atv1.repository;

import java.util.List;

import org.generation.Atv1.model.Atv1Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagensRepository extends JpaRepository<Atv1Model, Long> {
	public List<Atv1Model> findAllByTituloContainingIgnoreCase(String titulo);
	
	
}
