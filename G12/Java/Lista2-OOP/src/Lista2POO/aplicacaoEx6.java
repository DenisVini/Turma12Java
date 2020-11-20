package Lista2POO;

import java.util.*;

public class aplicacaoEx6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Vendedor vd1 = new Vendedor();
		System.out.println("Digite o nome do vendedor: ");
		vd1.nome=read.next();
		System.out.println("Digite o valor em vendas: ");
		vd1.setValorVendas(read.nextDouble());
		System.out.println("Digite a porcentagem em comissão: ");
		vd1.setComissao(read.nextDouble());
		vd1.calculoSal();
		System.out.println("O valor salário final é: "+vd1.getSalFinal()+"R$");
	}

}
