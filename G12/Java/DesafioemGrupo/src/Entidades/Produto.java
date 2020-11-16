package Entidades;

public class Produto {

	public String nome;
	public double medida;
	public int quantidade;
	public String valorUni;

	public Produto () 
	{
		
	}
	public Produto (String nome,double medida,int quantidade,String valorUni) 
	{
		this.nome = nome;
		this.medida = medida;
		this.quantidade = quantidade;
		this.valorUni = valorUni;
	}
}
