import java.util.Scanner;
public class L2Ex8 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		int N;
		
		System.out.print("Digite o valor de N: ");
		N = leia.nextInt();
		
		if(N < 100) 
		{
			System.out.println(" ZERO ");
		}
		else
		{
			System.out.println("O valor de N: "+N);
		}
		
	}
}
