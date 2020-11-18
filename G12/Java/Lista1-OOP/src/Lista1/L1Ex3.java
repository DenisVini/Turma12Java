package Lista1;

import java.util.Scanner;

public class L1Ex3 {
	public static void main(String []args){
	
	Scanner read = new Scanner(System.in);
	
	produtoEletronico produto1 = new produtoEletronico("2020",'S',"Celular" );
	produtoEletronico produto2 = new produtoEletronico();
	
	System.out.println("Dados dos produtos");
	System.out.println("Produto-1");
	System.out.println("Ano de Fabricação: "+produto1.anoFab);
	System.out.println("Produto liga: "+produto1.liga);
	System.out.println("Tipo do produto: "+produto1.tipo);
	
	System.out.println("Produto-2");
	System.out.println("Digite o ano de fabricação");
	produto2.anoFab = read.next();
	System.out.println("O produto liga: 'S' ou 'N' ");
	produto2.liga = read.next().toUpperCase().charAt(0);
	System.out.println("Digite o tipo do produto: ");
	produto2.tipo = read.next();
	
	System.out.println("Dados dos produtos");
	System.out.println("Produto-2");
	System.out.println("Ano de Fabricação: "+produto2.anoFab);
	System.out.println("Produto liga: "+produto2.liga);
	System.out.println("Tipo do produto: "+produto2.tipo);
	}
}
