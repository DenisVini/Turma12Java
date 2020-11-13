
public class L5Ex4 {

	public static void main(String[] args) {
		
		int s = 1;
		int x = 1;
		double y = 1;
		double result;
		double resultado = 0;	
		while(x<=99) {
			result = x/y ;
		System.out.println("O valor da divisão é: ");
		System.out.println(x+"/"+y+ "="+result);
		x = x+2;
		y = y+1;
		resultado = x+y;
		}System.out.println("Resultado: "+resultado);
	}
}