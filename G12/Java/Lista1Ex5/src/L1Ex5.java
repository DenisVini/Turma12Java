import java.util.Scanner;
public class L1Ex5 {

	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		//Faça um sistema que leia as 3 notas de
		//um aluno e calcule a média final deste aluno.
		//Considerar que a média é ponderada e que o peso das
		//notas é: 2,3 e 5, respectivamente. 
		
		double notaUm ;
		double notaDois ;
		double notaTres ;
		double media ;
		
		System.out.println("Digite a nota 1: ");
		notaUm = leia.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		notaDois = leia.nextDouble();
		
		System.out.println("Digite a nota 3: ");
		notaTres = leia.nextDouble();
		
		media = (notaUm + notaDois + notaTres)/3 ;
		
		System.out.println("O valor da média é: "+media+" pontos");
		
	}
}
