package Bank;

public class ContaEmpresa extends Conta{
	
	private double emprestimo;
	
	public ContaEmpresa(int numero) {
		super(numero);
	}
	public ContaEmpresa(int numero, String cpf_cnpj) {
		super(numero, cpf_cnpj);	
	}
	
	//Encapsulamento
	public double getEmprestimo() {
		return emprestimo;
	}
	public void setEmprestimo(double emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	public void pediremprestimo (double valorEmp) {
		//saldo não pode ser vazio e nem negativo
		//comparo a data de aniversário com a data informada se sim rodar a correcao
		if (valorEmp <= this.emprestimo) 
		{
			super.creditar(valorEmp);
			this.emprestimo = this.emprestimo - valorEmp;
		}
	}
	

}
