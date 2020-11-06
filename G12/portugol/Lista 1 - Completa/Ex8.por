programa
{
	
	funcao inicio()
	{
		real custoFa
		real porcentagemDistr
		real porcentagemImpos
		real custoFinal
		
		escreva("Custo de Fabrica: ")
		leia(custoFa)

		porcentagemDistr = ((custoFa / 100) *28)
		porcentagemImpos = ((custoFa / 100) *45)
		
		custoFinal = custoFa + porcentagemDistr + porcentagemImpos
		escreva("Custo final para o consumidor: " +custoFinal+"R$")
		

		


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 375; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */