programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		
/**
 * Crie um programa que receba valores do usuário para 
 * preencher uma matriz 3X3, e em seguida, 
 * exiba a soma dos valores dela e a soma dos valores 
 * da primeira diagonal, ou seja, diagonal principal.
 */
		const inteiro linha  = 3
		const inteiro colu = 3
		inteiro quadr8[linha][colu]
		inteiro valorLinha = 0
		inteiro valorColu = 0
		inteiro x=0
		inteiro y=0
		inteiro somaDiagonal = 0
		
		para(x=0;x<linha;x++)
		{
			para(y=0;y<colu;y++){
				quadr8[x][y]=Util.sorteia(1, 6)
				se(x==y){
					somaDiagonal = somaDiagonal +	quadr8[x][y]
				}
			}
		}
		para(x=0;x<linha;x++)
		{
			para(y=0;y<colu;y++)
			{
			escreva(quadr8[x][y])
			escreva(" ")
			}
			escreva("\n")
			}
			escreva("O valor da soma diagonal é: ",somaDiagonal)
			
 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 812; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */