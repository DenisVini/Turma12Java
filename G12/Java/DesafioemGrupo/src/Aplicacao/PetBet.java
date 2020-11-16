package Aplicacao;

import java.util.*;

import Entidades.Aves;
import Entidades.Cachorro;
import Entidades.Entrega;
import Entidades.Pessoa;

public class PetBet {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		Pessoa cliente = new Pessoa("De","Bolla");
		Pessoa cliente2 = new Pessoa("Ricardo");
		Pessoa cliente3 = new Pessoa();
		Cachorro dog1 = new Cachorro ("Pitbull");
		Aves ave1 = new Aves ("Azul", "Curvado", "Arara-Azul");
		Entrega entrega1 = new Entrega();
		
		System.out.println("Digite o seu nome: ");
		cliente3.nome = read.next();
		System.out.println("Digite o ano de nascimento: ");
		cliente3.anoNasc = read.nextInt();
		
		System.out.println("Digite seu gênero M-Masculino, F-Feminino, O-Outros: ");
		cliente3.genero = read.next().toUpperCase().charAt(0);
		System.out.println(cliente.nome);
		System.out.println(cliente.idade);
		
	}

}
