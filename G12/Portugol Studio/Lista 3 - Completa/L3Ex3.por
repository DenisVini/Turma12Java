programa
{
	
	funcao inicio()
	{
			//Elaborar um programa que efetue a leitura sucessiva 
			//de valores numéricos e apresente no final o total do somatório, 
			//a média e o total de valores lidos. O programa deve fazer as 
			//leituras dos valores enquanto o usuário estiver fornecendo 
			//valores positivos. Ou seja, o programa deve parar
			//quando o usuário fornecer um valor negativo.
		
		inteiro x = 0
		inteiro xMed = 0
		real xSoma = 0 
		inteiro xTotal = 0
		inteiro xx = 0

		
		enquanto(x >= 0){
			
			escreva("\nO valor numérico X: ")
			leia(x)
			xSoma = xSoma + 1
			xTotal = xTotal + x 
			xMed = xTotal / xSoma
			limpa()
			escreva("O valor total de X é: ",xTotal,"\n")
			escreva("O total de numeros somados foram: ",xSoma)
			escreva("\nA média dos numeros somados: ",xMed)
			
			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 353; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */