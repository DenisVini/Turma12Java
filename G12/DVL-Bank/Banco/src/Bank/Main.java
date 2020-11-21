package Bank;
import java.util.Scanner;
import Bank.ContaEmpresa;
import Bank.ContaPoupanca;
public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Conta c1 = new Conta(01);
		
		//CE
		int credito;
		int operacoes = 0;
		char emprestimo;
		int Opcao;
		//CP
		int x=0,diaHj=0, numero = 0,dataAniversario=0;
		char opcao;
		double valor=0.0;
		String CPF =  " ";
		
		System.out.println("----------DVL-BANK------------");
	     
	      System.out.println("1 - CONTA POUPANÇA");
	      System.out.println("2 - CONTA CORRENTE");
	      System.out.println("3 - CONTA ESPECIAL");
	      System.out.println("4 - CONTA EMPRESARIAL");
	      System.out.print("DIGITE QUAL CONTA DESEJA ACESSAR: ");
	      Opcao = read.nextInt();
	    		  
  	if (Opcao == 1) {
	    		System.out.println("Digite da conta:");
	    		numero=read.nextInt();
	    		System.out.println("Digite o número do CPF:");
	    		CPF=read.next();
	    		System.out.println("Digite a data de aniversario: ");
	    		dataAniversario=read.nextInt();
	    		
	    		ContaPoupanca cp1 = new ContaPoupanca(01,10);
	    		
	    		System.out.println("Número da conta: "+cp1.getNumero());
	    		System.out.println("Saldo da conta é de: "+cp1.getSaldo());
	    		System.out.println("O dia de aniversario da conta é: "+cp1.getDataAniver());
	    		
	    		while(x<5) {
	    			x++;
	    			System.out.println("Transação "+x);
	    			System.out.println("Vc deseja C-creditar ou D-debitar um valor ? ");
	    			opcao = read.next().toUpperCase().charAt(0);
	    			if(opcao=='C') {
	    				System.out.println("Digite o dia de hoje: ");
	    				diaHj=read.nextInt();
	    				if(diaHj!=dataAniversario) {
	    					System.out.println("Qual o valor de crédito: ");
	    					valor=read.nextDouble();
	    					cp1.creditar(valor);
	    					System.out.println("Saldo da conta: "+cp1.getSaldo());
	    				}else if(diaHj==dataAniversario) {
	    					System.out.println("Qual o valor de crédito: ");
	    					valor=read.nextDouble();
	    					cp1.creditar(valor);
	    					cp1.correcao(diaHj);
	    					System.out.println("Novo saldo é de: "+cp1.getSaldo());
	    				}
	    			}
	    			else if(opcao=='D') {
	    				if(cp1.getSaldo()<=0) {
	    					System.out.println("Conta sem Saldo");
	    				}else {
	    					System.out.println("Qual o valor de Débito: ");
	    					valor=read.nextDouble();
	    					while(valor>cp1.getSaldo()) {
	    						System.out.println("Valor acima do saldo, digite novamente");
	    						valor=read.nextDouble();
	    					}
	    					cp1.debitar(valor);
	    					System.out.println("Novo saldo é de: "+cp1.getSaldo());
	    					
	    				}
	    			}
	    			
	    			System.out.println("Número da conta: "+cp1.getNumero());
	    			
	    		}
	    		System.out.println("Seu Saldo final é de: "+cp1.getSaldo());
	    	}
	else if(Opcao == 2) {
	    		ContaCorrente cc1 = new ContaCorrente(01);
	    		String numCpf;
	    		int numTaloes;
	    		char opcoes;
	    		char tipoMovimento;
	    		double movimento;
	    		
	    		System.out.println("Digite o CPF: ");
	    		cc1.setCpf_cnpj(read.next());
	    		System.out.println("Olá, o número da sua conta é: "+cc1.getNumero());
	    		System.out.println("Você deseja emitir talões: 'S'/'N'");
	    		opcoes = read.next().toUpperCase().charAt(0);
	    			if(opcoes == 'S') {
	    				System.out.println("Quantos talões deseja emitir? [0-10]");
	    				cc1.setNumTalao(read.nextInt());
	    				System.out.println("Você tem: "+cc1.getNumTalao()+" talões");
	    				System.out.println("Saldo: "+cc1.getSaldo());
	    			}else {
	    				System.out.println("Você tem: "+cc1.getNumTalao()+" talões");
	    				System.out.println("Saldo: "+cc1.getSaldo());
	    			}
	    			for ( x = 1; x<=5; x++)
	    			{
	    			
	    			System.out.println("Movimento "+x);
    				System.out.print("Debito ou Credito [D/C]:");
    				tipoMovimento = read.next().toUpperCase().charAt(0);
    				if (tipoMovimento =='D' && cc1.getSaldo() > 0)
    				{
    									
    					System.out.print("Digite o valor do débito: ");
    					movimento = read.nextDouble();
    					while (movimento > cc1.getSaldo()) {
    						System.out.print("Valor acima do saldo!!! Digite de novo: ");
    						movimento = read.nextDouble();
    					}
    					cc1.debitar(movimento);
    					
    					
    				}
    				else if (tipoMovimento =='C')
    				{
    					System.out.print("Digite o valor do crédito: ");
    					movimento = read.nextDouble();
    					cc1.creditar(movimento);
    				}
    				else
    				{
    					System.out.println("OPÇÃO INVALIDA!!!");
    				}
    			System.out.println("Saldo atual:"+cc1.getSaldo());
    			}
	}
    else if(Opcao == 3) {
	    		{
	    			ContaEspecial ce1 = new ContaEspecial(01, 1000.0);
	    			
	    			int numeroConta, limite;
	    			double movimento;
	    			char tipoMovimento;
	    			String numCpf;
	    			char usarLimite;
	    			double valorLimite = 0;
	    			
	    			System.out.println("Digite o CPF:");
	    			numCpf = read.next();
	    			ce1.setCpf_cnpj(numCpf);
	    			System.out.println("Seu limite é de: " + ce1.getLimite() ) ;			
	    			System.out.println("Deseja debitar seu limite? S-sim ou N-não ");
	    			usarLimite = read.next().toUpperCase().charAt(0);
	    			System.out.println("NUMERO DA CONTA: "+ce1.getNumero());
	    			if(usarLimite == 'S')
	    			{
	    				System.out.println("Digite o valor que deseja retirar: " );
	    				valorLimite = read.nextDouble();
	    			
	    				ce1.creditar(valorLimite);
	    				ce1.setLimite(1000 - valorLimite);
	    			}
	    			for ( x = 1; x<=5; x++)
	    			{
	    				System.out.println("Saldo atual: "+ce1.getSaldo());
	    				System.out.println("Seu limite atual: "+ce1.getLimite());
	    				System.out.println("Movimento "+x);
	    				System.out.print("Debito ou Credito [D/C]:");
	    				tipoMovimento = read.next().toUpperCase().charAt(0);
	    				if (tipoMovimento =='D' && ce1.getSaldo() > 0)
	    				{
	    					System.out.print("Digite o valor do débito: ");
	    					movimento = read.nextDouble();
	    					while (movimento > ce1.getSaldo()) {
	    						System.out.print("Valor acima do saldo!!! Digite de novo: ");
	    						movimento = read.nextDouble();
	    					}
	    					ce1.debitar(movimento);
	    				}
	    				else if (tipoMovimento =='C')
	    				{
	    					System.out.print("Digite o valor do crédito: ");
	    					movimento = read.nextDouble();
	    					ce1.creditar(movimento);
	    				}
	    				else
	    				{
	    					System.out.println("OPÇÃO INVALIDA!!!");
	    				}
	    			}
	    			System.out.println("Saldo atual:"+ce1.getSaldo());
	    		}
	    	}
    else if(Opcao ==4 ){
	    		ContaEmpresa ContaEmpresarial1 = new ContaEmpresa(01);
	    		System.out.println("Digite o CNPJ: ");
	    		ContaEmpresarial1.setCpf_cnpj(read.next());
	    		System.out.println("O numero da conta: "+ContaEmpresarial1.getNumero());
	    		System.out.println("Saldo conta: "+ContaEmpresarial1.getSaldo());
	    		
	    		while(operacoes < 5) {
	    			operacoes++;
	    		
	    		System.out.println("Movimento "+(operacoes))	;
	    		System.out.print("Deseja 'D'- Debitar ou 'C' - Creditar: ");
	    	     opcao = read.next().toUpperCase().charAt(0);
	    	     
	    	     if(opcao == 'C') {
	    	    	 System.out.print("Qual o valor do crédito: ");
	    	    	 valor = read.nextInt();
	    	    	 ContaEmpresarial1.creditar(valor);
	    	    	 System.out.println("Seu saldo é:"+ ContaEmpresarial1.getSaldo()+"R$");
	    	     }else if(opcao =='D') {
	    	    	 if( ContaEmpresarial1.getSaldo() <= 0) {
	    	    		 System.out.println("O valor do saldo é insuficiente para essa operação. ");
	    	    	 }else {
	    	    	 System.out.print("Qual o valor do débito: ");
	    	    	 valor = read.nextInt();
	    	    	 ContaEmpresarial1.debitar(valor);
	    	    	 System.out.println("Seu saldo é:"+ ContaEmpresarial1.getSaldo()+"R$");
	    	    	 }
	    	    	 }
	    			 }
	    		System.out.println("Numero da conta: "+ContaEmpresarial1.getNumero());
	    	    System.out.println("Deseja fazer um empréstimo: 'S'-Sim, 'N'-Não");
	    	    emprestimo = read.next().toUpperCase().charAt(0);
	    	     if(emprestimo == 'S') {
	    	    	 System.out.println("Qual o valor do emprestimo empresarial: ");
	    	    	 valor = read.nextInt();
	    	    	 ContaEmpresarial1.creditar(valor);
	    	     }else if(emprestimo =='N') {
	    	    	 System.out.println("");
	    	     }
	    	 }	    
		}	    	
	}