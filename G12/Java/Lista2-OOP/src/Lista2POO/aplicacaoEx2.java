package Lista2POO;

import java.util.Scanner;
import Lista2POO.Fornecedor;
public class aplicacaoEx2 {

	public static void main (String[]args) {
		
		Scanner read = new Scanner (System.in);
		Fornecedor fornecedor1 = new Fornecedor("Denis");
		
		System.out.println("Digite o valor do crédito: ");
		fornecedor1.setValorCredito(read.nextDouble());
		
		System.out.println("Digite o valor da divida: ");
		fornecedor1.setValorDivida(read.nextDouble());
		
		System.out.println("Valor do saldo atual: "+fornecedor1.obterSaldo()+"R$");
		fornecedor1.obterSaldo();
		
		
	}
	
}
