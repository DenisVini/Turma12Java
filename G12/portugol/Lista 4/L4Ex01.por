programa
{
	
	funcao inicio()
	{
		//   Faça um programa que crie um vetor por leitura com
		//5 valores de pontuação de uma atividade e o escreva em seguida.
		//Encontre após a maior pontuação e a apresente.

		inteiro vet[5], inteiro maiorP =0

		para(inteiro x=0; x<5;x++){
			escreva("Digite um valor: ")
			leia(vet[x])
			limpa()
			se(vet[x]> maiorP){
				maiorP = vet[x]
			}
			
		}
		para(inteiro x=0; x <5; x++){
			escreva("\nPosição",x+1,": ",vet[x])
			
			}
				escreva("\n\nMaior valor: ",maiorP)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 491; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */