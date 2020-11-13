import java.util.*;
public class ExSala {
	public static void main (String []args) {
		
		Scanner leia = new Scanner(System.in);
		
		String alunos [] = {"Ana veronica Nascimento cruz","Bruno Estivalli Vicente","Bruno Henrique Moraes Santos",
				"Daniel Ferreira","Dayane de Oliveira","Denis Vinicius Bolla da Silva","Diego  Joaquim Silva","Erick Alan",
				"Everson Silva","Gabriel Enrique Cabral Silva","Guilherme Alex","Guilherme Fidelis Pereira",
				"Gustavo Miquéias Lopes Santana","Isac Cordeiro de Oliveira","Iuri Garcia Nunes",
				"Jenifer Lima Placido","Jéssica Cristiane","Joao Pedro Sena","Larissa Moraes Ribeiro",
				"Leonardo de Moraes Magalhães","Lucas Santos Gonçalves","Mariana de C. Antunes Oliveira",
				"Patricia da Silva Machado","Paula Leticia","Raul Fernandes","RICARDO MAGALHAES FINKELSTEIN",
				"Thiago dos Anjos","Vitória Gonçalves de Freitas","William Xavier"}	;
		int notas[] = new int[29]; // a diferença entre "new" para um vetor normal é quando não temos os valor declarados como no vetor nomes 
		String matriculas[] = new String[29];
		int numerodeDentro = 0;
		int numerodaMatricula = 1;
		String matricula ;
		int indice=0 ;
		for (numerodeDentro=0; numerodeDentro < 29 ; numerodeDentro ++) {
			if(numerodeDentro < 9) {
				matriculas[numerodeDentro] = "MAT-0"+ numerodaMatricula ;
			}else {
			matriculas[numerodeDentro] = "MAT-"+ numerodaMatricula ;
			
		}numerodaMatricula++ ;
			System.out.println(matriculas[numerodeDentro]+"	"+alunos[numerodeDentro]);
		}
			System.out.println("Digite o numero da matricula: ");
			matricula = leia.next().toUpperCase();
			for (numerodeDentro = 0 ; numerodeDentro <29 ; numerodeDentro++) 
			{
				if(matricula.equals( matriculas[numerodeDentro])) 
				{
					indice = numerodeDentro;
					System.out.println("MAT. \t NOMES");
					System.out.println(matriculas[indice]+"\t"+alunos[indice]);
					
				}
			}
		
		
	}
}
