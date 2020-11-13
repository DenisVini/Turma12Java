import java.util.Scanner;

public class L5Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double peso;
		double altura;
		double IMC;
		
		System.out.println("Digite a altura: ");
		altura = leia.nextDouble();
		System.out.println("Digite o peso: ");
		peso = leia.nextDouble();
		
		IMC = (peso/Math.pow(altura, 2));
		
		if(IMC<=18.5) {
			System.out.println("Você está abaixo do peso.");
		}else if(IMC>18.5 && IMC <=25) {
			System.out.println("Você está com o IMC saudável!");
		}else if(IMC>25 && IMC <=30) {
			System.out.println("Você está acima do peso.");
		}else if(IMC>30) {
			System.out.println("Você está obeso!");
		}
	}
}