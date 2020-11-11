import java.util.Scanner;

public class L2Ex4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um valor: ");
		x = leia.nextInt();
		
		 if(x == 0) 
			{
				System.out.println("O numero 0 é neutro.");
			}
		
		 else if(x < 0) 
		{
			System.out.println("O numero digitado é negativo.");
		}
		
		 else if(x > 0) {
			 if((x % 2) == 0)
		{
			System.out.println("O numero digitado é positivo e par!");
				 
		}
		 }
		else 
		{
			System.out.println("O numero digitado é positivo e impar");
		}
		
		
		
	}

}
