programa
{
	
	funcao inicio()
	{
		real multa
		real exc
		real peso

				escreva("Peso dos tomates: ")
				leia(peso)

				exc = peso - 50
				multa = exc * 4
			se (peso > 50){
				escreva("Você ultrapassou o limite em: "+exc+"Kgs\nE terá uma multa de: "+multa+"R$")	
				}
			senao {
				escreva("Não ultrapassou o limite de peso e não precisará de pagar multa.")
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 234; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */