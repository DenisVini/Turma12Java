programa
{
	
	funcao inicio()
	{
		real indice

		escreva("Escreva o indice de poluição: ")
		leia(indice)

		se (indice <= 0.29){
			escreva("O indice de poluição está aceitável, todas as empresas podem operar!")
		}
		senao se(indice >=0.3 e indice <= 0.39){
			escreva("O indice de poluição está acima do nível para operação do 1ºGrupo. Suspendam as atividades!")
		}
		senao se(indice >=0.4 e indice <= 0.49){
			escreva("O indice de poluição está acima do nível para operação do 1ºe2ºGrupo. Suspendam as atividades!")
		}
		senao se(indice >0.5){
			escreva("O indice de poluição está acima do nível para a operação de todos os grupos. Todos devem suspender as operações!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 682; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */