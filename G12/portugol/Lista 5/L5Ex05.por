programa
{
	
	funcao inicio()
	{
		real vetor[5]
		inteiro codigo=0
		inteiro x = 0
		//Primeiro fiz o vetor
		para ( x = 0; x<5; x++)
		{
			escreva("Digite o valor:",x+1," : ")	
			leia(vetor[x])
		}limpa()
		//Fiz a condição pra caso ele digite algo diferente do que o código pede
		escreva("Digite o codigo 0 /1 /2 :")
		leia(codigo)
		
		enquanto(codigo != 0 e codigo != 1 e codigo !=2){
			escreva("Código invalido. \n")
			escreva("Digite o codigo 0 /1 /2 :")
			leia(codigo)
			limpa()
		}
		//Depois fiz a apresentação conforme o enunciado
		se(codigo == 1){
			para(x=0; x<5; x++){
				escreva(vetor[x]+"\n")
			}
		}
		senao se(codigo == 2){
			para(x=4; x>0; x--){
				escreva(vetor[x]+"\n")
			}
		}
		senao se(codigo == 0){
			escreva("FIM DE PROGRAMA")
		}
		}
	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 708; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */