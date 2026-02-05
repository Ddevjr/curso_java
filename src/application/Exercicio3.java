//Fazer um programa para ler o nome de um aluno e as três notas que ele
//obteve nos três trimestres do ano (primeiro trimestre vale 30 e o 
//segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final
//do aluno no ano. Dizer também se o aluno está aprovado(PASS) ou não
//(FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter
//o mínimo para ser aprovado(que é 60% da nota). Você deve criar uma classe
//Student para resolver esse problema.

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student std = new Student();
		
		std.name = sc.nextLine();
		std.nota1 = sc.nextDouble();
		std.nota2 = sc.nextDouble();
		std.nota3 = sc.nextDouble();
		
//		std.PassFailed();
		System.out.printf("FINAL GRADE: %.2f POINTS%n", std.finalNote());
		
		if(std.finalNote() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", std.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		sc.close();

	}

}
