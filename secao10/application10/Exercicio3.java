//Fazer um programa para ler nome, idade e altura de N pessoas, 
//conforme exempplo. Depois, mostrar na tela a altura média das 
//pessoas, e mostrar também a porcentagem de pessoas com menos de 
//16 anos, bem como os nomes dessas pessoas caso houver.
package application10;

import java.util.Locale;
import java.util.Scanner;

import entities.Exercicio3Class;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Exercicio3Class vect;
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa%n", i+1);
			System.out.println("Nome: ");
			String name = sc.nextLine();
			System.out.println("Idade: ");
			int age = sc.nextInt();
			System.out.println("Altura: ");
			double height = sc.nextDouble();
			vect = new Exercicio3Class(name, age, height);
			sc.nextLine();
		}
		sc.close();

	}

}
