//Fazer um programa para ler o código de uma peça 1, o 
//número de peças 1, o valor unitário de cada peça 1, o 
//código de uma peça 2, o números de peças 2 e o valor
//unitário de cada peça 2. Calcule e mostre o valor a ser
//pago.
package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, nPecas1, cod2, nPecas2;
		double valorPecas1, valorPecas2, total;
		
		cod1 = sc.nextInt();
		nPecas1 = sc.nextInt();
		valorPecas1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		nPecas2 = sc.nextInt();
		valorPecas2 = sc.nextDouble();
		
		total = nPecas1 * valorPecas1 + nPecas2 * valorPecas2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}
}