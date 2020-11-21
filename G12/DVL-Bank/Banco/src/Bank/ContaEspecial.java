package Bank;

public class ContaEspecial extends ContaCorrente {
	private double limite;
	
		public ContaEspecial(int numero, double limite) 
		{
			super(numero);
			this.limite = limite;
		}

		public double getLimite() {
			return limite;
		}

		public void setLimite(double limite) {
			this.limite = limite;
		}

		public void usarLimite(double valor) {
			
			if(super.getSaldo()<=0 && this.limite <= valor) {
				super.creditar(valor);
				this.limite -= valor;
				//linha 24: this.limite = this.limite - valor;
			}
		}
	
	

	
	
}
