package org.generation.blogPessoal.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import javax.persistence.JoinColumn;


@Entity
public class Usuario implements UserDetails, Serializable { // Serializable salva o estado atual dos objetos em aquivos em formato binário
	
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS --------------------------------------
	@Id
	private String login;
	private String nomeCompleto;
	private String senha;
	@ManyToMany // Conexão entre duas entidades
	@JoinTable(name = "usuarios_roles", joinColumns = @JoinColumn(name = "usuario_id",
				referencedColumnName = "login"), inverseJoinColumns = @JoinColumn
				(name = "role_id", referencedColumnName = "nomeRole"))
	private List<Role> roles;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() { // GrantedAuthority são inseridos no objeto Authorities
		// TODO Auto-generated method stub
		return this.roles;  

	}
	@Override
	public String getPassword() 
	{
		return this.senha;   	
	}
	@Override
	public String getUsername() 
	{
		return this.login; 
	}

	
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	// GETTER E SETTERS ------------------------------------------------------
	
	public void setPassaword(String encode) {
		
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
}
