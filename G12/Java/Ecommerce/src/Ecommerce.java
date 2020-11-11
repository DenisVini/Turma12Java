package Lista2;
import java.util.Scanner;
public class Ecommerce {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// VARIAVEIS - VETOR
		String nomes[] = {"Ana veronica Nascimento cruz", "Bruno Estivalli Vicente", "Bruno Henrique Moraes Santos", "Daniel Ferreira", "Dayane de Oliveira", "Denis Vinicius Bolla da Silva", "Diego  Joaquim Silva ", "Erick Alan", "Everson Silva", "Gabriel Enrique Cabral Silva", "Guilherme Alex", "Guilherme Fidelis Pereira", "Gustavo Miquéias Lopes Santana", "Isac Cordeiro de Oliveira", "Iuri Garcia Nunes", "Jenifer Lima Placido", "Jéssica Cristiane", "Joao Pedro Sena", "Larissa Moraes Ribeiro", "Leonardo de Moraes Magalhães", "Lucas Santos Gonçalves", "Mariana  de Cássia Antunes Oliveira", "Patricia da Silva Machado", "Paula Leticia", "Raul Fernandes", "RICARDO MAGALHAES FINKELSTEIN", "Thiago dos Anjos", "Vitória Gonçalves de Freitas", "William Xavier"};
		String codigos[] = new String[29];
		boolean masculinos[] = {false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,false,false,true,false,true,true,false,false,false,true,true,true,false,true};
		int tamanho=0;
		int grupo = 1;
		
		
		//para alimentar o codigo
		for (int x = 0; x<29; x++) {
			codigos[x] = "A0"+(x+1);
		}
		//para mostra na tela
		
		
		System.out.println("COD \t NOME"); //CABEÇALHO
		for(int x = 0; x<29; x++) {
			System.out.printf("%s \t %s\n",codigos[x],nomes[x]);
			
		}
		System.out.println("Tamanho do grupo de 2 a 10:");
		tamanho = leia.nextInt();
		
		//deveria ter um teste se o numero maior que 2 e menor 10
		
		System.out.println("COD \t GRUPO \t NOME"); //CABEÇALHO
		for(int x = 0; x<29; x++) {
			System.out.printf("%s \t %d \t %S\n",codigos[x],grupo, nomes[x]);
			if (((x+1)%tamanho)==0 )
			{
				grupo++;
			}
		}
		System.out.println("LISTAGEM MASCULINOS");
		System.out.println("COD \t GENERO \t\t NOME"); //CABEÇALHO
		int homens=0;
		for(int x = 0; x<29; x++) {
			if (masculinos[x]) {
				System.out.printf("%s \t M \t\t %s\n",codigos[x],nomes[x]);
				homens++;
			}
		}
		System.out.println("Total de homens: "+homens);
		System.out.println("LISTAGEM FEMININAS");
		int mulheres = 0;
		System.out.println("COD \t GENERO \t\t NOME"); //CABEÇALHO
		for(int x = 0; x<29; x++) {
			if (masculinos[x]==false)
			{
				System.out.printf("%s \t F \t\t %s\n",codigos[x],nomes[x]);
				mulheres++;
			}
		}
		System.out.println("Total de mulheres "+mulheres);
		
		
	}
}
