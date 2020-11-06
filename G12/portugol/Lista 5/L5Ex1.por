programa
{
	
	funcao inicio()
	{

		/*
		 * Elabore um programa que calcule o que deve ser pago por um produto, 
		 * considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
		 * Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida 
		 * e efetuar o cálculo adequado.
			Código Condição de pagamento
		1 À vista em dinheiro ou cheque, recebe 20% de desconto
		2 À vista no cartão de crédito, recebe 15% de desconto
		3 Em duas vezes, preço normal de etiqueta sem juros
		4 Em três vezes, preço normal de etiqueta mais juros de 10%
		 */
				
		inteiro precoPr
		inteiro pagamento

		escreva("Digite o preço do produto: ")
		leia(precoPr)

		escreva("Forma de pagamento: \n1 - Pagamento à vista em dinheiro ou cheque. \n2 - Pagamento à vista em cartão de crédito. \n3 - Pagamento parcelado em 2x. \n4 - Pagamento parcelado em 3x.\n" )
		leia(pagamento)

		se(pagamento == 1){
			precoPr = (precoPr-((precoPr/100)*20))
			escreva("O preço do produto será: "+precoPr+"R$ com desconto de 20% devido a forma de pagamento.")
		} 
		senao se(pagamento == 2){
			precoPr = (precoPr-((precoPr/100)*15))
			escreva("O preço do produto será: "+precoPr+"R$ com desconto de 15% devido a forma de pagamento.")
		}	
		senao se(pagamento == 3){
			escreva("O preço do produto será: "+precoPr+"R$ sem juros")
		}
		senao se(pagamento == 4){
			precoPr = (precoPr+((precoPr/100)*10))
			escreva("O preço do produto será: "+precoPr+"R$ com juros de 10% devido a forma de pagamento.")		
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 294; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */