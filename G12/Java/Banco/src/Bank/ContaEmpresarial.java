package Bank;

import Bank.ContaEmpresa;
import java.util.*;
public class ContaEmpresarial {
	public static void main(String []args) {
	
	Scanner read = new Scanner(System.in);	
	char opcao ;
	int credito;
	int valor;
	int operacoes = 0;
	char emprestimo;
	
	ContaEmpresa ce1 = new ContaEmpresa(01);
	
	System.out.println("Digite o numero da conta: "+ce1.getNumero());
	System.out.println("Saldo conta: "+ce1.getSaldo());
	
	while(operacoes < 6) {
		operacoes++;
	
	System.out.println("Movimento "+(operacoes))	;
	System.out.print("Deseja 'D'- Debitar ou 'C' - Creditar: ");
     opcao = read.next().toUpperCase().charAt(0);
     
     if(opcao == 'C') {
    	 System.out.print("Qual o valor do crédito: ");
    	 valor = read.nextInt();
    	 ce1.creditar(valor);
    	 System.out.println("Seu saldo é:"+ ce1.getSaldo()+"R$");
     }else if(opcao =='D') {
    	 if( ce1.getSaldo() <= 0) {
    		 System.out.println("O valor do saldo é insuficiente para essa operação. ");
    	 }else {
    	 System.out.print("Qual o valor do débito: ");
    	 valor = read.nextInt();
    	 ce1.debitar(valor);
    	 System.out.println("Seu saldo é:"+ ce1.getSaldo()+"R$");
    	 }
    	 }
    
	}System.out.println("Numero da conta: "+ce1.getNumero());
    System.out.println("Deseja fazer um empréstimo: 'S'-Sim, 'N'-Não");
    emprestimo = read.next().toUpperCase().charAt(0);
     if(emprestimo == 'S') {
    	 System.out.println("Qual o valor do emprestimo empresarial: ");
    	 valor = read.nextInt();
    	 ce1.creditar(valor);
     }else if(emprestimo =='N') {
    	 System.out.println("");
     }
    
	System.out.println("Seu saldo é:"+ ce1.getSaldo()+"R$");
	}
}
