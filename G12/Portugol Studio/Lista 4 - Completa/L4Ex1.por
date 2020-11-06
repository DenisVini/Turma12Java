programa
{
	
	funcao inicio()
	{
		//   Faça um programa que crie um vetor por leitura com
		//5 valores de pontuação de uma atividade e o escreva em seguida.
		//Encontre após a maior pontuação e a apresente.
		
		inteiro num[5] //declarando vetor
		inteiro x
		inteiro maiorP=0
		
		para(x=0;x<5;x++)
		{
			escreva("Digite um valor: ")
			leia(num[x])
			limpa()	
			se(num[x] > maiorP){
				maiorP = num[x]
			}
		}
		para(x=0; x<5 ;x++)
		{
			escreva("Valor posição: ",x+1,":",num[x],"\n")
		}	
		
		para(x=5; x<=0 ;x--)
		{
			escreva("Valor posição: ",x+1,":",num[x],"\n")
		}	
		escreva("O valor da maior pontuação é: ",maiorP)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 365; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */