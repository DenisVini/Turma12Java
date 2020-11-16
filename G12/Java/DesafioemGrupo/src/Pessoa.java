
public class Pessoa {

	//atributos
	
	public String nome;
	public int anoNasc;
	public String genero;
	
	
	public void idade() {
		int idade;
		idade = 2020 - anoNasc;
		System.out.println(idade);
	}
	
}
