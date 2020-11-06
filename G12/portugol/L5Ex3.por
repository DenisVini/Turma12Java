programa
{
	
	funcao inicio()
	{
		/*
		 * Escrever um programa que leia uma quantidade desconhecida de números 
		 * e conte quantos deles estão nos seguintes intervalos: 
		 * [0-25], [26-50], [51-75] e [76-100]. 
		 * A entrada de dados deve terminar quando for lido um número negativo.
		 */
		
		inteiro num = 0
		inteiro g1 = 0
		inteiro g2 = 0
		inteiro g3 = 0
		inteiro g4 = 0

		enquanto(num>=0)
	{
		escreva("Digite um valor positivo e para sair digite um valor negativo: ")
		leia(num)
		se(num >=0 e num <=25){
			g1++
		}senao se (num>25 e num <=50){
			g2++
		}senao se (num >50 e num <=75){
			g3++
		}senao se (num>75 e num <=100){
			g4++
		}
	}limpa()
			escreva("\nA quantidade digitada de numeros entre [0-25]:   "+g1)
			escreva("\nA quantidade digitada de numeros entre [25-50]:  "+g2)
			escreva("\nA quantidade digitada de numeros entre [50-75]:  "+g3)
			escreva("\nA quantidade digitada de numeros entre [75-100]: "+g4)
			
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 669; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */