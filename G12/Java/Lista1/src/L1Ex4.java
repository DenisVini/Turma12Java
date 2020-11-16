import java.util.Scanner;

public class L1Ex4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int A ;
		int B ;
		int C ;
		int D ;
		int R ;
		int S ;
		
		System.out.println("Digite um numero inteiro positivo A: ");
		A = leia.nextInt();
		System.out.println("Digite um numero inteiro positivo B: ");
		B = leia.nextInt();
		System.out.println("Digite um numero inteiro positivo C: ");
		C = leia.nextInt();
		
		R = (A + B)*(A + B);
		S = (B + C)*(B + C);
		
		D = (R + S)/2 ;
		
		System.out.println("O valor de R = "+R);
		System.out.println("O valor de S = "+S);
		System.out.println("O valor de D = "+D);
	}

}
