programa
{
	
	funcao inicio()
	{
		//A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
		//coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
		//a) média do salário da população;
		//b) média do número de filhos;
		//c) maior salário;
		//d) percentual de pessoas com salário até R$100,00. 
		
		real salario=0 
		real maiorSal=0
		real mediaSal=0
		real salX=0
		real porcentagem=0
		inteiro filhos=0
		inteiro mediaFilhos=0
		real totalSal=0
		real x = 0 //numero de entrevistados
		real quant
		inteiro totalFilhos = 0

		escreva("Digite o numero de entrevistados: ")
		leia(quant)
		

		para(x=1; x<=quant;x++;){
			escreva("Digite o seu salário: ")
				leia(salario)
			escreva("Digite seu Nº de filhos: ")
				leia(filhos)
		se(salario<100){
			 salX=(salX+1)		
		} 
		totalFilhos= totalFilhos + filhos
		totalSal= totalSal + salario
		}
		se(maiorSal < salario){
			maiorSal = salario
		}
		
		
		mediaSal = totalSal / quant
		escreva("\nA média do salário dos entrevistados é: ",mediaSal,"R$")
		mediaFilhos = totalFilhos / quant
		escreva("\nA média de filhos dos entrevistados é: ",mediaFilhos," filhos por entrevistado")
		porcentagem = ((salX*100)/quant)
		
		escreva("\nO maior salário é: ",maiorSal,"R$")
		escreva("\nA porcentagem de assalariados abaixo de 100R$ é:",porcentagem,"%")
		
		

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1352; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */