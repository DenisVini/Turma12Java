package Bank;

public class ContaPoupanca extends Conta
{

	private int dataAniver;

	public ContaPoupanca(int numero, String cpf_cnpj, int dataAniver) 
	{
		super(numero, cpf_cnpj);
		this.dataAniver = dataAniver;
	}
	
	
}
