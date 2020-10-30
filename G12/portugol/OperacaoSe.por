programa
{
	
	funcao inicio()
	{
		// peça o nome do usuario, o ano de nascimento e caso a pessoa
		//tenha mais de 18 anos informe adulto
		// caso tenha menos informe menor de 18 anos.
		//se for 18 avise que vc tem 18 anos, que top!!
		
		//variaveis
		cadeia nomeUsuario // ditas no objetivo
		inteiro anoNascimentoUsuario //ditas no objetivo
		inteiro idadeUsuario // vou usar porque eu quero
		const inteiro ANOATUAL = 2020
		caracter sexo
		
		
		//entradas
		escreva("Digite o nome:")
		leia(nomeUsuario)
		escreva("Digite o ano de nascimento: ")
		leia(anoNascimentoUsuario)
		escreva("Vc é M-MASCULINO ou F-FEMININO OU O-OUTROS:")
		leia(sexo)
		
		//processamento
		idadeUsuario = ANOATUAL - anoNascimentoUsuario
		se (idadeUsuario < 18)
		{
			escreva("Oi "+nomeUsuario+" vc é menor de 18 anos e sua idade é "+idadeUsuario+" anos")
		}
		senao se (idadeUsuario == 18)
		{
			se (sexo=='M' ou sexo=='m')
			{
				escreva("Oi Sr "+nomeUsuario+" vc é tem 18 anos, que top!")	
			}
			senao se (sexo=='F' ou sexo =='f')
			{
				escreva("Oi Sra "+nomeUsuario+" vc é tem 18 anos, que top!")	
			} senao {
				escreva("Oi Srx "+nomeUsuario+" vc é tem 18 anos, que top!")	
			}
			
		}
		senao
		{
			escreva("Oi Sr "+nomeUsuario+" vc é adulto e sua idade é "+idadeUsuario+" anos")
		}
		escreva("\nFIM DE PROGRAMA")
		
	}
}





/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1330; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */