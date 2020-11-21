package Bank;

public class ContaCorrente extends Conta {

	

	private int numTalao;
	
	public ContaCorrente(int numero) {
		super(numero);
			}
	
	public int getNumTalao() {
		return numTalao;
	}
	public void setNumTalao(int numTalao) {
		this.numTalao = numTalao;
	}
	
	public void emitirTalao1() {
		this.numTalao = this.numTalao+1;
	}
	public void emitirTalao1(int numTaloes) {
		this.numTalao = this.numTalao + numTaloes;
	}
	
	
}
