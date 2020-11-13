import java.util.Scanner;

public class Paulistinha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String times[]= {"CORINTHIANS","PALMEIRAS","SANTOS", "SPFC"};
		int pontos[][] = new int[4][4];
		boolean continua = true;
		int nRodadas = 1;
		int pontosR = 0;
		int teste = 0;
		int x ;
		System.out.println("Times:");
		
		for ( x = 0; x<4; x++) {
			System.out.println(times[x]);
		}while(continua) {
			System.out.println("Inicio da rodada: "+nRodadas);
			System.out.println("O time "+times[x]+" \n1-Ganhou / 2-Perdeu / 3-Empatou: ");
			pontosR = leia.nextInt();
			if (pontosR == 1) 
				{
					pontos[0][nRodadas]= teste+3;
				}
			else if(pontosR == 2)
				{
					pontos[0][nRodadas]= teste+0;
				}
			else if(pontosR == 3)
				{
					pontos[0][nRodadas]= teste+1;
				}
			System.out.println("O time "+times[1]+" \n1-Ganhou / 2-Perdeu / 3-Empatou: ");
			
			
		}
	}
	

}
