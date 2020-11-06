programa
{
	
	funcao inicio()
	{
		//Faça um programa que calcula e escreve a seguinte soma:
		//soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50

		inteiro s=1
		inteiro x=1
		real y=1
		real result 
		real resultado = 0
			
			enquanto (x<=99){
				result = x/y
				
			 escreva("\nO valor da divisão é: ")
			 escreva("\n",x,"/",y," = "+result+" + \n")
			 x = x +2
			 y = y +1
			 resultado = x + y
				}escreva("O resultado da conta é:"+resultado)
				
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 215; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */