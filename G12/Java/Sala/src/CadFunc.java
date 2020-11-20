import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CadFunc 
{
	public static void main(String[]args) 
	{
		Scanner read = new Scanner(System.in);
		int numero;
		List<Funcionario> cadastro = new ArrayList<>();
		
		
		System.out.println("Digite o numero de funcionários para cadastro: ");
		numero = read.nextInt();
		
		for(int x = 1 ; x <= numero; x++ )
		{
			System.out.println("Terceiro 'S'sim ou 'N'-Não: ");
			char resposta  = read.next().toUpperCase().charAt(0);
			System.out.println("Empregado"+x);
			System.out.println("Digite o código: ");
			String codigo = read.next();
			System.out.println("Digite quantas horas trabalhadas: ");
			double horas = read.nextDouble();
			System.out.println("Digite o valor da hora: ");
			double valHora = read.nextDouble();
			if(resposta =='S') {
				System.out.println("Digite o valor adicional deste funcionário: ");
				double adicional = read.nextDouble();
				cadastro.add(new Terceiro(codigo , horas , valHora , adicional));
				
			}else
			{
				cadastro.add(new Funcionario(codigo, horas, valHora));
			}
			
		}
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO");
		for (Funcionario func: cadastro) {
			System.out.println(func.getCod() + " - " +String.format("%.2f",func.pagamentoSalario()));
		}
		
}
}