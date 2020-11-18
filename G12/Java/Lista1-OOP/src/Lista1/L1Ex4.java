package Lista1;

import java.util.Scanner;

public class L1Ex4 {
	public static void main(String[]args) 
	{
	
		Scanner read = new Scanner(System.in);
		Funcionario funcionario1 = new Funcionario("01");
		
		System.out.println("Digite seu nome: ");
		funcionario1.setNome(read.next());
		funcionario1.getNome();
		
		System.out.println("Digite seu genero: 'M'-Masculino, 'F'-Feminino ou 'O'-Outros ");
		funcionario1.setGenero(read.next().toUpperCase().charAt(0));
		
		if(funcionario1.getGenero() == 'M'){
			System.out.println("Seja bem-vindo "+funcionario1.getNome()+" seu código é: "+funcionario1.getCodigo());
		}else if(funcionario1.getGenero() == 'F') {
			System.out.println("Seja bem-vinda "+funcionario1.getNome()+" seu código é: "+funcionario1.getCodigo());
		}else if(funcionario1.getGenero()=='O') {
			System.out.println("Seja bem-vinde "+funcionario1.getNome()+" seu código é: "+funcionario1.getCodigo());
		}
		
		
	}

}
