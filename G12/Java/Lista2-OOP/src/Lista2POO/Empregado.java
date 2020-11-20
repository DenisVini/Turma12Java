package Lista2POO;

public class Empregado extends Pessoa {
		
	private int codigoSetor;
	private double salarioBase;
	private double impostos;
	private double salFinal;
	
	public Empregado() {
		super();
	
	}
	
	public Empregado(int codigoSetor, double salarioBase, double impostos) {
		super();
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.impostos = impostos;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImpostos() {
		return impostos;
	}

	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}
	
	
	
	public double getSalFinal() {
		return salFinal;
	}

	public void setSalFinal(double salFinal) {
		this.salFinal = salFinal;
	}

	public double calcularSalario() {
		return salFinal =salarioBase-(salarioBase*(impostos/100));
	}
	
	
	
}
