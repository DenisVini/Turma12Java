programa
{
	
	funcao inicio()
	{
		real base
		real altura
		real resultado

		escreva("Digite a base: ")
		leia(base)

		escreva("Digite a altura: ")
		leia(altura)

		resultado = (base * altura)/2)

		se(base <=0 e altura <= 0){
			escreva("Por favor numeros positivos!")
		}
		senao{
			escreva("A área do triângulo é: "+resultado+" ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 214; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */