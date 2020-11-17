package lista;
import  java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner read =  new Scanner (System.in);
		double pesoIdeal = 0;
		
		System.out.println("Qual o seu sexo? \n F - Feminino \n M - Masculino");
		String sexo = read.next();
		System.out.println("\n Qual o seu peso?");
		float p = read.nextFloat();
		System.out.println("\n Qual a sua altura?");
		float h = read.nextFloat();
		
		switch (sexo.toUpperCase()) {
		case "F":
			pesoIdeal = (62.1*h) - 44.7;
			break;
		case "M": 
			pesoIdeal = (72.7*h) - 58;
			break;
		}
		
		if(sexo.equalsIgnoreCase("F")){
			sexo = "Feminino";
		}else {
			sexo = "Masculino";
		}
		System.out.println("\n Altura: "+ h +
				   "\n Peso: "+ p +
				   "\n Sexo: " + sexo +
		"\n Seu peso ideal é: "+ pesoIdeal);
		if(p == pesoIdeal) {
			System.out.println(" portanto está no peso ideal.");
		}else if (p > pesoIdeal) {
			System.out.println(" portanto está acima do peso ideal.");
		}else {
			System.out.println(" portanto está abaixo do peso ideal.");
		}
	}

}
