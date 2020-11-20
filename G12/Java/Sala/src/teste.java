
public class teste {

	public static void main(String[] args) {
		public static void main(String args []) {
			Scanner leia = new Scanner(System.in);
			int produtoSelecionado = 0;
			int qtdeConsumir;
			//private int codigosProdutos[] = new int[10];
			ArrayList <Integer> codigoProdutos = new ArrayList<Integer>();
			//
			//private int produtosEstoque[] = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
			ArrayList <Integer> produtosEstoque = new ArrayList<Integer>(Arrays.asList(10, 10, 10, 10, 10, 10, 10, 10, 10, 10));
			//private String nomeProdutos[] = {"Leite", "Cereal", "Arroz", "Atum", "Feijão", "Azeite", "Oleo", "Sabão", "Sal", "Açucar"};
			 ArrayList <String> nomeProdutos = new ArrayList<String>(Arrays.asList("Leite", "Cereal", "Arroz", "Atum", "Feijão", "Azeite", "Oleo", "Sabão", "Sal", "Açucar"));
			//private double valorProdutos[] = {4.57, 3.02, 9.43, 3.55, 6.55, 4.55, 7.33, 1.99, 3.82, 4.29};
			ArrayList <Double> valorProdutos = new ArrayList<Double>(Arrays.asList(4.57, 3.02, 9.43, 3.55, 6.55, 4.55, 7.33, 1.99, 3.82, 4.29));
			ArrayList <Double> totalComprasCar = new ArrayList<Double>();
			boolean loop = true;
			boolean comprando = true;
			char resposta;
			int pagamento;
			double desconto = 0;
			double juros = 0;
			double tributos = 0;
			char respostaFinal;
			boolean on = true;
			double valorParcelado = 0;
			//Criar um historico de compras.
			Estoque armazem = new Estoque(codigoProdutos, produtosEstoque, nomeProdutos, valorProdutos);
			while(on) {
				double valorTotal = 0;
				double valorComImposto = 0;
				totalComprasCar.clear();
				armazem.precoCarrinho.clear();
				armazem.qtdeCarrinho.clear();
				armazem.itensCarrinho.clear();
				while(comprando) {
					fachada();
					for(int x = 0; x < 10; x++) {
						codigoProdutos.add(x + 1);
						System.out.printf("%d\t\t%s\t\t     %d\t\t\t  R$%.2f\n", armazem.codigoProdutos.get(x), armazem.nomeProdutos.get(x), armazem.produtosEstoque.get(x), armazem.valorProdutos.get(x));
					}
					while(loop) {
						System.out.print("\nOlá! Digite o código do produto desejado: ");
						produtoSelecionado = leia.nextInt();
						if(produtoSelecionado <= 0 || produtoSelecionado > 10)
						{
							System.out.println("Código invalido!! Por favor insira o código novamente.");
						} else if (armazem.itensCarrinho.contains(nomeProdutos.get(produtoSelecionado - 1))){
							System.out.println("Produto já existe no carrinho.");
						} else {
							break;
						}
					}
					while(true)
					{
						System.out.print("Insira a quantidade desejada do produto: ");
						qtdeConsumir = leia.nextInt();
						if (qtdeConsumir <= armazem.produtosEstoque.get(produtoSelecionado - 1)) {//if(qtdeConsumir <= produtosEstoque[produtoSelecionado - 1])
							armazem.consumirProdutos(produtoSelecionado, qtdeConsumir);
							break;
						}
						else
						{
							System.out.println("Quantidade indisponível em estoque, digite novamente...");
						}
					}
					System.out.print("Deseja continuar sua compra? [S/N] ");
					resposta = leia.next().toUpperCase().charAt(0);
					if (resposta == 'S') {
						System.out.println("Boas compras :D");
					} else if (resposta == 'N' ) {
						break;
					}
				}
				System.out.println("\nPRODUTOS NO CARRINHO: ");
				System.out.println("Nome \t Qtde. no carrinho \t\t Preço unit.(R$) \t\t Preço Total (R$)");
				for(int cont = 0; cont < armazem.qtdeCarrinho.size(); cont++) {
					totalComprasCar.add(armazem.precoCarrinho.get(cont) * armazem.qtdeCarrinho.get(cont));
					System.out.printf("%s \t\t %d \t\t\t\t %.2f \t\t\t\t %.2f\n", armazem.itensCarrinho.get(cont), armazem.qtdeCarrinho.get(cont), armazem.precoCarrinho.get(cont), totalComprasCar.get(cont));
				}
				for (double precoIndividual : totalComprasCar) {
					valorTotal += precoIndividual;
					//valorTotal = valorTotal + preco Individual;
				}
				valorComImposto = (valorTotal + (valorTotal * 0.09));
				System.out.printf("\nO valor total da compra com Imposto de 9%%: R$: %.2f", valorComImposto);
				System.out.println("\nOpções de Pagamento: ");
				System.out.println("\n\t[1]À vista em dinheiro ou cheque, recebe 20% de desconto. \n\t[2]À vista no cartão de crédito, recebe 15% de desconto, \n\t[3]Em duas vezes, preço normal de etiqueta sem juros, \n\t[4]Em três vezes, preço normal de etiqueta mais juros de 10%\n");
				while(true) {
					System.out.print("\nQual seria a forma de pagamento?");
					pagamento = leia.nextInt();
					if(pagamento == 1) {
						valorComImposto = valorComImposto - (valorComImposto * 0.20);
						desconto = (valorComImposto * 0.20);
						System.out.printf("Valor total da compra com desconto é: R$ %.2f", valorComImposto);
						break;
					}else if(pagamento == 2) {
						valorComImposto = valorComImposto - (valorComImposto * 0.15);
						desconto = (valorComImposto * 0.15);
						System.out.printf("Valor total da compra com desconto é: R$ %.2f", valorComImposto);
						break;
					}else if (pagamento == 3) {
						valorParcelado = valorComImposto / 2;
						System.out.printf("Valor de cada uma das 2 parcelas: R$ %.2f ", valorParcelado);
						break;
					} else if (pagamento == 4) {
						juros = valorComImposto * 0.10;
						valorComImposto += juros;
						valorParcelado = valorComImposto / 3;
						System.out.printf("Valor de cada uma das 3 parcela é: R$ %.2f ", valorParcelado);
						break;
					}
					else
						System.out.println("Opção inválida. Tente novamente");
				}
				for(int x = 0;x <= 100; x++) {
					System.out.println();
				}
				tributos = valorComImposto * .09;
				System.out.println("GENERATIONS STORE");
				System.out.println("Rua do Bôbo, nº0 - Mercadinho - LTDA");
				System.out.println("CNPJ: 1234554321-00");
				System.out.println("\n\n\t\t\t\t\tNOTA FISCAL");
				System.out.println("=============================================================================================");
				System.out.println("\nPRODUTO\t\tQTND. PRODUTOS\t\tPREÇO UNIT.\t\t  PREÇO TOTAL\n");
				for(int x = 0; x < armazem.qtdeCarrinho.size(); x++) {
					System.out.printf("%s\t\t    %d\t\t\t  R$%.2f\t\t    R$%.2f\n", armazem.itensCarrinho.get(x), armazem.qtdeCarrinho.get(x), armazem.precoCarrinho.get(x), totalComprasCar.get(x));
					System.out.println("=============================================================================================");
				}
				System.out.println("\n\n");
				if (pagamento == 1 || pagamento == 2) {
					System.out.printf("DESCONTO NA COMPRA: R$%.2f\n", desconto);
					System.out.printf("VALOR TOTAL A SER PAGO:R$%.2f\n", valorComImposto);
				}else if(pagamento == 3) {
					System.out.printf("VALOR PRA CADA UMA DAS 2 PARCELAS: R$%.2f\n", valorParcelado);
					System.out.printf("VALOR TOTAL: R$%.2f\n", valorComImposto);
				}
				else if (pagamento == 4) {
					System.out.printf("JUROS COBRADO: R$%.2f\n", juros);
					System.out.printf("VALOR TOTAL: R$%.2f\n", valorComImposto);
					System.out.printf("VALOR PRA CADA UMA DAS 3 PARCELAS: R$%.2f\n", valorParcelado);
				}
				System.out.printf("VALOR TRIBUTÁRIO: R$%.2f\n", tributos);
				while(true) {
					System.out.print("\nEfetuar nova compra? [S/N]");
					respostaFinal = leia.next().toUpperCase().charAt(0);
					if (respostaFinal == 'S') {
						for(int x = 0; x <= 30; x++) 
							System.out.println();
						break;
					} else if (respostaFinal == 'N') {
						System.out.print("\n\n\n\n\n\nObrigado pela preferência. Volte sempre! :D");
						on = false;
						break;
					} else {
						System.out.println("Resposta inválida!");
					}
				}
			}
			/*for(String itens : armazem.nomeProdutos) {
				System.out.println(itens);
			}
			armazem.consumirProdutos(5, 7);
			for(Integer itens : armazem.produtosEstoque) {
				System.out.println(itens);
			}*/
		}
		public static void fachada() {
			System.out.println("\t\t\tGENERATIONS STORE");
			System.out.println("==================================================================");
			System.out.println("\nCÓDIGO\t\tPRODUTO\t\tQTND. PRODUTOS\t\tPREÇO UNIT.\t\t\n");
		}
	}

