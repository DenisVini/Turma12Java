package Lista2POO;

public class Vendedor extends Pessoa {

	 private double valorVendas;
	 private double comissao;
	 private double salFinal;
	
	public Vendedor() {
		
	}
	public Vendedor(double valorVendas, double comissao, double salFinal) {
		super();
		this.valorVendas = valorVendas;
		this.comissao = comissao;
		this.salFinal = salFinal;
	}
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public double getSalFinal() {
		return salFinal;
	}
	public void setSalFinal(double salFinal) {
		this.salFinal = salFinal;
	}
	public double calculoSal() {
		return salFinal = valorVendas +(valorVendas*(comissao/100));
	}
	
	
}
