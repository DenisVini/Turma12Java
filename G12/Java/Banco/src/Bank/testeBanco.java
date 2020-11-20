package Bank;

import java.util.Scanner;
import Bank.Conta;
import Bank.ContaCorrente;
public class testeBanco {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		ContaCorrente cc1 = new ContaCorrente(01);
		
		char opcao ;
		int credito;
		int valor;
		
		System.out.println("Digite o numero da conta: "+cc1.getNumero());
		System.out.println("Saldo conta: "+cc1.getSaldo());
		System.out.println("Deseja 'D'- Debitar ou 'C' - Creditar: ");
	     opcao = read.next().toUpperCase().charAt(0);
	     
	     if(opcao == 'C') {
	    	 System.out.println("Qual o valor do crédito: ");
	    	 valor = read.nextInt();
	    	 cc1.creditar(valor);
	     }else if(opcao =='D') {
	    	 if( cc1.getSaldo() <= 0) {
	    		 System.out.println("O valor do saldo é insuficiente para essa operação. ");
	    	 }else {
	    	 System.out.println("Qual o valor do débito: ");
	    	 valor = read.nextInt();
	    	 cc1.debitar(valor);
	    	 }
	    	 }
	    System.out.println("Numero da conta: "+cc1.getNumero());
		System.out.println("Seu saldo é:"+ cc1.getSaldo()+"R$");
	}

}
