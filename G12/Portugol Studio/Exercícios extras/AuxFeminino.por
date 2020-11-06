programa
{
	
	funcao inicio()
	{
		
		cadeia nome
		cadeia sexo
		cadeia chefe
		
		escreva("Escreva seu nome: ")
		leia(nome)
		escreva("Digite M - Masculino e F - Feminino: ")	
		leia(sexo)
		escreva("Você é chefe de familia? [S ou N]: ")
		leia(chefe)
		
		se (sexo == "M" ou sexo == "m"){
			escreva("Sexo masculino ")
		}
		se (sexo == "F" ou sexo == "f"){
				escreva("Sexo Feminino ")
		se (chefe == "S" e sexo == "F" ou sexo == "f") {
				escreva("Você tem o direito de 1200R$ de auxílio")
		}
		}
		senao se (chefe == "n" ou chefe == "N" e sexo == "F" ou sexo == "f") {
			escreva("Você tem o direito de 600R$ de auxílio")
		}
	senao se(chefe == "s" ou chefe == "S" e sexo == "M" ou sexo == "m") {
			escreva("Você tem o direito de 600R$ de auxílio")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 530; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */