programa
{
	
	funcao inicio()
	{
		real a 
		real b
		real c
		real d
		real ex
		real f
		real x
		real y

		escreva("Escreva o valor do coeficiente A: ")
		leia(a)
		escreva("Escreva o valor do coeficiente B: ")
		leia(b)
		escreva("Escreva o valor do coeficiente C: ")
		leia(c)
		escreva("Escreva o valor do coeficiente D: ")
		leia(d)
		escreva("Escreva o valor do coeficiente E: ")
		leia(ex)
		escreva("Escreva o valor do coeficiente F: ")
		leia(f)

		x = ( (c * ex) - (b * f) ) / ( (a * ex) - (b * d) )
		y = ( (a*f) - (c*d)) / (( a * ex) - (b * d))
		
		escreva(" O resultado de X = "+x+" ")
		escreva(" O resultado de Y = " +y+" ")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 558; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */