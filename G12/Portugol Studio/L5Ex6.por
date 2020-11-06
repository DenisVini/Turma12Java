programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro vet[3], mat[3][3], x = 0, l = 0, c= 0


		escreva("\nValores do vetor:\n")
		para( x=0;x<3;x++)
		{
			
				vet[x]= Util.sorteia(1, 9)

				escreva(+vet[x],"\n")
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
		
		escreva("\nResultado: ")
		para(l=0;l<3; l++){
			escreva("\n")
			para(c=0;c<3;c++){
				escreva(" "+vet[c]*mat[l][c])
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 424; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */