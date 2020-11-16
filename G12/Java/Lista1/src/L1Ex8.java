import java.util.Scanner;

public class L1Ex8 {
	public static void main(String [] args) {
		Scanner leia = new Scanner(System.in);
		
		//O custo ao consumidor de um carro novo é a 
		//soma do custo de fábrica com a percentagem do
		//distribuidor e dos impostos (aplicados ao custo 
		//de fábrica). Supondo que a percentagem do distribuidor 
		//seja de 28% e os impostos de 45%, escrever um sistema 
		//que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 

		double precoFab;
		double precoFinal;
		double porcenDestribuidor;
		double porcenImpos;
			
		
			System.out.println("Digite o valor de fábrica do veículo: ");
			precoFab = leia.nextDouble();
		
			porcenDestribuidor = (precoFab / 100)* 28 ;
			porcenImpos = (precoFab / 100) * 45;
			
			precoFinal = precoFab + porcenImpos + porcenDestribuidor ;
			
			System.out.println("O valor para o consumidor é: "+precoFinal+"R$");	
		}
}
