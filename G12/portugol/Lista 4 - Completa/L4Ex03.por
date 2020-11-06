programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro l = 0 , c = 0, z = 0
		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6]

			para(l=0;l<4;l++)
			{
				para(c=0;c<6;c++)
				{
					N1[l][c] = Util.sorteia(1, 9)
					N2[l][c] = Util.sorteia(1, 9)
					M1[l][c] = N1[l][c] + N2[l][c]
					M2[l][c] = N1[l][c] + N2[l][c]
					
				}
			}
			escreva("Matriz N1:\n ")
			para(l=0;l<4;l++){
				para(c=0;c<6;c++){
					escreva(N1[l][c],"	")
					z=1
				}		escreva("\n ")
			}
			escreva("\nMatriz N2: \n ")
			para(l=0;l<4;l++){
				para(c=0;c<6;c++){
					escreva(N2[l][c],"	")
					
				}		escreva("\n ")
			}
			escreva("\nMatriz M1: \n ")
			para(l=0;l<4;l++){
				para(c=0;c<6;c++){
					escreva(M1[l][c],"	")
					
				}		escreva("\n ")
			}
					escreva("\nMatriz M2: \n ")
			para(l=0;l<4;l++){
				para(c=0;c<6;c++){
					escreva(M2[l][c],"	")
					
				}		escreva("\n ")
			}
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 851; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */