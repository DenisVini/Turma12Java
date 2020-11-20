import java.util.*;

public class L4Ex2 {

	public static void main(String[]args) 
	{
	
		Scanner read = new Scanner(System.in);
		
		int N1[][] = new int[4][6]; 
		int N2[][] = new int [4][6];
		
		for(int l = 0 ; l < 4 ; l++) 
		{
			for(int c = 0 ; c < 6 ; c++)
			{
			
				N1[l][c] = (int)(Math.random()*10);
				System.out.println(N1[l][c]);
			} 
		}
		
	}
	
}
