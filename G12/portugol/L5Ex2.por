programa
{
	
	funcao inicio()
	{
		/*
		 * O IMC – Índice de Massa Corporal é um critério da Organização Mundial 
		 * de Saúde para dar uma indicação sobre a condição de peso de uma pessoa 
		 * adulta. A fórmula é IMC = peso / ( altura )2
		 */

		 real peso
		 real altura
		 real IMC

		 escreva("Digite seu peso: ")
		 leia(peso)

		 escreva("Digite sua altura: ")
		 leia(altura)

		 IMC=(peso/(altura*altura))
		 escreva("O IMC É: "+IMC+"%\n\n")
		 se(IMC<=18.5){
		 	escreva("VOCÊ ESTÁ ABAIXO DO PESO")
		 }senao se(IMC>18.5 e IMC<=25){
		 	escreva("VOCÊ ESTÁ NO PESO NORMAL!")
		 }senao se(IMC>25 e IMC <=30){
		 	escreva("VOCÊ ESTÁ ACIMA DO PESO")
		 }senao se(IMC>30){
		 	escreva("VOCÊ ESTÁ OBESO")
		 }
		 
		 
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 710; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */