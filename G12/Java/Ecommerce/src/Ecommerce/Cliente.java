package Ecommerce;

public class Cliente {
	public String nome;
	public char genero;
	
	public Cliente(String nome) 
	{
		this.nome = nome;
	}
	public Cliente(String nome, char genero)
	{
		this.nome = nome;
		this.genero = genero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
}
