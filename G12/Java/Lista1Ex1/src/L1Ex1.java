import java.util.Scanner;
	public class L1Ex1 {
		public static void main(String[]args) {
		
			Scanner leia = new Scanner(System.in);
		
		int idade ;
		int meses ;
		int dias ;
		int dia ;
		
		
		
		
		//caracter = teclado.next().charAt(0);
		//next().toUpperCase(); pra transformar letra em maiusculo
		// e = && 
		//ou = ||
		//vetor  String nomes[] = new String[10]; VETOR
		//		String produtos[] = {"Camisa","Boné"...};
		//int precos[]=new int[3];
		
			
			System.out.print("Você tem quantos anos: ");
			idade = leia.nextInt();
			System.out.print("Você tem "+idade+" anos e quantos meses: ");
			meses = leia.nextInt();
			System.out.print("Você tem "+idade+" anos, "+meses+" meses e quantos dias: ");
			dia = leia.nextInt();

			dias = ((idade * 365)+(meses*30)+dia);
			System.out.println("Você viveu: "+dias+" dias");
		}
	
}
	
