programa
{
	
	funcao inicio()
	{
		cadeia nomeCompleto
		inteiro idadeAno
		real idadeMes
		inteiro idadeDias

		escreva("Nome Completo: ")
		leia(nomeCompleto)
		escreva(+nomeCompleto+" escreva a sua idade em dias: ")
		leia(idadeDias)
		idadeMes = idadeDias/30
		escreva("Você tem "+idadeMes+" meses de vida e ")
		idadeAno = idadeMes/12
		escreva("tem "+idadeAno+" anos de vida")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 389; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */