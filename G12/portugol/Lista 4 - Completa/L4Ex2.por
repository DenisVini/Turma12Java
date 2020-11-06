programa
{
	inclua biblioteca Util
	
	funcao inicio() 
	{

		//Um dado é lançado 10 vezes e o valor correspondente é anotado.
		//Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
		//A seguir determine e imprima a média aritmética dos lançamentos, contabilize e
		//apresente também quantas foram as ocorrências da maior pontuação.
		const inteiro limite = 10
			 inteiro lan[limite]
			 inteiro x=0
			 inteiro maiorP=0
			 inteiro mediaP = 0	
			 inteiro somaP = 0
			 inteiro contador
		para(x=0;x<limite;x++)
		{
			lan[x] = Util.sorteia(1,6)
			escreva("\nValor na posição: ", x+1, " : ",lan[x])
			somaP = somaP + lan[x]
			mediaP = somaP / limite
		se(lan[x] > maiorP){
			maiorP=lan[x]
			
		}
		}
		escreva("\nTotal de valores somados: ",somaP)
		escreva("\nMédia aritimética: ",mediaP)
		escreva("\nMaior valor: ",maiorP)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */