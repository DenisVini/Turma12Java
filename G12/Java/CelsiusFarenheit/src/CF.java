import java.util.Scanner;
public class CF {

	
	public static void main(String [] args){
		Scanner suco = new Scanner(System.in);
		double celsius ;
		double faren ;
		// F = C * 1.8 + 32
		System.out.println("Digite o valor em Celsius: ");
		celsius = suco.nextDouble();
		
		faren = ((celsius * 1.8) + 32);
				
				System.out.println(faren+"Fº");
	}
}
