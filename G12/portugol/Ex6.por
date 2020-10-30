programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro x1
		inteiro x2
		inteiro y1
		inteiro y2
		real d
		real x3
		real y3

escreva("Escreva valor x1= ")
leia(x1)
escreva("Escreva valor x2= ")
leia(x2)
escreva("Escreva valor y1= ")
leia(y1)
escreva("Escreva valor y2= ")
leia(y2)


x3 = (x2 - x1) * (x2 - x1)
y3 = (y2 - y1) * (y2 - y1)


		d = mat.raiz((x3 + y3),2)
		escreva("O resultado de D: "+d+" ")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 365; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */