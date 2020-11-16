import java.util.*;
public class L1Ex02 {
	public static void main (String[]args) 
	{
	Scanner read = new Scanner(System.in);
	
	int dias, meses;
	
	System.out.println("Digite o numero de dias vividos: ");
	dias = read.nextInt();
	
	meses= dias/30;
	System.out.printf("Você viveu %d meses ",meses);
	anos(dias,meses);	
	}
	
	public static void anos(int dias, int meses)
	{
		int anos;
		anos = (meses/12) ;
		System.out.printf("e tem %d anos de idade.",anos);
	}
}
