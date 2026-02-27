//Faça um programa que leia N números reais e armazene-os em um vetor.
//Em seguida:
//-Imprima todos os elementos do vetor
//-Mostrar na tela a soma e a média dos elementos do vetor
package application10;

import java.util.Locale;
import java.util.Scanner;

import entities.Exercicio2Class;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		Exercicio2Class[] vect = new Exercicio2Class[n];
		double sum = 0;
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			double number = sc.nextDouble();
			vect[i] = new Exercicio2Class(number);
			sum += vect[i].getNumber();
		}
		
		System.out.print("VALORES = ");
		for(int i=0;i < vect.length; i++) {
			System.out.printf(" %.1f", vect[i].getNumber());
		}
		double avg = sum / vect.length;
		
		System.out.println();
		System.out.printf("SOMA = %.2f%n", sum);
		System.out.printf("MEDIA = %.2f%n", avg);
		sc.close();
	}

}
