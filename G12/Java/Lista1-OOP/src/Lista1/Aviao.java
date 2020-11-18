package Lista1;

public class Aviao {
	//atributos
	public String modelo;
	public String fabricante;
	public String peso;
	public int quantidadeAssentos;
	public String tipoMotor;
	public boolean voando;
	public int velocidade;
	
	//construtor
	public Aviao(String modelo) 
	{
		this.modelo = modelo ;
	}
	public Aviao(String modelo, String fabricante, String peso, int quantidadeAssentos, String tipoMotor) 
	{	
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.peso = peso;
		this.quantidadeAssentos = quantidadeAssentos;
		this.tipoMotor = tipoMotor;
	}
	//metodos
	public void decola() 
	{
		this.voando = true;
	}
	
	public void pouso() {
		this.voando = false;
	}
	
	public void aumentarVelocidade() 
	{
		
		this.velocidade = this.velocidade + 1;
		
	}
	public void diminuirVelocidade() 
	{
		this.velocidade = this.velocidade -1;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	
	
}
