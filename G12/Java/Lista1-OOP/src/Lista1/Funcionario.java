package Lista1;

public class Funcionario {

	private String nome;
	private char genero;
	private String codigo;
	
	public Funcionario (String codigo) {
		this.codigo = codigo;
	}
	public Funcionario(String nome, char genero, String codigo) {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String getCodigo() {
		return codigo;
	}
	
	
}
