package lista;
import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {

		Scanner read =  new Scanner (System.in);
		System.out.println("Qual o valsaque do saque?");
		int valsaque = read.nextInt();
		
		int nt100 = 100, nt50 = 50, nt10 = 10, nt5 = 5, nt1 = 1;	

		if(valsaque >= 10 && valsaque <= 600) {
			if(valsaque > nt100) {
				nt100 = valsaque / 100; 
				valsaque = valsaque % 100;   
				System.out.println(nt100 + " notas de 100");
			} 
			if(valsaque > nt50) {
				nt50 = valsaque / 50;
				valsaque = valsaque % 50;
				System.out.println(nt50 + " notas de 50");
			}
			if(valsaque > nt10) {
				nt10 = valsaque / 10;
				valsaque = valsaque % 10;
				System.out.println(nt10 + " notas de 10");
			}if(valsaque > nt5) {
				nt5 = valsaque / 5;
				valsaque = valsaque % 5;
				System.out.println(nt5 + " notas de 5");
			}if(valsaque > nt1) {
				nt1 = valsaque / 1;
				valsaque = valsaque % 1;
				System.out.println(nt1 + " notas de 1");
			}
		}else {
			System.out.println("Não é possível realizar o saque");
		}	
	}

}
