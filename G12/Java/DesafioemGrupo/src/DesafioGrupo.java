import java.util.Scanner;
public class DesafioGrupo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		//caracter = teclado.next().charAt(0);
		//next().toUpperCase(); pra transformar letra em maiusculo
		// e = && 
		//ou = ||
		//vetor  String nomes[] = new String[10]; VETOR
		//		String produtos[] = {"Camisa","Boné"...};
		//int precos[]=new int[3];
		
		String nomes[] = {"Ana veronica Nascimento cruz","Bruno Estivalli Vicente","Bruno Henrique Moraes Santos",
				"Daniel Ferreira","Dayane de Oliveira","Denis Vinicius Bolla da Silva","Diego  Joaquim Silva","Erick Alan",
				"Everson Silva","Gabriel Enrique Cabral Silva","Guilherme Alex","Guilherme Fidelis Pereira",
				"Gustavo Miquéias Lopes Santana","Isac Cordeiro de Oliveira","Iuri Garcia Nunes",
				"Jenifer Lima Placido","Jéssica Cristiane","Joao Pedro Sena","Larissa Moraes Ribeiro",
				"Leonardo de Moraes Magalhães","Lucas Santos Gonçalves","Mariana de C. Antunes Oliveira",
				"Patricia da Silva Machado","Paula Leticia","Raul Fernandes","RICARDO MAGALHAES FINKELSTEIN",
				"Thiago dos Anjos","Vitória Gonçalves de Freitas","William Xavier"}	;
		String sexo [] = {"feminino", "masculino", "masculino", "masculino", "feminino", "masculino", "masculino", "masculino", "masculino", "masculino", "masculino", "masculino", "masculino", "masculino", "masculino", "femino",
				"feminino","masculino", "feminino", "masculino", "masculino", "feminino", "feminino", "femino", "masculino", "masculino","masculino", "femino", "masculino"};
		
		
		
		int c;
		System.out.println("Digite o valor desejado por grupo: ");
		c = leia.nextInt();
		
		for(int x =0 ; x < 29 ; x++) {
		
		
		
		
		for (int y = 0; y<29;y++) {
			
			System.out.println("Nomes: "+nomes[y]);
		if (((x+1) == %c)==0) {
				System.out.println("\n \t");}
		}
		}
	}

}
