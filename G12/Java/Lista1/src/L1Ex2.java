import java.util.Scanner;

public class L1Ex2 {

	public static void main (String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Faça um sistema que leia a idade 
		//de uma pessoa expressa em dias e 
		//mostre-a expressa em anos, meses e dias. 
		
		int idadeDias ;
		int anos ;
		int meses ;
		
		System.out.println("Escreva sua idade em dias: ");
		idadeDias = leia.nextInt();
		 
		meses = (idadeDias/30) ;
		anos = (meses/12) ;
		
		System.out.println("Você viveu "+meses+" meses e tem "+anos+" anos de idade.");
		
	}
}


