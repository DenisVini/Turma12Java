package Bank;

public class Conta {


	private int numero;
	private String cpf_cnpj;
	private double saldo;
	
	//construtor
	public Conta(int numero) 
	{
		this.numero = numero;
	}
	
	public Conta(int numero, String cpf_cnpj) 
	{
		this.numero = numero;
		this.cpf_cnpj = cpf_cnpj;
	}

	
	//Encapsulamento
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public double getSaldo() {
		return saldo;
	}

	//Metodos
	public void debitar(double debito)
	{
		this.saldo = this.saldo - debito;
	}
	public void creditar(double credito)
	{
		this.saldo = this.saldo + credito ;
	}
	
}
