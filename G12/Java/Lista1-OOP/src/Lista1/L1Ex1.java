package Lista1;

import java.util.*;

public class L1Ex1 {
	public static void main(String[]args)
	{
	
		Scanner read = new Scanner(System.in);
		Cliente cliente1 = new Cliente();
		System.out.println("Digite o seu nome: ");
		cliente1.nome = read.next();
		System.out.println("Digite seu sobrenome: ");
		cliente1.sobrenome = read.next();
		System.out.println("Digite o seu gênero M-Masculino, F-Feminino ou O-Outros: ");
		cliente1.genero = read.next().toUpperCase().charAt(0);
		if(cliente1.genero == 'M') {
			System.out.println("Olá Sr. "+cliente1.nome);
		}else if(cliente1.genero == 'F') {
		System.out.println("Olá Srta. "+cliente1.nome+" "+cliente1.sobrenome+" ");
		}else {
			System.out.println("Olá Sre. "+cliente1.nome+" "+cliente1.sobrenome);
		}
	}
	
}
