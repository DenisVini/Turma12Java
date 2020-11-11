
public class L3Ex2 {

	public static void main(String[] args) {
		
		int x=0;
		int soma=0;
		int numImpares=0;
		
		for(x=1;x<=500;x++) {
			if((x%2!=0)&&(x%3==0)) {
				soma = soma+x;
				numImpares = numImpares + 1;
			}
		}
		System.out.println("Foram encontrados: "+numImpares+" numeros impares multiplos de 3 e a soma dos numeros impares de 1 a 500 é: "+soma);
	}

}
