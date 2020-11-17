package lista;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner read =  new Scanner (System.in);
		float salarionovo;
		String percentual;
		System.out.println("Informe o seu salário atual: ");
		float salario = read.nextFloat();
		
		if(salario <= 280){
			salarionovo = (float) (salario + (salario * 0.2));
			percentual = " 20%";
		}else if (salario <= 700) {
			salarionovo = (float) (salario + (salario * 0.15));
			percentual = " 15%";
		}else if(salario <= 1500) {
			salarionovo = (float) (salario + (salario * 0.1));
			percentual = " 10%";
		}else{
			salarionovo = (float) (salario + (salario * 0.05));
			percentual = " 5%";
		}
		System.out.println("\n Salário antes do reajuste: " + salario + 
						   "\n Percentual de aumento aplicado: " + percentual + 
				           "\n Valor do aumento: " + (salarionovo - salario) +
				           "\n Novo salário após o aumento: " + salarionovo);	
	}

}
