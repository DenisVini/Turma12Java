programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real c
		real n
		real ex
		real salario
		real result
		real resultDois
		
		escreva("Digite seu código: ")
		leia(c)

		escreva("Digite o Numero de horas trabalhadas: ")
		leia(n)

		salario = (n * 10)

		ex = ( n - 50 ) 

		result = (ex * 20)

		resultDois = (result + salario)
		
		se (n > 50){
			escreva("O salário precisou de um reajuste de: "+result+"R$")
			escreva("\n O salário com os reajustes é: "+resultDois+"R$")
		}
		senao se (n <= 50){
			escreva("O salário desse funcionario é: "+salario+"R$")
		escreva("\n O salário com os reajustes é: "+resultDois+"R$")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 492; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */