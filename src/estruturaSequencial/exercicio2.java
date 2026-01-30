//Faça um programa para ler o valor do raio de um círculo,
//e depois mostrar o valor da área deste círculo com quatro
//casas decimais.
package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14149;
		
		double raio = sc.nextDouble();
		
		double area = pi * (raio*raio);
		
		System.out.printf("A=%.4f%n", area);
		
		
		sc.close();
		
	}
}