
public class Funcionario {

	private String cod;
	protected double horas;
	protected double valorHora;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String cod, double horas, double valorHora) {
		super();
		this.cod = cod;
		this.horas = horas;
		this.valorHora = valorHora;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public double pagamentoSalario() 
	{
		return (this.horas*this.valorHora);
	}
	public double pagamentoSalario(double horas, double valorHora) 
	{
		return (horas*valorHora);
	}
	
}
