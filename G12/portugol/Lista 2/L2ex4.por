programa
{
	
	funcao inicio()
	{
		inteiro numero


			escreva("Escreva o numero inteiro positivo ou negativo: ")
		leia(numero)

		//processamento
		se (numero < 0) 
		{
			escreva("O numero digitado é negativo")		
		}
		senao se(numero >0){
			se((numero%2)==0){
				escreva("O numero digitado é positivo e par!")
			}
			senao
			{
				escreva("O numero digitado é positivo e impar!")	
			}
		}
		senao se (numero == 0){
			escreva("O numero 0 é um numero neutro")
		}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 480; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */