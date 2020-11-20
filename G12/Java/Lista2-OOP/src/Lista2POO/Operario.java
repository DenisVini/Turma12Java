package Lista2POO;

public class Operario extends Pessoa {
	
	private double valorProducao;
	private double comissao;
	private double salario;
	
	public Operario() 
	{
	}
	public Operario(double valorProducao, double comissao, double salario) {
		super();
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		this.salario = salario;
	}
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double calculoSal() {
		return salario = valorProducao +(valorProducao*(comissao/100));
	}
	

}
