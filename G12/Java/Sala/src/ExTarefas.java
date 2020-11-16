import java.util.Scanner;
public class ExTarefas {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int dia;
		String dias[][]= new String [5][31];
		
		
		System.out.println("Entre com o dia que deseja cadastrar uma tarefa:");
		dia = leia.nextInt();
		
		
		
		for (int x=0; x<5; x++)
		{
			System.out.print("Entre com a "+ (x+1) + "ª tarefa do dia: ");
			dias[x][dia-1] = leia.next();
		}
		
		System.out.println("Tarefas do "+dia+ ": ");
		for (int x=0; x<5; x++)
		{
			System.out.println(dias[x][dia-1]);
		}
	}
}