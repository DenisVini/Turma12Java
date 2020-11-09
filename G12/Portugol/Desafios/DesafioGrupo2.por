programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		
		cadeia produtos[10] = {"Arroz de 5Kg","Arroz de 1Kg","Feijão de 1kg","Farofa de 500g","Nescau de 400g","Peça de picanha 1kg","Cartela com 12 Ovos",
						   "Cartela com 24 Ovos", "Coca-Cola 2L", "Coca-Cola 600ml"}
		
		real precoProd[10] = {30.00, 10.00, 12.00, 6.00, 7.00, 109.99, 12.99,20.99, 6.35, 4.00 }
		real precoTotal=0.0
		real z=0.0
	
		inteiro codProduto[10]
	  	inteiro estoque[10] = {10,10,10,10,10,10,10,10,10,10}
	  	inteiro carrinho[10]
	  	inteiro carrinhoPreco[10]
	  	logico confirmacao=verdadeiro
	  	caracter continua
	  	inteiro compraProduto
	  	inteiro qntProduto
	  	inteiro i=0
	  	inteiro contador=0
	  	inteiro pagamento
	  	logico validacao=verdadeiro
	  	inteiro parcela=0
	  	cadeia c,m,r,l,k,j,t,w
		// Passando 0 até 9 para ser o código de cada produto
		para( i=0; i<10; i++){
			codProduto[i] = i
		}
		faca{
			escreva("---D'tudo um Pouco---\n\n\n")
			faca {
				// Pedir entrada do produto e a quantidade
				
				escreva("  PRODUTOS \t\t\t\t PREÇOS\n")
				para( i=0; i<10; i++){
					escreva("_________________________________________________________\n",codProduto[i] + " - " + produtos[i]+ + "\t\t\tR$:" + precoProd[i] + "\n")
					
				}
				escreva("_________________________________________________________\n")
				faca{
					escreva("\n\nDigite o código do produto que deseja comprar: ")
						leia(compraProduto)
					se(compraProduto>=0 e compraProduto<=9){
						
							carrinho[contador]=compraProduto
						
						validacao=falso
					}senao{
						
						escreva("Digite um código válido\n ")
						validacao=verdadeiro
						
					}
				}enquanto(validacao==verdadeiro)
				faca{
			
					escreva("Quantos Unidades desejar comprar: ")
					leia(qntProduto)
					limpa()
					se(qntProduto>0 e qntProduto<=10){
						
						// Verificação se há produto em estoque
						escreva("\n" + produtos[compraProduto] + "\n\n")
						escreva("Unidades compradas: "+qntProduto)
						se(qntProduto <= estoque[compraProduto]){
							carrinhoPreco[contador]=qntProduto
							estoque[compraProduto] = estoque[compraProduto] - qntProduto
							escreva("\nO estoque restante é de: ",estoque[compraProduto]+ " unidades \n")
						}
						validacao=falso
					}senao se(qntProduto>10){
						escreva("\nEstoque insuficiente, temos apenas " + estoque[compraProduto] + " produtos\n\n")
						validacao=verdadeiro
					}senao{
						escreva("\nQuantidade de produto inválida\n\n")
						validacao=verdadeiro
					}
				}enquanto(validacao==verdadeiro)
				// Se desejar continuar comprando
				faca{
					
					escreva("\nDeseja continuar comprando S / N: ")
						leia(continua)
						limpa()
						escreva("\n" + produtos[compraProduto] + "\n\n")
						escreva("Unidades compradas: "+qntProduto)
						escreva("\nO estoque restante é de: ",estoque[compraProduto]+ " unidades \n\n")
						
					se(continua == 's' ou continua == 'S' ou continua == 'n' ou continua == 'N'){
						se(continua == 's' ou continua == 'S'){
							confirmacao = verdadeiro
							contador++
						}
						senao{
							confirmacao = falso
							
						}
						validacao=falso
					}senao{
						validacao=verdadeiro
						escreva("Digite S ou N")
					}
				}enquanto(validacao==verdadeiro)
				limpa()
				escreva("---D'tudo um Pouco---\n\n\n")
			}enquanto(confirmacao == verdadeiro)
			
			precoTotal=precoProd[compraProduto]*qntProduto
			escreva("_________________________________________________________________\n                              CARRINHO\n_________________________________________________________________\nSUAS COMPRAS SÃO \t\tUNIDADE \t\tTOTAL\n_________________________________________________________________\n")
			
				se(contador==0){
					escreva("0 - ", produtos[carrinho[0]],"\t\t",precoProd[carrinho[0]],"\t\t\t",mat.arredondar(( precoProd[carrinho[0]]*carrinhoPreco[0]),2)," \n_________________________________________________________________\n")
					z=z+precoProd[carrinho[0]]*carrinhoPreco[0]
				}senao{
						
					para(i=0;i<=contador;i++){
							
						escreva(i," - ",produtos[carrinho[i]],"\t\t",precoProd[carrinho[i]],"\t\t\t",mat.arredondar(( precoProd[carrinho[i]]*carrinhoPreco[i] ),2),"\n_________________________________________________________________\n")
						z=z+precoProd[carrinho[i]]*carrinhoPreco[i]
								
							}
						}
					
					escreva("\n\n Total a pagar é de: ",mat.arredondar(z,2), " Reais")
					escreva("\n\n")
			
		faca{
			
			
			
			escreva(" _____________________________________________\n|             FORMAS DE PAGAMENTO             |\n|_____________________________________________|\n|1 - Pagamento à vista em dinheiro ou cheque. | \n|_____________________________________________|\n|2 - Pagamento à vista em cartão de crédito.  | \n|_____________________________________________|\n|3 - Pagamento parcelado no Cartão.           | \n|_____________________________________________|\n\n       Digite um número de (1 a 3): " )
			leia(pagamento)
			se(pagamento>=1 e pagamento<=3){
				validacao=falso
			}senao{
				validacao=verdadeiro
			}
			
		}enquanto(validacao==verdadeiro)	
		limpa()
		escreva("---D'tudo um Pouco---\n\n\n")
		se(pagamento == 1){
			z = (z+((z/100)*9))
			z=(z-(z/100)*20)
			
			escreva("O preço do produto será:  R$ "+mat.arredondar(z,2)+"  -- com acrescimo de 9% de imposto e desconto de 20% devido a forma de pagamento.")
			
		}senao se(pagamento == 2){
			z = (z+((z/100)*9))
			z = (z-((z/100)*15))
			escreva("O preço do produto será: R$ "+mat.arredondar(z,2)+"   -- com acrescimo de 9% de imposto e desconto de 15% devido a forma de pagamento.")
			
		}senao se(pagamento == 3){
			faca{
			escreva("Parcelado em 2 ou 3 vezes ? ")
			leia(parcela)
			se(parcela==2 ou parcela==3){
				se(parcela==2){
					z = (z+((z/100)*9))
					escreva("O preço do produto será R$: "+mat.arredondar(z,2)+"  -- com acrescimo de 9% de impostos e sem juros")
					escreva("\nO preço parcelado em 2 vezes será de:  R$: "+mat.arredondar((z/2),2))
				}senao{
					z = (z+((z/100)*19))
					escreva("O preço do produto será R$: "+mat.arredondar(z,2)+"  -- com acrescimo de 9% de impostos e juros de 10%")
					escreva("\nO preço parcelado em 3 vezes será de:  R$: "+mat.arredondar((z/3),2))
				}
			validacao=falso
			}senao{
				validacao=verdadeiro
			}
			}enquanto(validacao==verdadeiro)
		}
				faca{
					
					escreva("\n\nDeseja continuar S / N: ")
					leia(continua)
					se(continua=='S' ou continua=='s' ou continua=='N' ou continua=='n'){
						se(continua == 's' ou continua == 'S'){
						confirmacao = verdadeiro
						z=0.0
						}
						senao{
							confirmacao = falso
							limpa()
							
							l="À vista, dinheiro ou em cheque"
							c="À vista, cartão de credito"
							m="Parcelado em 2 vezes"
							r="Parcelado em 3 vezes"
							k="Impostos de 9% e desconto de 20%"
							j="Impostos de 9% e desconto de 15%"
							t="com acrescimo de 9% de impostos e sem juros"
							w="com acrescimo de 9% de impostos e juros de 10%"
							
							escreva("---D'tudo um Pouco---\n\n\n")
							escreva("    NOTA FISCAL\n\n")
							se(pagamento==1){
								se(contador==0){
									escreva(produtos[carrinho[0]])
									escreva("\nQuantidade: ",qntProduto)
									escreva("\n",k,"\n")
									escreva("\nForma de Pagamento: ",l)
									escreva("\nPreço: ",(z)," Reais")
									
								}senao{
										
									para(i=0;i<=contador;i++){
							
										escreva(produtos[carrinho[i]]," - ",carrinhoPreco[i]," Uni","\n")
							
									}
										
										z=z+precoProd[carrinho[i]]*carrinhoPreco[i]
										escreva("\n",k,"\n")
										escreva("\nForma de Pagamento: ",l)
										escreva("\nPreço Total: "+mat.arredondar(z,2), " Reais")
								}
								
							}senao se(pagamento==2){
								se(contador==0){
									escreva(produtos[carrinho[0]])
									escreva("\nQuantidade: ",qntProduto)
									escreva("\n",j,"\n")
									escreva("\nForma de Pagamento: ",c)
									escreva("\nPreço: ",(z)," Reais")
									
								}senao{
										
									para(i=0;i<=contador;i++){
							
										escreva(produtos[carrinho[i]]," - ",carrinhoPreco[i]," Uni","\n")
							
									}
										
										z=z+precoProd[carrinho[i]]*carrinhoPreco[i]
										escreva("\n",j,"\n")
										escreva("\nForma de Pagamento: ",c)
										escreva("\nPreço Total: "+mat.arredondar(z,2), " Reais")
								}
								
							}senao se(pagamento==3){
								se(parcela==2){
									se(contador==0){
										escreva(produtos[carrinho[0]])
										escreva("\nQuantidade: ",carrinhoPreco[i])
										escreva("\n",t,"\n")
										escreva("\nForma de Pagamento: ",m)
										escreva("\nPreço: ",z," Reais")
										
									}senao{
											
										para(i=0;i<=contador;i++){
								
											escreva(produtos[carrinho[i]]," - ",carrinhoPreco[i]," Uni","\n")
								
										}
										
										z=z+precoProd[carrinho[i]]*carrinhoPreco[i]
										escreva(t,"\n")
										escreva("\nForma de Pagamento: ",m)
										escreva("\nPreço Total: "+mat.arredondar(z,2), " Reais")
									}
								}senao se(parcela==3){
									se(contador==0){
										escreva(produtos[carrinho[0]])
										escreva("\nQuantidade: ",qntProduto)
										escreva("\n",w,"\n")
										escreva("\nForma de Pagamento: ",r)
										escreva("\nPreço: ",z," Reais")
										
									}senao{
											
										para(i=0;i<=contador;i++){
								
											escreva(produtos[carrinho[i]]," - ",carrinhoPreco[i]," Uni","\n")
								
										}
										
										z=z+precoProd[carrinho[i]]*carrinhoPreco[i]
										escreva("\n",w,"\n")
										escreva("\nForma de Pagamento: ",r)
										escreva("\nPreco por parcela: ",mat.arredondar((z/3),2), " Reais")
										escreva("\nPreço Total: "+mat.arredondar(z,2), " Reais")
									}
								}
							}
						}
						validacao=falso	
					}senao{
						validacao=verdadeiro
					}
				}enquanto(validacao==verdadeiro)
				
		}enquanto(confirmacao == verdadeiro)
		
	)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10080; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */