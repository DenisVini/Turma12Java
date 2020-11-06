programa
{
	
	funcao inicio()
	{
		cadeia nomeUs
		inteiro anoNas
		inteiro idade
		caracter sexo
		
		escreva("Informe seu nome completo: ")
		leia(nomeUs)
		escreva("Informe seu ano de nascimento: ")
		leia(anoNas)
		escreva("Sexo 'M' - Masculino ou 'F' - Feminino?")
		leia(sexo)

//processamento

	idade = 2020-anoNas 
	
	se ( idade < 18 )	{ 
		se(sexo=='F' ou sexo=='f')
		{
			escreva("A usuária "+nomeUs+" é menor de 18 anos e tem " +idade+ " anos de idade")
		}
		
		senao{
			escreva("O usuário "+nomeUs+" é menor de 18 anos e tem " +idade+ " anos de idade")
		}
		
				}
	
	senao se( idade == 18)	{
		se(sexo=='F' ou sexo=='f')
		{
		escreva("A usuária "+nomeUs+" tem 18 anos, que top!")
				}
	}
				senao{
					escreva("O usuário "+nomeUs+" tem 18 anos, que top!")
				}
	
	senao	{
		se(sexo=='F' ou sexo=='f')
		{
			
		
		escreva("A usuária "+nomeUs+" tem " +idade+" anos, que top")
		}
		
				}
	
	}
	
	

	

		
		
		
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 579; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */