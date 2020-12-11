package org.generation.blogPessoal.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role implements GrantedAuthority { // Implementa a classe role em um método
	//Transforma em uma classe com privilégios

	@Id
	private String nomeRole;
	
	@ManyToMany(mappedBy = "roles") // diz de onde irá trazer a informação
	private List<Usuario> usuario;

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.nomeRole;
	}

	// Getters e Setters
	public String getNomeRole() {
		return nomeRole;
	}

	public void setNomeRole(String nomeRole) {
		this.nomeRole = nomeRole;
	}

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}
	
}
