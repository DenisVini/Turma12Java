import java.util.Scanner;
public class loja {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Declaração das váriaveis apenas para exemplos
		int qntProduto, compraProduto=0; int pagamento; int contador = 0; int qntProduto ; int i;
		int z;
		char continua;
		boolean confirmacao = true;
		String l; String c; String m; String r; String k; String j; String t; String w;
		
		String produtos[] = new String[10];
		int estoque[] = new int[10];
		
		System.out.println("Quantos produtos deseja comprar: ");
			qntProduto = entrada.nextInt();
		System.out.println("\n" + produtos[compraProduto]);
		
		// Verificação se tem produto dentro no estoque
		if(qntProduto < estoque[compraProduto])
		{
			estoque[compraProduto] = estoque[compraProduto] - qntProduto;
			System.out.println("O estoque é de: " + estoque[compraProduto] + " unidades");
		}
		else if(qntProduto > estoque[compraProduto])
		{
			System.out.println("Estoque insuficiente, temos apenas " + estoque[compraProduto] + " produtos");
		}
		
		// Se deseja fazer outra compra
		System.out.println("Desejar continuar comprando S/N: ");
			continua = entrada.next().toUpperCase().charAt(0);
		
		if(continua == 'S') {
			confirmacao = true;
		}
		else {
			confirmacao = false;

			l="À vista, dinheiro ou em cheque";
			c="À vista, cartão de credito";
			m="Parcelado em 2 vezes";
			r="Parcelado em 3 vezes";
			k="Impostos de 9% e desconto de 20%";
			j="Impostos de 9% e desconto de 15%";
			t="com acrescimo de 9% de impostos e sem juros";
			w="com acrescimo de 9% de impostos e juros de 10%";
			System.out.println("---D'tudo um Pouco---/n/n/n");
			System.out.println("    NOTA FISCAL;/n/n");
			if(pagamento == 1) {
				if(contador==0) {
					System.out.println(produtos[carrinho[0]]);
					System.out.println("/n"+k+"/n");
					System.out.println("/nPreço: "+z+"R$");
				}else {
					for (i = 0; i<contador;i++) {
						System.out.println(produtos[carrinho[i]]+" - "+carrinhoPreco[i]+" Uni/n");
					}
					z=z+precoProd[carrinho[i]]*carrinhoPreco[i];
					System.out.println("/n"+k+"/n");
					System.out.println("/nForma de pagamento: "+l);
					System.out.println("/nPreço Total: "+Math.round(z,2)+"R$");
					}
				}else if(pagamento == 2) {
					if (contador ==0) {
						System.out.print(produtos[carrinho[0]]);
						System.out.print("\nQuantidade: "+qntProduto);
						System.out.println("/n"+j+"/n");
						System.out.println("/nForma de Pagamento: "+c);
						System.out.println("/nPreço: "+z+"R$");		
					}else {
						for(i=0;i<contador;i++) {
							System.out.println(produtos[carrinho[i]]+" - "+carrinhoPreco[i]+" Uni/n");
						}
						z=z+precoProd[carrinho[i]]*carrinhoPreco[i];
						System.out.println("/n"+j+"/n");
						System.out.println("/nForma de pagamento: "+c);
						System.out.println("/nPreço Total: "+Math.round(z,2)+"R$");
					}
					
			}else if(pagamento == 3) {
				if(parcela == 2) {
					if (contador == 0) {
						System.out.print(produtos[carrinho[0]]);
						System.out.print("\nQuantidade: "+qntProduto);
						System.out.println("/n"+t+"/n");
						System.out.println("/nForma de Pagamento: "+m);
						System.out.println("/nPreço: "+z+"R$");
					}else {
						for (i=0;i<=contador;i++) {
							System.out.println(produtos[carrinho[i]]+" - "+carrinhoPreco[i]+" Uni/n");
						}
						z=z+precoProd[carrinho[i]]*carrinhoPreco[i];
						System.out.println("/n"+t+"/n");
						System.out.println("/nForma de pagamento: "+m);
						System.out.println("/nPreço Total: "+Math.round(z,2)+"R$");
					}else if(parcela==3) {
						if(contador==0) {
							System.out.print(produtos[carrinho[0]]);
							System.out.print("\nQuantidade: "+qntProduto);
							System.out.println("/n"+w+"/n");
							System.out.println("/nForma de Pagamento: "+r);
							System.out.println("/nPreço: "+z+"R$");
						}else {
							for(i=0;i<=contador;i++) {
								System.out.println(produtos[carrinho[i]]+" - "+carrinhoPreco[i]+" Uni/n");
							}
							z=z+precoProd[carrinho[i]]*carrinhoPreco[i];
							System.out.println("/n"+w+"/n");
							System.out.println("/nForma de pagamento: "+r);
							System.out.println("/nPreço por parcela: "+Math.round((z/3),2)+"R$");
							System.out.println("/nPreço total: "+Math.round(z,2)+"R$");
						}
					}
				}
			}	while(confirmacao == true);
			
			
			
				
			}
	}
}