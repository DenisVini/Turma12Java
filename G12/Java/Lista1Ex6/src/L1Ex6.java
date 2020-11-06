import java.util.Scanner;
public class L1Ex6 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
				
			double x1;
			double x2;
			double y1;
			double y2;
			double d;
			double x3;
			double y3;
			
		System.out.println("Digite o valor de x1: ");
		x1 = leia.nextDouble();
		System.out.println("Digite o valor de x2: ");
		x2 = leia.nextDouble();
		System.out.println("Digite o valor de y1: ");
		y1 = leia.nextDouble();
		System.out.println("Digite o valor de y2: ");
		y2 = leia.nextDouble();
		
		y3 = (y2 - y1) * (y2 - y1);
		x3 = (x2 - x1) * (x2 - x1);
		
		d = Math.sqrt(x3+y3);
		System.out.println("O valor de D = "+d);
		
			
		
	}

}
