package Bank;

public class ContaPoupanca extends Conta
{

	private int dataAniver;

	public ContaPoupanca(int numero, int dataAniver) {
		super(numero);
	}
	public ContaPoupanca(int numero, String cpf_cnpj, int dataAniver) 
	{
		super(numero, cpf_cnpj);
		this.dataAniver = dataAniver;
	}

	public int getDataAniver() {
		return dataAniver;
	}

	public void setDataAniver(int dataAniver) {
		this.dataAniver = dataAniver;
	}
	
	
	public void correcao (int data) {
		//saldo não pode ser vazio e nem negativo
		//comparo a data de aniversário com a data informada se sim rodar a correcao
		double novoSaldo;
		novoSaldo = super.getSaldo() + (super.getSaldo() * 0.005);
		if (super.getSaldo() > 0 && data == this.dataAniver) 
		{
			super.creditar(novoSaldo);	
		}
	}
	
}
