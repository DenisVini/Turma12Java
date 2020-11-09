programa
{
	
	funcao inicio()
	{
		inteiro tempoMin
		inteiro tempoHour
		inteiro tempoSec

		escreva("Tempo em segundos de duração do evento: ")
		leia(tempoSec)
		
		tempoMin = tempoSec/60
		escreva("Visto as informações tivemos: "+tempoMin+" em minutos de festa")
		tempoHour = tempoSec / 3600
		escreva("\n em horas: "+tempoHour+" ")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 310; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */