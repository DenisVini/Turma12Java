import java.util.Scanner;

public class L5Ex5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int vetor[] = new int[5];
		int codigo = 0;
		int x = 0;
		
		for (x=0 ; x<5 ; x++) {
			System.out.println("Digite o valor:"+(x+1));
			vetor[x]= leia.nextInt();
			}
			System.out.println("Digite o valor do código: ");
			codigo = leia.nextInt();
		
		while (codigo != 1 && codigo !=2 && codigo !=0) {
			System.out.println("Código invalido!");
			System.out.println("Digite o valor do código: ");
			codigo = leia.nextInt();
		}if(codigo == 0) {
			System.out.println("FIM DO PROGRAMA!");
			
		}else if(codigo == 1) {
			for (int denis: vetor) {
				System.out.println(denis);
			}
		}else if(codigo == 2) {
				for(x=4 ; x>=0 ;x--) {
					System.out.println(vetor[x]);
				}
			}
	}

}
