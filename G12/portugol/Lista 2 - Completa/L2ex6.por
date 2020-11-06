programa
{
	
	funcao inicio()
	{
		inteiro idade

		escreva("Digite a idade do nadador(a): ")
		leia(idade)

		se (idade<5){
			escreva("Não atendemos a essa idade!!!")	
		}
		senao se(idade >= 5 e idade <=7){
				escreva("Nadadore Infantil A!!")
		}
		senao se(idade >=8 e idade <=11){
				escreva("Nadadore Infantil B!!")
		}
		senao se(idade >=12 e idade <=13){
				escreva("Nadadore Juvenil A!!")
		}
		senao se(idade >=14 e idade <=17){
				escreva("Nadadore Juvenil B!!")
		}
		senao se(idade >= 18){
				escreva("Nadadore Adulto!!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 244; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */