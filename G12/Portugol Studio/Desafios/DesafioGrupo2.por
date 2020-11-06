programa
{
	
	funcao inicio()
	{
		
		cadeia produtos[10] = {"Arroz de 5Kg","Arroz de 1Kg","Feijão de 1kg","Farofa de 500g","Nescau de 400g","Peça de picanha 1kg","Cartela com 12 Ovos",
						   "Cartela com 24 Ovos", "Coca-Cola 2L", "Coca-Cola 600ml"}
		
		real precoProd[10] = {30.00, 10.00, 12.00, 6.00, 7.00, 109.99, 12.99,20.99, 6.35, 4.00 }
		real precoTotal=0.0
		real z=0.0
	
		inteiro codProduto[10]
	  	inteiro estoque[10] = {10,10,10,10,10,10,10,10,10,10}
	  	cadeia carrinho[10]
	  	real carrinhoPreco[10]
	  	logico confirmacao
	  	caracter continua
	  	inteiro compraProduto
	  	inteiro qntProduto
	  	inteiro x=0, i=0
	  	inteiro pagamento
		// Passando 0 até 9 para ser o código de cada produto
		para( i=0; i<10; i++){
			codProduto[i] = i
		}
		faca{
			faca {
				// Pedir entrada do produto e a quantidade
				para( i=0; i<10; i++){
					escreva( codProduto[i] + " - " + produtos[i] + "\t\t\tR$:" + precoProd[i] + "\n")
					
				}
				escreva("\nDigite o código do produto que deseja comprar: ")
					leia(compraProduto)
					
				escreva("Quantos produtos desejar comprar: ")
					leia(qntProduto)
				// Verificação se há produto em estoque
				escreva("\n" + produtos[compraProduto] + "\n")
				se(qntProduto < estoque[compraProduto]){
					estoque[compraProduto] = estoque[compraProduto] - qntProduto
					escreva("O estoque é de: ",estoque[compraProduto]+ " unidades \n")
				}
				senao se(qntProduto > estoque[compraProduto]){
					escreva("Estoque insuficiente, temos apenas " + estoque[compraProduto] + " produtos")
				}
				// Se desejar continuar comprando
				escreva("\nDeseja continuar comprando S / N: ")
					leia(continua)
				se(continua == 's' ou continua == 'S'){
					confirmacao = verdadeiro
				}
				senao {
					confirmacao = falso
					
				}
					
				
			}enquanto(confirmacao == verdadeiro)
			precoTotal=precoProd[compraProduto]*qntProduto
			escreva("\n\nSUAS COMPRAS SÃO \t\t PREÇO UNIDADE \t\t TOTAL \n\n")
			faca{
				se(x>=0 e x<10){
			}
				
				x=x+1
			
				se(produtos[compraProduto]==produtos[compraProduto]){
					escreva(x," - ",produtos[compraProduto],"\t\tR$:" + precoProd[compraProduto] +"\t\t\t",precoTotal+" \n")
				}
					z=z+precoTotal
					escreva("\n Total a pagar é de: ",z, " Reais")
				
				}enquanto(confirmacao==verdadeiro)	
				
				
				
				escreva("\n\nDeseja continuar S / N: ")
				leia(continua)
				
				se(continua == 's' ou continua == 'S'){
				confirmacao = verdadeiro
				}
				senao{
					confirmacao = falso
					
				}
				
		
					
		}enquanto(confirmacao == verdadeiro)

		
		escreva("Forma de pagamento: \n1 - Pagamento à vista em dinheiro ou cheque. \n2 - Pagamento à vista em cartão de crédito. \n3 - Pagamento parcelado em 2x. \n4 - Pagamento parcelado em 3x.\n" )
		leia(pagamento)
		enquanto(pagamento!=1 e pagamento!=2 e pagamento!=3 e pagamento!=4){
			escreva("Essa opção é invalida, tente novamente!\n")
				escreva("Forma de pagamento: \n1 - Pagamento à vista em dinheiro ou cheque. \n2 - Pagamento à vista em cartão de crédito. \n3 - Pagamento parcelado em 2x. \n4 - Pagamento parcelado em 3x.\n" )
				leia(pagamento)
		
		se(pagamento == 1){
			z = (z-((z/100)*20))
			escreva("O preço do produto será: "+z+"R$ com desconto de 20% devido a forma de pagamento.")
		} 
		senao se(pagamento == 2){
			z = (z-((z/100)*15))
			escreva("O preço do produto será: "+z+"R$ com desconto de 15% devido a forma de pagamento.")
		}	
		senao se(pagamento == 3){
			escreva("O preço do produto será: "+z+"R$ sem juros")
		}
		senao se(pagamento == 4){
			z = (z+((z/100)*10))
			escreva("O preço do produto será: "+z+"R$ com juros de 10% devido a forma de pagamento.")		
		}
		}
	)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3685; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */