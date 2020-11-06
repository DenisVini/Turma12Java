programa
{
	/*
	Desafio: Corinthians, Santos, Palmeiras, SPFC
	Ganha - 3 pontos
	Empata - 1 ponto
	Perde - 0 pontos
	*/
	
	funcao inicio()
	{
		inteiro pontosT1 = 0, pontosT2 = 0, pontosT3 = 0, pontosT4 = 0, nRodadas = 1
		logico continua = verdadeiro
		caracter continuaR, rodada, escolhas
		cadeia time1 = "Corinthians", time2 = "Santos", time3 = "Palmeiras", time4 = "SPFC"

			escreva("Paulistinha do De!!!\n")
		
		enquanto (continua) {
			escreva("-----------------\n\n")
			escreva("Ínicio da rodada " + nRodadas + "!\n\n")
			escreva("O time: " + time1 + " 1 - ganhou, 2 - perdeu ou 3 - empatou?\n")
			leia(rodada)
			
			se (rodada == '1') {
				pontosT1 = pontosT1 + 3
			} senao se (rodada == '2') {
				pontosT1 = pontosT1 + 0
			} senao se (rodada == '3') {
				pontosT1 = pontosT1 + 1
			}
			escreva("O time: " + time2 + " 1 - ganhou, 2 - perdeu ou 3 - empatou?\n")
			leia(rodada)
			se (rodada == '1') {
				pontosT2 = pontosT2 + 3
			} senao se (rodada == '2') {
				pontosT2 = pontosT2 + 0
			} senao se (rodada == '3') {
				pontosT2 = pontosT2 + 1
			}
			escreva("O time: " + time3 + " 1 - ganhou, 2 - perdeu ou 3 - empatou?\n")
			leia(rodada)
			se (rodada == '1') {
				pontosT3 = pontosT3 + 3
			} senao se (rodada == '2') {
				pontosT3 = pontosT3 + 0
			} senao se (rodada == '3') {
				pontosT3 = pontosT3 + 1
			}
			escreva("O time: " + time4 + " 1 - ganhou, 2 - perdeu ou 3 - empatou?\n")
			leia(rodada)
			se (rodada == '1') {
				pontosT4 = pontosT4 + 3
			} senao se (rodada == '2') {
				pontosT4 = pontosT4 + 0
			} senao se (rodada == '3') {
				pontosT4 = pontosT4 + 1
			}
			escreva("-----------------\n")
			escreva("Continua? S / N\n")
			escreva("-----------------\n\n")
			leia(continuaR)
			
			se (continuaR == 'n' ou continuaR == 'N') {
				continua = falso
				limpa()
				escreva("\nQual time deseja ver a pontuação?\n\n")
				escreva("1 - " + time1 + "\n")
				escreva("2 - " + time2 + "\n")
				escreva("3 - " + time3 + "\n")
				escreva("4 - " + time4 + "\n\n")
				leia(escolhas)
				
				se (escolhas == '1') {
					escreva(time1 + " tem " + pontosT1 + " pontos\n")	
				} senao se (escolhas == '2') {
					escreva(time2 + " tem " + pontosT2 + " pontos\n")	
				} senao se (escolhas == '3') {
					escreva(time3 + " tem " + pontosT3 + " pontos\n")	
				} senao se (escolhas == '4') {
					escreva(time4 + " tem " + pontosT4 + " pontos\n")	
				}
				
			} senao se ( (continuaR == 'S') ou (continuaR == 's')) {
				limpa()
				escreva("Resultados da rodada " + nRodadas + "!\n")
				escreva(time1 + ": " + pontosT1 + " pontos\n")
				escreva(time2 + ": " + pontosT2 + " pontos\n")
				escreva(time3 + ": " + pontosT3 + " pontos\n")
				escreva(time4 + ": " + pontosT4 + " pontos\n")
				nRodadas++
			}
			
		}
		
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 412; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */