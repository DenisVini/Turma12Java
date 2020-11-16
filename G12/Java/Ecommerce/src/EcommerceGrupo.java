import java.util.Scanner;
public class EcommerceGrupo {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		// Declara็ใo das vแriaveis
		String produtos[] = { "Arroz de 5Kg", "Arroz de 1Kg", "Feijใo de 1kg", "Farofa de 500g", "Nescau de 400g",
				"Pe็a de picanha 1kg", "Cartela com 12 Ovos", "Cartela com 24 Ovos", "Coca-Cola 2L",
				"Coca-Cola 600ml" };
		double precoProd[] = { 30.00, 10.00, 12.00, 6.00, 7.00, 109.99, 12.99, 20.99, 6.35, 4.00 };
		int estoque[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		int carrinho[] = new int[10];
		int carrinhoPreco[] = new int[10];
		int codProduto[] = new int[10];
		int qntProduto;
		int compraProduto = 0;
		int contador = 0;
		int i = 0;
		int pagamento = 0;
		int parcela = 0;
		double precoTotal = 0.0;
		double z = 0.0;
		String c = "", m = "", r = "", l = "", k = "", j = "", t = "", w = "";
		char continua;
		boolean confirmacao = true;
		boolean validacao = true;
		for (i = 0; i < 10; i++) {
			codProduto[i] = i;
		}
		do {
			do {
				// Mostrando todos os produtos e pedindo pro usuแrio qual que ele quer
				System.out.println("\nจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ");
				System.out.println("\t\t---D'tudo um Pouco---");
				for (i = 0; i < 10; i++) {
					System.out.println("_________________________________________________________\n"
							+ (codProduto[i] + 1) + " - " + produtos[i] + "\t\t\tR$: " + precoProd[i]);
				}
				System.out.println("_________________________________________________________");
				do {
					System.out.print("\nDigite o c๓digo do produto que deseja comprar: ");
					compraProduto = read.nextInt();
					compraProduto--;
					if (compraProduto < 0 || compraProduto >= 10) {
						System.out.println("Digite um c๓digo vแlido");
						validacao = true;
					} else {
						carrinho[contador] = compraProduto;
						validacao = false;
					}
				} while (validacao == true);
				do {
					System.out.print("Quantos produtos deseja comprar: ");
					qntProduto = read.nextInt();
					if (qntProduto >0 && qntProduto <=10 && qntProduto <= estoque[compraProduto]) {
						System.out.println("\n" + produtos[compraProduto]);
						System.out.println("Unidades compradas: " + qntProduto);
						if (qntProduto <= estoque[compraProduto]) {
							carrinhoPreco[contador] = qntProduto;
							estoque[compraProduto] -= qntProduto;
							System.out.println("\nO estoque ้ de: " + estoque[compraProduto] + " unidades");
						}
						validacao = false;
					
					} else if (estoque[compraProduto]==0)
					{
						System.out.println("\nEstoque insuficiente");
						validacao = false;
					}
					else if (qntProduto > estoque[compraProduto]) {
						System.out.println(
								"\nEstoque insuficiente, temos apenas " + estoque[compraProduto] + " produtos!!");
						validacao = true;
					}
				
					
					else  {
						System.out.println("\nQuantidade do produto invแlida!!");
						validacao = true;
					}
				} while (validacao == true);
				do {
					System.out.print("Desejar continuar comprando S/N: ");
					continua = read.next().toUpperCase().charAt(0);
					if (continua == 'S' || continua == 'N') {
						if (continua == 'S') {
							confirmacao = true;
							contador++;
						} else {
							confirmacao = false;
						}
						validacao = false;
					} else {
						System.out.println("Digite S/N");
						validacao = true;
					}
				} while (validacao == true);
			} while (confirmacao == true);
			// carrinho de compras
			if (contador == 0) {
				z = precoProd[compraProduto] * qntProduto;
				System.out.println();
				System.out.println("1 - " + produtos[carrinho[0]] + "\t\t" + precoProd[carrinho[0]] + "\t\t" + z);
			} else {
				for (i = 0; i <= contador; i++) {
					z += (precoProd[carrinho[i]] * carrinhoPreco[i]);
					System.out.print("\n" + (i + 1) + " - " + produtos[carrinho[i]] + "\t\t" + precoProd[carrinho[i]]
							+ "\t\t" + (precoProd[carrinho[i]] * carrinhoPreco[i]));
				}
			}
			System.out.println("\n\nจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ");
			System.out.println("\t\t---D'tudo um Pouco---");
			System.out.printf("\n\tTotal a pagar ้ de: %.2f Reais\n", z);
			// Formas de pagamento
			do {
				System.out.print(
						" _____________________________________________\n|             FORMAS DE PAGAMENTO             |\n|_____________________________________________|\n|1 - Pagamento เ vista em dinheiro ou cheque. | \n|_____________________________________________|\n|2 - Pagamento เ vista em cartใo de cr้dito.  | \n|_____________________________________________|\n|3 - Pagamento parcelado no Cartใo.           | \n|_____________________________________________|\n\nDigite um n๚mero de (1 a 3): ");
				pagamento = read.nextInt();
				if (pagamento < 1 || pagamento > 3) {
					validacao = true;
				} else {
					validacao = false;
				}
			} while (validacao == true);
			if (pagamento == 1) {
				z = (z + ((z / 100) * 9));
				z = (z - (z / 100) * 20);
				System.out.printf("\nO pre็o do produto serแ:  R$ %.2f", z);
				System.out.println("\nCom acrescimo de 9% de imposto e desconto de 20% devido a forma de pagamento.");
			} else if (pagamento == 2) {
				z = (z + ((z / 100) * 9));
				z = (z - (z / 100) * 20);
				System.out.printf("\nO pre็o do produto serแ:  R$ %.2f", z);
				System.out.println(" -- com acrescimo de 9% de imposto e desconto de 15% devido a forma de pagamento.");
			} else if (pagamento == 3) {
				z = (z + ((z / 100) * 19));
				do {
					System.out.print("Parcelado em 2 ou 3 vezes ?\nDigite: ");
					parcela = read.nextInt();
					if (parcela < 2 || parcela > 3) {
						validacao = true;
					} else {
						validacao = false;
					}
				} while (validacao == true);
				if (parcela == 2) {
					z = (z + (z / 100) * 9);
					System.out.printf("O pre็o do produto serแ de: R$ %.2f", z);
					System.out.println(" -- com acrescimo de 9% de impostos e sem juros");
					System.out.printf("O pre็o parcelado em 2 vezes serแ de R$: %.2f\n", (z / 2));
				} else {
					z = (z + (z / 100) * 19);
					System.out.printf("O pre็o do produto serแ de: R$ %.2f", z);
					System.out.println("-- com acrescimo de 9% de impostos e 10% de juros");
					System.out.printf("O pre็o parcelado em 3 vezes serแ de R$: %.2f\n", (z / 3));
				}
			}
			l = "ภ vista, dinheiro ou em cheque";
			c = "ภ vista, cartใo de credito";
			m = "Parcelado em 2 vezes";
			r = "Parcelado em 3 vezes";
			k = "Impostos de 9% e desconto de 20%";
			j = "Impostos de 9% e desconto de 15%";
			t = "com acrescimo de 9% de impostos e sem juros";
			w = "com acrescimo de 9% de impostos e juros de 10%";
			do {
				System.out.println("\nจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ");
				System.out.println("\t\t---D'tudo um Pouco---");
				System.out.println("\t\t     NOTA FISCAL");
				System.out.println("จจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ");
				if (pagamento == 1) {
					if (contador == 0) {
						System.out.println("\t1 - " + produtos[carrinho[0]]);
						System.out.print("\tQuantidade: " + qntProduto);
						System.out.print("\n\n\t" + k + "\n");
						System.out.println("จจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ");
						System.out.print("Forma de Pagamento: " + l);
						System.out.printf("\n\tPre็o: %.2f R$", z);
					} else {
						for (i = 0; i <= contador; i++) {
							System.out.println(
									"\t" + (i + 1) + " - " + produtos[carrinho[i]] + " - " + carrinhoPreco[i] + " Uni");
						}
						z = z + precoProd[carrinho[i]] * carrinhoPreco[i];
						System.out.print("\n\t" + k + "\n");
						System.out.println("จจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ");
						System.out.print("Forma de pagamento: " + l);
						System.out.printf("\n\tPre็o Total: %.2f R$", z);
					}
				} else if (pagamento == 2) {
					if (contador == 0) {
						System.out.println("\t1 - " + produtos[carrinho[0]]);
						System.out.print("\tQuantidade: " + qntProduto);
						System.out.print("\n\n\t" + j + "\n");
						System.out.println("จจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ");
						System.out.print("Forma de Pagamento: " + c);
						System.out.printf("\n\tPre็o: %.2f R$", z);
					} else {
						for (i = 0; i <= contador; i++) {
							System.out.println(
									"\t" + (i + 1) + " - " + produtos[carrinho[i]] + " - " + carrinhoPreco[i] + " Uni");
						}
						z = z + precoProd[carrinho[i]] * carrinhoPreco[i];
						System.out.print("\n\t" + j + "\n");
						System.out.println("จจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ");
						System.out.print("Forma de pagamento: " + c);
						System.out.printf("\n\tPre็o Total: %.2f R$", z);
					}
				} else if (pagamento == 3) {
					if (parcela == 2) {
						if (contador == 0) {
							System.out.println("\t1 - " + produtos[carrinho[0]]);
							System.out.print("\tQuantidade: " + qntProduto);
							System.out.print("\n\n\t" + t + "\n");
							System.out.println("จจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ");
							System.out.print("Forma de Pagamento: " + m);
							System.out.printf("\n\tPre็o: %.2f R$", z);
						} else {
							for (i = 0; i <= contador; i++) {
								System.out.println("\t" + (i + 1) + " - " + produtos[carrinho[i]] + " - "
										+ carrinhoPreco[i] + " Uni");
							}
							z = z + precoProd[carrinho[i]] * carrinhoPreco[i];
							System.out.print("\n\t" + t + "\n");
							System.out.println("จจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ");
							System.out.print("Forma de pagamento: " + m);
							System.out.printf("\n\tPre็o por parcela: %.2f R$", (z / 2));
							System.out.printf("\n\tPre็o Total: %.2f R$", z);
						}
					} else if (parcela == 3) {
						if (contador == 0) {
							System.out.print("\t1 - " + produtos[carrinho[0]]);
							System.out.print("\n\tQuantidade: " + qntProduto);
							System.out.print("\n\t" + w + "\n");
							System.out.println("จจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ");
							System.out.print("Forma de Pagamento: " + r);
							System.out.printf("\n\tPre็o: %.2f R$", z);
						} else {
							for (i = 0; i <= contador; i++) {
								System.out.println("\t" + (i + 1) + " - " + produtos[carrinho[i]] + " - "
										+ carrinhoPreco[i] + " Uni");
							}
							z = z + precoProd[carrinho[i]] * carrinhoPreco[i];
							System.out.print("\n\t" + w + "\n");
							System.out.println("จจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ");
							System.out.print("Forma de pagamento: " + r);
							System.out.printf("\n\tPre็o por parcela: %.2f R$", (z / 3));
							System.out.printf("\n\tPre็o Total: %.2f R$", z);
						}
					}
				}
			} while (confirmacao == true);
			System.out.println("\nจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ");
			System.out.print("Deseja continuar S/N: ");
			continua = read.next().toUpperCase().charAt(0);
			if (continua == 'S') {
				confirmacao = true;
				System.out.println("\n");
			} else {
				confirmacao = false;
			}
		} while (confirmacao == true);
	}
}