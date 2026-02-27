package application10;

import java.util.Scanner;

import entities.Exercicio1Class;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Exercicio1Class[] vect = new Exercicio1Class[n];
		
		for(int i=0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			int number = sc.nextInt();
			vect[i] = new Exercicio1Class(number);
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for(int i=0; i < vect.length; i++) {
			if (vect[i].getNumber() < 0) {
				System.out.println(vect[i].getNumber());
			}
		}
		sc.close();

	}

}
