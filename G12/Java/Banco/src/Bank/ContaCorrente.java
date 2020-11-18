package Bank;

public class ContaCorrente extends Conta {

	

	private int numTalao=1;
	
	public ContaCorrente(int numero) {
		super(numero);
			}
	
	public int getNumTalao() {
		return numTalao;
	}
	public void setNumTalao(int numTalao) {
		this.numTalao = numTalao;
	}
	
	public void emitirTalao(int numTalao) {
		this.numTalao = this.numTalao+1;
	}
	
	
}
