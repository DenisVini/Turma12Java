
public class Terceiro extends Funcionario {
	
	 private double adicional;
	private double valorHora;
	 
	 public Terceiro(String cod, double horas, double valorHora, double adicional) {
		super(cod, horas, valorHora);
		this.adicional = adicional;
	 }

	public Terceiro(double adicional) {
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	 
	@Override
	public double pagamentoSalario() 
	{
		return ((this.horas*this.valorHora)+this.adicional);
	}
	
	
	
	
}
