//Fazer um programa que leia o número de um funcionário,
//seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, 
//mostre o número e o salário do funcionário, com duas casas
//decimais.
package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int horas = sc.nextInt();
		double valorHoras = sc.nextDouble();
		
		System.out.println("NUMBER = " + numero);
		double salario = horas * valorHoras;
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		
		sc.close();
	
	}
}