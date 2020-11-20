package Ecommerce;

public class Pagamento {

	private double vistaDinheiro;
	private double vistaCartao;
	private double parceladoCartao;
	
	public Pagamento( ) {
		
	}
	public Pagamento(double vistaDinheiro, double vistaCartao, double parceladoCartao) {
		this.vistaDinheiro = vistaDinheiro;
		this.vistaCartao = vistaCartao;
		this.parceladoCartao = parceladoCartao;
	}
	
}
