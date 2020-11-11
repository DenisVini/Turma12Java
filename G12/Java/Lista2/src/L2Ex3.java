import java.util.Scanner ;
public class L2Ex3 {
	public static void main(String[]args) {

			Scanner leia = new Scanner(System.in);

		
		/*
		 * Desenvolva um sistema em que:
			Leia 4 (quatro) números;
			Calcule o quadrado de cada um;
			Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
			Caso contrário, imprima os valores lidos e seus respectivos quadrados.

		 */
		 
		
		int x1 ;
		int x2 ;
		int x3 ;
		int x4 ;
		int resultx1;
		int resultx2;
		int resultx3;
		int resultx4;
		
		
		System.out.println("Digite o valor de A: ");
		x1 = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		x2 = leia.nextInt();
		System.out.println("Digite o valor de C: ");
		x3 = leia.nextInt();
		System.out.println("Digite o valor de D: ");
		x4 = leia.nextInt();
		
		resultx3 = x3 * x3;
				if (resultx3 >= 1000)
				{
					System.out.println("Fim do programa!");
				}else 
				{
					resultx2 = x2 * x2;
					resultx1 = x1 * x1;
					resultx4 = x4 * x4;
					
					System.out.println("O valor de A ao quadrado: "+resultx1);
					System.out.println("O valor de B ao quadrado: "+resultx2);
					System.out.println("O valor de C ao quadrado: "+resultx3);
					System.out.println("O valor de D ao quadrado: "+resultx4);
				}
		
		
		
		
	}
}
