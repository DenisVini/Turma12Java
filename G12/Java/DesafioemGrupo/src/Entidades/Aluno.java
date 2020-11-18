package Entidades;

public class Aluno {

	private int matricula;
	private String nome;
	private int anoNasc;	
	private char genero;
	private boolean ativo;
	
	public Aluno(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public Aluno () 
	{
		
	}
	
	public int idade() 
	{	
		int idade = 2020 - this.anoNasc;	
		return idade;
	}
	public int idade(int anoAtual) 
	{
		return anoAtual - this.anoNasc;
	}
/*
	public void indo() 
	{
		this.ativo = true;
	}
	public void faltando()
	{
		this.ativo = false;
	}
*/
	
	public void situacao() {
		this.ativo = true;
	}public void situacao(char status) {
		if (status == 'A') {
			this.ativo = true;
		}else if(status == 'I') {
			this.ativo = false;
		}
	}
	
	
	public String obterGenero()
	{
		String generoT = "";
		if (this.genero == 'M') 
		{
			generoT ="Aluno";
		}
		else if(this.genero =='F')
		{
			generoT = "Aluna";
		}
		else if(this.genero == 'O')
		{
			generoT="Alune";
		}
		return generoT;
	}
	
	
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	

}
