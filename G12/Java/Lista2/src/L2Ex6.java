import java.util.Scanner;

public class L2Ex6 {
	public static void main (String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idadeNadadore ;
		
		System.out.print("Digite a idade do nadadore: ");
		idadeNadadore = leia.nextInt();
		
		if(idadeNadadore < 5) 
		{
			System.out.println("Não atendemos abaixo de 5 anos de idade.");
		}
		else if(idadeNadadore >=5 && idadeNadadore <=7) 
		{
			System.out.println("Nadadore Infantil A!");
		}
		else if(idadeNadadore >=8 && idadeNadadore <=11) 
		{
			System.out.println("Nadadore Infantil B!");
		}
		else if(idadeNadadore >=12 && idadeNadadore <=13) 
		{
			System.out.println("Nadadore Juvenil A!");
		}
		else if(idadeNadadore >=14 && idadeNadadore <=17) 
		{
			System.out.println("Nadadore Juvenil B!");
		}
		else if(idadeNadadore > 17) {
			System.out.println("Nadadore Adulto!");
		}
		
	}
}
