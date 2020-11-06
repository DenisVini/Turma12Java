programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro vet[3], mat[3][3], x = 0, l = 0, c= 0


		
		para( x=0;x<3;x++)
		{
			escreva("\nValores do vetor:\n ")
				vet[x]= Util.sorteia(1, 9)

				escreva(+vet[x])
		}
		escreva("\n\nMatriz:\n")
		para(l=0; l<3 ; l++){
			escreva("\n")
			para(c=0;c<3;c++){
		
		mat[l][c] = Util.sorteia(1, 9)
		escreva(mat[l][c])
		escreva("	")}
		
		}
		escreva("\n")
	}
}
//escreva(vet[l] = vet[l] * mat[l][c])
		//escreva(" ")
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 414; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */