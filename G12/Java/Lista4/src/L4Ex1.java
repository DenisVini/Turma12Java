import java.util.*;

public class L4Ex1 {

	public static void main(String[]args) 
	{
	
		Scanner read = new Scanner(System.in);
		
		int vet1[] = new int[5];
		int maiorVal = 0;
		
		for(int x = 0 ; x < 5 ; x++) 
		{
			System.out.println("Digite um valor: ");
			vet1[x] = read.nextInt();
			if (vet1[x] > maiorVal) {
				maiorVal = vet1[x];
			}
		}
		for(int x = 0 ; x<5 ; x++) 
		{
			System.out.println("Posição: "+(x+1)+": "+vet1[x]);
		}
		System.out.println("O maior valor: "+maiorVal);
	}
}
