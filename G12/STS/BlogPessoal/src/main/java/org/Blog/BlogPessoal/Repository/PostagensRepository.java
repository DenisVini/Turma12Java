package org.Blog.BlogPessoal.Repository;

import java.util.List;

import org.Blog.BlogPessoal.model.PostagensModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagensRepository extends JpaRepository<PostagensModel, Long>{
	public List<PostagensModel> findAllByTituloContainingIgnoreCase(String titulo);
}
