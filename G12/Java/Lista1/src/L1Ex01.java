import java.util.*;
public class L1Ex01 {
	public static void main (String[]args) {
	Scanner read = new Scanner(System.in);
	
	int dia, mes, anos;
	
	System.out.println("Digite quantos anos você tem: ");
	anos = read.nextInt();
	System.out.printf("Você tem %d anos e quantos meses: ",anos);
	mes = read.nextInt();
	System.out.printf("Você tem %d anos, %d meses e quantos dias: ",anos,mes);
	dia = read.nextInt();
	dias(anos, mes, dia);
	
	}
	public static void dias(int anos, int mes, int dia)
	{
		int dias;
		dias = ((anos * 365)+(mes*30)+dia);
		System.out.println("Você viveu: "+dias+" dias");
	}
}
