package Aplicacao;

import java.util.*;

import Entidades.Disciplina;
import Entidades.Pessoa;

public class CadAluno {

	public static void main(String[] args) {
		int escolha;
		Disciplina cursoPessoa = new Disciplina();
		Disciplina cursoPessoa2 = new Disciplina();
		Pessoa aluno = new Pessoa();
		Pessoa aluno2 = new Pessoa();
		Scanner read = new Scanner(System.in);
		
		System.out.println("Sistema de cadastro de alunos por matéria");
		
		System.out.println("Digite o nome do aluno: ");
		aluno.nome = read.next();
		
		System.out.println("Digite M-Masculino, F-Feminino ou O-Outros: ");
		aluno.genero = read.next().toUpperCase().charAt(0);
		
		System.out.println("Escolha 1-JAVA OU 2-SQL");
		escolha = read.nextInt();
	
		if (escolha ==1) {
			cursoPessoa.nome = "Java";
		}else if(escolha ==2) {
			cursoPessoa.nome = "SQL";
		}
		if(aluno.genero == 'F') {
			System.out.printf("Você é aluna do curso %s ",cursoPessoa.nome);
		}else if(aluno.genero == 'M') {
			System.out.printf("Você é aluno do curso %s",cursoPessoa.nome);
		}
		System.out.println("");	
		System.out.println("Próximo aluno.");
		System.out.println("");
		System.out.println("Digite o nome do aluno: ");
		aluno2.nome = read.next();
		
		System.out.println("Digite M-Masculino, F-Feminino ou O-Outros: ");
		aluno2.genero = read.next().toUpperCase().charAt(0);
			
		System.out.println("Escolha 1-JAVA OU 2-SQL");
		escolha = read.nextInt();
		if (escolha ==1) {
			cursoPessoa2.nome = "Java";
		}else if(escolha ==2) {
			cursoPessoa2.nome = "SQL";
		}
		if(aluno2.genero == 'F') {
			System.out.printf("Você é aluna do curso %s ",cursoPessoa2.nome);
		}else if(aluno2.genero == 'M') {
			System.out.printf("Você é aluno do curso %s",cursoPessoa2.nome);
		}
		
		
		
	}

}
