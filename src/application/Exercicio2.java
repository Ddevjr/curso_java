//Fazer um programa para ler os dados de um funcionário(nome, salário
//bruto e imposto). Em seguida, mostrar os dados do funcionário(nome e
//salário líquido). Em seguida, aumentar o salário do funcionário com
//base em uma porcetagem dada (somente o salário bruto é afetado pela
//porcetagem) e mostrar novamente os dados do funcionário. Use a classe
//projetada abaixo.

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		
		
		
		
		sc.close();

	}

}
