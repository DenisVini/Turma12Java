package Aplicacao;

import java.util.Scanner;

import Entidades.Aluno;

public class CadAluno1 {
	public static void main(String[]args) {
			
		Aluno aluno1 = new Aluno();
		Scanner read = new Scanner(System.in);
		
		String nome;
		int matricula;
		char status;
		
		System.out.println("Digite seu nome: ");
		nome = read.next();
		System.out.println("Digite sua matricula: ");
		matricula = read.nextInt();
		
		System.out.println("Digite seu gênero: 'M'-Masculino, 'F'-Feminino ou 'O'-Outros ");
		aluno1.setGenero(read.next().toUpperCase().charAt(0));
		aluno1.obterGenero();
		System.out.println("Digite seu ano de nascimento: ");
		aluno1.setAnoNasc(read.nextInt());
		aluno1.idade();
		
		if(aluno1.getGenero() == 'F') 
		{
		System.out.println("Seja bem vinda");
		}
		else if(aluno1.getGenero() == 'M') 
		{
			System.out.println("Seja bem vindo");
		}
		else if(aluno1.getGenero() =='O') 
		{
			System.out.println("Seja bem vinde");
		}
		System.out.println("Você é 'A'-Ativo ou 'I'-Inativo: ");
		status = read.next().toUpperCase().charAt(0);
		if(status == 'A') 
			{
			System.out.println("Matricula ativa.");
			System.out.println("");
			}
		else if(status == 'I')
		{
			System.out.println("Matricula inativa. ");	
			System.out.println("");
		}
		
		if(aluno1.idade()<13) 
		{
			System.out.println("Você está matriculado no ensino fundamental.");	
		}else if(aluno1.idade()>=13 && aluno1.idade()<=17) {
			System.out.println("Você está matriculado no ensino médio.");
		}
		else if(aluno1.idade()>17) {
			System.out.println("Você está matriculado no ensino superior. ");
		}
	}
}