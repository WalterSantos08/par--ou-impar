/* Escreva um programa que receba um número inteiro como entrada e determine se ele é par ou ímpar.*/
/*Implemente uma solução que verifique todos os números de 1 a 100 e imprima quais são pares 
 * e quais são ímpares.*/
 
import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite um numero: ");
		int numero = entrada.nextInt();
		
		if (numero == 0) {
			System.out.println(numero + " " + "é neutro" );
		}
		else if (numero %2 == 0) {
			System.out.println(numero + " " + "é par");
		}else {
			System.out.println(numero + " " + "é impar");
		}
		
		for (int n = numero; n <= 100; n++) {
			if (n == 0) {
				System.out.println("o" + " " + n + " " + " é neutro");
		}
			else if (n %2 == 0) {
			System.out.println("o" + " " + n + " " + " são pares");
		}else {
			System.out.println("o" + " " + n + " " + " são impar");
		}
		
		
		entrada.close();
		
		}
	}
	
}


