import java.util.Scanner;
public class L3Ex3 {

	public static void main(String [] args) {
	Scanner leia = new Scanner(System.in);
	
	//Faça um sistema que leia o tempo de duração de um evento 
	//em uma fábrica expressa em segundos e mostre-o expresso 
	//em horas, minutos e segundos. 
	//
	int seg ;
	int hora ;
	int min ;
	
	
	
	System.out.println("Digite o tempo de duração do evento em segundos: ");
		seg = leia.nextInt();
		
		min = seg / 60 ;
		hora = min * 60 ;
	System.out.println("Visto as informações o evento durou por: "+min+" minutos ou "+hora+" horas");
	
		
		
		
		
	}
}
