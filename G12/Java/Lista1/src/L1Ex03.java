import java.util.*;
public class L1Ex03 {
	public static void main(String[]args) {
		Scanner read = new Scanner(System.in);
		int segundos;
		
		System.out.println("Digite quantos segundos durou o evento: ");
		segundos = read.nextInt();
		int horas;
		horas = segundos/3600;
		System.out.printf("O evento durou por %d horas",horas);
		minutos(segundos);
	}
	public static void minutos(int segundos) 
	{
		int minutos;
		minutos = segundos/60;
		System.out.printf(" ou %d minutos",minutos);	
	}
}