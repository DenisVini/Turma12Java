import java.util.Scanner;
public class Teste1{
	public static void main(String[]args) {
	
	String contas[] = { "Conta Poupança", "Conta Corrente", "Conta Especial", "Conta Empresarial" };
	int conta;
	int cpf;
	int talaoCheque = 0;
	int numTalao = 0;
	double numConta = 0;
	double CNPJ = 0;
	int indice = 0;
	Scanner leia = new Scanner(System.in);
	String nome;
	double emprestimo = 10000;
	char confirmacao;
	char confirmacaoC = 'S';
	double valorEmp;
	double Saldo = 0;
	int opcao;
	int operacao = 0;
	int opera;
	double Debito;
	double Credito;
	int operacoes = 0;
	System.out.println("\tBANCO DVLP\n");
	System.out.println("Digite seu nome: ");
	nome = leia.next();
	for (String conte : contas) {
		System.out.print((indice + 1) + " - ");
		System.out.println(conte);
		indice++;
	}
	
	// Coloquei o while aqui, pq se não ele ficaria repetindo apenas o que estava dentro do if, e colocando aqui ele repete as 10 vezes
	// Só não sei se era assim que vc queria ficar fazendo o laço
	while (operacoes < 10) {
		
	System.out.println("\nEscreva um codigo para a utilização da conta(1/2/3/4): ");
	conta = leia.nextInt();
	
		// CONTA CORRENTE
		if (conta == 2) {
			System.out.print("Insira número da conta: ");
			numConta = leia.nextInt();
			System.out.print("Insira seu CPF: ");
			cpf = leia.nextInt();
			System.out.println("Olá " + nome + " você entrou em sua conta corrente!!");
			System.out.println("Você dispõe de " + talaoCheque + " talões de cheque");
			System.out.println("Seu saldo: " + Saldo);
			System.out.println("Você deseja talões de cheque? ");
			confirmacao = leia.next().toUpperCase().charAt(0);
			if (confirmacao == 'S') {
				System.out.println("Quantos você deseja (1-10)?");
				numTalao = leia.nextInt();
				talaoCheque = talaoCheque + numTalao;
				System.out.println("Você dipõe de " + talaoCheque + "talões de cheque");
			} else {
				System.out.println(" ");
			}
			operacoes++;
			System.out.println((operacoes) + "ª Operação em '1' - Crédito / '2' - Débito");
			operacao = leia.nextInt();
			if (operacao == 1) {
				System.out.println("Digite o valor da operação: ");
				Credito = leia.nextDouble();
				Saldo = Saldo + Credito;
				System.out.println("Você tem " + Saldo + "R$ de saldo.");
			} else if (operacao == 2) {
				System.out.println("Digite o valor da operação: ");
				Debito = leia.nextDouble();
				if (Debito > Saldo) {
					System.out.println("Você não tem saldo para esta operação de débito.");
				} else {
					Saldo = Saldo - Debito;
					System.out.println("Você tem " + Saldo + "R$ de saldo.");
				}
			}
			
		// O seu else if da opção 4 estava dentro do if da opção 2, aí só funcionaria se vc entrasse na conta corrente e na operação tu colocasse 4
		// aí só fechei a chave do if antes do else if, e o while para repetir eu coloquei ele em cima
		} else if (conta == 4) { // CONTA EMPRESARIAL
			System.out.println("Digite sua conta: ");
			numConta = leia.nextInt();
			System.out.println("Digite seu CNPJ: ");
			CNPJ = leia.nextDouble();
			System.out.println("Olá " + nome + " você entrou em sua conta empresarial. ");
			System.out.println("Dispoibilizamos à você um empréstimo empresarial com o limite de: 10.000R$");
			System.out.println("Você deseja fazer um empréstimo? 'S'-Sim / 'N'-Não");
			confirmacao = leia.next().toUpperCase().charAt(0);
			if (confirmacao == 'S') {
				System.out.println("Deseja fazer um empréstimo de quanto em R$?");
				valorEmp = leia.nextDouble();
				emprestimo = emprestimo - valorEmp;
				Saldo = valorEmp;
				System.out.println("Devido ao emprestimo feito você tem disponibilizado " + Saldo
						+ "R$ de saldo para as operações do dia.");
			} else if (confirmacao == 'N') {
				while (operacoes < 4 || Saldo > 0) {
					System.out.println((operacoes + 1) + "ª Operação em '1' - Débito // '2' - Crédito?");
					opera = leia.nextInt();
					if (opera == 1) {
						System.out.println("Digite o valor da operaçao: ");
						Debito = leia.nextDouble();
						if (Debito > Saldo) {
							System.out.println("Você não tem saldo para esta operação de débito.");
						} else {
							Saldo = Saldo - Debito;
							System.out.println("Você tem " + Saldo + "R$ de saldo.");
						}
					} else if (opera == 2) {
						System.out.println("Digite o valor que deseja creditar em sua conta: ");
						Credito = leia.nextDouble();
						Saldo = Saldo + Credito;
						System.out.println("Você tem " + Saldo + "R$ de saldo.");
					}
					operacoes++;
				}
			}
		}
	}
	}
}