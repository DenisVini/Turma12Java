package Entidades;

public class Pessoa {
	
	public String nome;
	public int anoNasc;
	public char genero;
	public String sobrenome;
	public int idade;
	
	public Pessoa() 
	{
		//construtor padrão
	}
	
	public Pessoa(String nome) 
	{
		this.nome = nome;
	}
	public Pessoa (String nome,String sobrenome)
	{
		this.nome = nome ;
		this.sobrenome = sobrenome;
	}	
	
	public void idade(int anoAtual) 
	{
		this.idade = idade;
	System.out.println("");	
	}
	
}
