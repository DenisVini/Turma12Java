programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real x1
		real x2
		real y1
		real y2
		real d

		
escreva("Escreva valor x1= ")
leia(x1)
escreva("Escreva valor x2= ")
leia(x2)
escreva("Escreva valor y1= ")
leia(y1)
escreva("Escreva valor y2= ")
leia(y2)

d = mat.raiz((mat.potencia((x2 - x1),2) + mat.potencia((y1-y2),2)),2)

escreva("Valor de D= "+d+" ")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 377; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */