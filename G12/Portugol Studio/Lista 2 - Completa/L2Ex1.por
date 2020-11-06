programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		 
          real peso
          real multa
          real exc
          
		
		escreva ("\nPeso do tomate:")
		leia(peso)
		limpa()

	
		se (peso>50.0)
		{
			exc= peso*4.00 
			multa= mat.arredondar ((exc - 200.0),2) 
			
			escreva ("\n Você ultrapassou o limite e terá a multa de: " +multa+"R$")
			
		}
		senao 
		{
			peso= 0
			multa= 0
			exc= 0
		}
		
		
		escreva ("Peso: "+peso+", Excesso: "+exc+", Multa: "+multa+"R$")
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 74; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */