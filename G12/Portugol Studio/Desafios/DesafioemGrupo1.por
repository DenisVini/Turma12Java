programa
{
	
	funcao inicio()
	{
		cadeia nomes[29] = {"Ana veronica Nascimento cruz","Bruno Estivalli Vicente","Bruno Henrique Moraes Santos",
			"Daniel Ferreira","Dayane de Oliveira","Denis Vinicius Bolla da Silva","Diego  Joaquim Silva","Erick Alan",
			"Everson Silva","Gabriel Enrique Cabral Silva","Guilherme Alex","Guilherme Fidelis Pereira",
			"Gustavo Miquéias Lopes Santana","Isac Cordeiro de Oliveira","Iuri Garcia Nunes",
			"Jenifer Lima Placido","Jéssica Cristiane","Joao Pedro Sena","Larissa Moraes Ribeiro",
			"Leonardo de Moraes Magalhães","Lucas Santos Gonçalves","Mariana de C. Antunes Oliveira",
			"Patricia da Silva Machado","Paula Leticia","Raul Fernandes","RICARDO MAGALHAES FINKELSTEIN",
			"Thiago dos Anjos","Vitória Gonçalves de Freitas","William Xavier"}	     
		cadeia email[29] = {"anaveronica3001@gmail.com", "        bruno.estivalli@gmail.com", "brunohmoraes93@gmail.com",
							"                daniel.z.ferreira@gmail.com", "        dayane973@gmail.com       ", "denisvini@gmail.com       ",
							"        joaquim.diego8@gmail.com","                erickalan068@gmail.com       "
							, "                eversonmessias@outlook.com", "gabrieldgrafico@outlook.com"
							, "                guilhermealex01@gmail.com",
							"gui.fdsk@hotmail.com       ", "gumiqueias@hotmail.com       ", "zaq.c@live.com              ", "        iurinunes01@gmail.com       ",
							"        jenifer.sdti@gmail.com       ", "        jessicacristianebtr@gmail.com", "                joao_usercon@hotmail.com", "        larissaribeiro03@hotmail.com",
							"leo_o_nardo1@outlook.com", "        lucas.00.santos@outlook.com", "mari_oli25@hotmail.com       ", "pathsilva09@gmail.com       ",
							"                paula.leticia.braz@gmail.com", "                raulogus2@gmail.com       ", "ricardomrfin@gmail.com       ", "        thiagohdosanjos99@gmail.com",
							"vitoriagcf@hotmail.com       ", "                william.xavier07@hotmail.com"}
			
		logico masculino[29] = {falso, verdadeiro,verdadeiro, verdadeiro,falso,verdadeiro,verdadeiro, verdadeiro,
							verdadeiro, verdadeiro, verdadeiro, verdadeiro, verdadeiro, verdadeiro, verdadeiro,
							falso, falso, verdadeiro, falso, verdadeiro, verdadeiro, falso, falso, falso, verdadeiro,
							verdadeiro, verdadeiro,falso, verdadeiro}
		
		caracter sexo[29]
				
		caracter continuar
		logico confirmacao   = verdadeiro
		logico entregaFinalizar = verdadeiro
		caracter entrega[29]
		inteiro nota[29]				
		inteiro indice
		inteiro x=0
		inteiro somaNota[29]
		caracter opcao
	
		escreva("CÓDIGOS \t\t NOMES \t\t\t\t\t\t\tEMAIL \t\t\t\t\tALUNO \t\t\t\t NOTA\n\n\n")
		
		// Vetor para preencher o vetor de entrega como vazio, se não ele aparece []
		// E um SE para trocar o verdadeiro de falso para M e F do sexo
		para(inteiro i=0; i<29;i++){
			entrega[i] = ' '
			se(masculino[i] == verdadeiro){
				sexo[i] = 'M'
			}
			senao se (masculino[i] == falso){
				sexo[i] = 'F'
			}
		}
		
		faca
		{
			para (x=0 ; x<29 ; x++)
			{
				escreva("G4-" + x + "\t" + nomes[x] + "\t\t\t\t"   + email[x] +"\t\t\t\t  " + sexo[x] + "\n")
			}
				
			faca
			{	
				escreva("\n\nDigite o indíce: " )
					leia(indice)
				escreva("\n\n")
				escreva("G4-" + indice + "\t" + nomes[indice] + "\t\t\t\t"   + email[indice] +"\t\t\t\t  " + sexo[indice] + "\t\t\t\t Notas: "+somaNota[indice]  + "\n")
				escreva("\n\nFez a entrega S/N: ")
					leia(opcao)
	
				// Adicionei entrega[indice] que acrescenta a letra S e N
				se (opcao == 's' ou opcao == 'S')
				{
					somaNota[indice]=somaNota[indice]+1
					entrega[indice] = 'S'
				}				
				senao se ( opcao == 'n' ou opcao == 'N'){
					entrega[indice] = 'N'
				}
				
				escreva("\nA nota é de: ",somaNota[indice])
				escreva("\n\nDeseja continuar S / N?: ")
					leia(continuar)
				
				se (continuar == 's' ou continuar == 'S')
				{
					entregaFinalizar = verdadeiro
				}	
				senao  se (continuar == 'n' ou continuar == 'N')
				{
					entregaFinalizar	= falso
					escreva("\n\n")
					escreva("CÓDIGOS \t\t NOMES \t\t\t\t\t\t EMAIL \t\t\t\t\t ALUNO\t\tENTREGA \tNOTAS\n\n\n")
					para (x=0 ; x<29 ; x++){
						// Acrescentei a coluna de entrega[]
						escreva(" "+ "G4-" + x + "\t\t\t" + nomes[x] + "\t\t\t"+ email[x] +" \t\t  " + sexo[x] + "\t\t  " + entrega[x]+ "\t\t  " +somaNota[x]+"\n")
					}
				}
					
			}enquanto (entregaFinalizar==verdadeiro)
			
			escreva("\n\nDeseja continuar S / N?: ")
				leia(continuar)			
			se (continuar == 's' ou continuar == 'S')
			{
				confirmacao = verdadeiro
			}	
			senao  se (continuar == 'n' ou continuar == 'N')
			{
				confirmacao = falso
			}
		}enquanto (confirmacao == verdadeiro)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4691; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */