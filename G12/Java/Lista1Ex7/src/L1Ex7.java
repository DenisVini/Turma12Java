import java.util.Scanner;
public class L1Ex7 {
	public static void main(String []args) {
		Scanner leia = new Scanner(System.in);
		
		//Escreva um sistema que lê os coeficientes a,b,c,d,e e f e 
		//calcula e mostra os valores de x e y. 

		
		int a;
		int b;
		int c;
		int d;
		int e;
		int x;
		int y;
		int f;
		
		System.out.println("Digite o valor do coeficiente A: ");
		a = leia.nextInt();
		System.out.println("Digite o valor do coeficiente B: ");
		b = leia.nextInt();
		System.out.println("Digite o valor do coeficiente C: ");
		c = leia.nextInt();
		System.out.println("Digite o valor do coeficiente D: ");
		d = leia.nextInt();
		System.out.println("Digite o valor do coeficiente E: ");
		e = leia.nextInt();
		System.out.println("Digite o valor do coeficiente F: ");
		f = leia.nextInt();
		
		
		x = (( c * e ) - ( b * f )) / (( a * e ) - ( b * d ));
		y = (( a * f ) - ( c * d )) / (( a * e ) - ( b * d ));
		
		System.out.println("O valor de x = "+x+" e o valor de y é = "+y);
	}
}
