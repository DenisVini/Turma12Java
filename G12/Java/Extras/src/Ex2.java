import java.util.*;
public class Ex2 {
	public static void main (String[]args) {
		Scanner read = new Scanner(System.in);
		double hrTrabalhadas = 0;
		double valHora = 0;
		double salario = 0;
		double ir = 0;
		double salarioIR = 0;
		double salarioINSS = 0;
		double INSS = 0;
		double salFinal = 0;
		double salFGTS  = 0;
		double FGTS = 0;
		double desc = 0;
		double salLiquido=0;
		System.out.println("Digite quantas horas trabalha: ");
		hrTrabalhadas = read.nextDouble();
		System.out.println("Digite o valor por hora trabalhada: ");
		valHora = read.nextDouble();
		
		salario = hrTrabalhadas * valHora;
		if(salario <=900) {
			System.out.println("Você está isento dos descontos IR.");
		}else if(salario >900 && salario<=1500) {
			ir = 5;
			INSS = 10;
			FGTS = 11;
			salFGTS = ((salario/100)*FGTS);
			salarioINSS = ((salario/100)*INSS);
			salarioIR = ((salario/100)*ir);
			desc = salarioINSS-salarioIR;
			salLiquido = ((salario + FGTS) - desc);
		}else if(salario>1500 && salario <= 2500) {
			ir = 10;
			INSS = 10;
			FGTS = 11
			salarioINSS = ((salario/100)*ir);
			salarioIR = salario -((salario/100)*ir);
			desc = salarioINSS-salarioIR;
			salLiquido = ((salario + FGTS) - desc);
		}else if(salario>2500) {
			ir = 20;
			INSS = 10;
			FGTS = 11
			salarioINSS = ((salario/100)*INSS);
			salarioIR = ((salario/100)*ir);
			salFGTS = ((salario/100)*FGTS);
		}
		System.out.println("Salario bruto: ("+valHora+"*"+hrTrabalhadas+")	: "+salario+"R$");
		System.out.println("(-) IR("+ir+")	:"+salarioIR+"R$");
		System.out.println("(-) INSS("+INSS+")	:"+salarioINSS+"R$");
		System.out.println("(+) FGTS("+FGTS+")	:"+salFGTS+"R$");
		System.out.println("Total descontos: "+);
		

		
		
	}
}
