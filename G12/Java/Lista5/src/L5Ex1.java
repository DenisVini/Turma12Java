import java.util.*;
public class L5Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/*
		 * Elabore um programa que calcule o que deve ser pago por um produto, 
		 * considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
		 * Utilize os códigos da tabela a seguir para ler qual a condição de pagamento 
		 * escolhida e efetuar o cálculo adequado.
			Código Condição de pagamento
			1 À vista em dinheiro ou cheque, recebe 20% de desconto
			2 À vista no cartão de crédito, recebe 15% de desconto
			3 Em duas vezes, preço normal de etiqueta sem juros
			4 Em três vezes, preço normal de etiqueta mais juros de 10%
		 */
		
		int preco;
		int pagamento;
		
		System.out.println("Digite o valor do produto: ");
		preco = leia.nextInt();
		
		System.out.println("Forma de pagamento: \n1 - Pagamento à vista em dinheiro ou cheque. \n2 - Pagamento à vista em cartão de crédito. \n3 - Pagamento parcelado em 2x. \n4 - Pagamento parcelado em 3x.\n" );
		pagamento = leia.nextInt();
		
		if(pagamento == 1) {
			preco = preco - ((preco/100)*20);
		System.out.println("O preço do produto será: "+preco+"R$ com desconto de 20% devido a forma de pagamento.");
		}else if(pagamento == 2) {
			preco = preco - ((preco/100)*15);
		System.out.println("O preço do produto será: "+preco+"R$ com desconto de 15% devido a forma de pagamento.");
		}else if(pagamento == 3) {
		System.out.println("O preço do produto será: "+preco+"R$ em 2x sem juros!");
		}else if(pagamento ==4) {
			preco = preco + ((preco/100)*10);
		System.out.println("O preço do produto será: "+preco+"R$ em 3x com juros de 10%");
		}
	}

}
