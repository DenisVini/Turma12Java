programa
{
	
	funcao inicio()
	{
		inteiro numeroUm
		inteiro numeroDois
		inteiro numeroTres
		inteiro numeroQuatro
		inteiro result1
		inteiro result2
		inteiro result3
		inteiro result4


		
		escreva("Digite o numero 1: ")
		leia(numeroUm)

		escreva("Digite o numero 2: ")
		leia(numeroDois)

		escreva("Digite o numero 3: ")
		leia(numeroTres)

		escreva("Digite o numero 4: ")
		leia(numeroQuatro)


		result3 = (numeroTres*numeroTres)
		se (result3 >= 1000){
			escreva("\nFIM DO PROGRAMA")
		}
		senao {
		
		result1 = (numeroUm*numeroUm)
		escreva("\nO resultado do numero1 ao quadrado é: "+result1+" ")

		result2 = (numeroDois*numeroDois)
		escreva("\nO resultado do numero2 ao quadrado é: "+result2+" ")

		escreva("\nO resultado do numero3 ao quadrado é: "+result3+" ")
		result4 = (numeroQuatro*numeroQuatro)
		escreva("\nO resultado de numero4 ao quadrado é: "+result4+" ")
		
		}
	}
		
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 823; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */