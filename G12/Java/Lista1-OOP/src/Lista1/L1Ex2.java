package Lista1;

import java.util.Scanner;
import Lista1.Aviao;
public class L1Ex2 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		String modeloAviao;
		
		System.out.println("Digite o modelo do avião");
		modeloAviao = read.next();
		
		Aviao airviao1 =  new Aviao(modeloAviao);
		
		if (airviao1.velocidade < 10) 
		{
			airviao1.voando = false;
		}
		else 
		{
			airviao1.voando = true;
		}
			
		System.out.println("O avião está voando: "+airviao1.voando);
		System.out.println("Qual a velocidade: "+airviao1.velocidade);
		/*
		 * for (x=0; x<81; x++)
		 * {
		 * airviao1.aumentarVelocidade();
		 * }
		 */
		
		while (airviao1.velocidade < 80) {
		airviao1.aumentarVelocidade();
		}
		 System.out.println("O avião está voando: "+airviao1.voando);
		System.out.println("Qual a velocidade: "+airviao1.velocidade);
		
		
		
		
		
		
		

	}

}
