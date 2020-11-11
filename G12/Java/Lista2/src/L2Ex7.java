import java.util.Scanner;
public class L2Ex7 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		double base;
		double altura;
		double resultado;
		
		
		System.out.print("Digite o valor da base do tringulo: ");
		base = leia.nextDouble();
		
		System.out.print("Digite o valor da altura do triangulo: ");
		altura = leia.nextDouble();
		
		if(base> 0 && altura >0) {
			resultado = ((base * altura)/2);
			
			System.out.println("A area do triangulo é: "+resultado);
		
		}else {
			System.out.println("Por favor, digite numeros positivos.");
		}
		
	}
}
