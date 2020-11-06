programa
{
	
	funcao inicio()
	{
		inteiro idadeAno
		real idadeDias
		inteiro idadeAnoMes
		real resultado
		cadeia nomeCompleto

		escreva("Nome Completo: ")
		leia(nomeCompleto)
		escreva("Idade em anos: ")
		leia(idadeAno)
		escreva("Você tem "+idadeAno+" anos e quantos meses? ")
		leia(idadeAnoMes)
		escreva("E para finalizar você tem "+idadeAno+" anos, "+idadeAnoMes+" meses e quantos dias? ")
		leia(idadeDias)
		resultado = idadeAno * 365 + idadeAnoMes * 30 + idadeDias
		 escreva("Voce tem " +resultado+ " dias de vida")
		
	}
}

 

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 542; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */