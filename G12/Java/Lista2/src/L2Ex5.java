import java.util.Scanner;
public class L2Ex5 {
	public static void main (String[]args){
		
		Scanner leia = new Scanner(System.in);
		
		double indiceP;
		
		System.out.print("Digite o valor do índice de poluição: ");
		indiceP = leia.nextDouble();
		
		if(indiceP < 0.3 ) 
		{
			System.out.println("O indice de poluição está aceitável, todas as empresas podem operar!");
		}
		else if(indiceP >= 0.3 && indiceP <= 0.39) 
		{
			System.out.println("O indice de poluição está acima do nível para operação do 1ºGrupo. Suspendam as atividades!");
		}
		else if(indiceP >= 0.4 && indiceP <= 0.49) 
		{
			System.out.println("O indice de poluição está acima do nível para operação do 1ºe2ºGrupo. Suspendam as atividades!");
		}
		else if (indiceP >=0.5) 
		{
			System.out.println("O indice de poluição está acima do nível para operação de todos os grupos. Suspendam as atividades!");
		}
	}
}
