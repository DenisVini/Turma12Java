
	programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6], z = 0
		inteiro l = 0, c = 0
		para ( l = 0; l < 4; l++) {
			para (c = 0; c < 6; c++) {
				N1[l][c] = Util.sorteia(1, 10)
				N2[l][c] = Util.sorteia(1, 10)
				
				M1[l][c] = (N1[l][c] + N2[l][c])
				M2[l][c] = (N1[l][c] - N2[l][c])
			}
		}
		escreva("Matriz N1:\n")
		para ( l = 0; l < 4; l++) {
			para (c = 0; c < 6; c++) {
				se (l != z) {
					escreva("\n")
				}
				escreva(N1[l][c] + "    ")
				z = l
			}
		}
		escreva("\n \nMatriz N2:\n")
		para ( l = 0; l < 4; l++) {
			para (c = 0; c < 6; c++) {
				se (l != z) {
					escreva("\n")
				}
				escreva(N2[l][c] + "    ")
				z = l
			}
		}
		escreva("\n \nMatriz M1:\n")
		para ( l = 0; l < 4; l++) {
			para (c = 0; c < 6; c++) {
				se (l != z) {
					escreva("\n")
				}
				escreva(M1[l][c] + "    ")
				z = l
			}
		}
		escreva("\n \nMatriz M2:\n")
		para ( l = 0; l < 4; l++) {
			para (c = 0; c < 6; c++) {
				se (l != z) {
					escreva("\n")
				}
				escreva(M2[l][c] + "    ")
				z = l
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1051; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */