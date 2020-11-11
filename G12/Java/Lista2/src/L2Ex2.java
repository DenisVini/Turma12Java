import java.util.Scanner ;
public class L2Ex2 {
	public static void main(String [] args ) {
		
		/*
		 * Elabore um sistema que leia as variáveis C e N, 
		 * respectivamente código e número de horas trabalhadas
		 *  de um operário. E calcule o salário sabendo-se que 
		 *  ele ganha R$ 10,00 por hora. Quando o número de horas 
		 *  exceder a 50 calcule o excesso de pagamento armazenando-o
		 *   na variável E, caso contrário zerar tal variável. 
		 *   A hora excedente de trabalho vale R$ 20,00. No final do 
		 *   processamento imprimir o salário total e o salário excedente.
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int codigo ; //C
		int hora = 0 ;  //N
		int salario; 
		int resultado;
		int extra ; //E
		int salarioFinal;
	
		System.out.print("Digite o código de acesso: ");
		codigo = leia.nextInt();
		System.out.print("Digite o número de horas trabalhadas: ");
		hora = leia.nextInt();
		
		salario = hora * 10 ;
		
		extra = hora - 50 ;
		
		resultado = extra * 20 ;
		
		salarioFinal = salario + resultado ;
		
		if(hora>50)
		{
		System.out.print("O valor do salário é: "+salario+"R$\n");
		System.out.println("O valor do salário com os reajustes é: "+salarioFinal+"R$");
		}else
		{
		System.out.print("O valor do salário é: "+salario+"R$");	
		}
		
		
		
	}
}
