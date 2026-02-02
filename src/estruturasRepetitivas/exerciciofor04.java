//Fazer um programa para ler um número N. Depois leia N
//pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denomidador for igual a zero, mostrar a
//mensagem "divisão impossivel".

package estruturasRepetitivas;

import java.util.Scanner;

public class exerciciofor04{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			double resultado = (double) a / b;
			
			if(b == 0) {
				System.out.println("Divisão impossivel");
			}
			else {
				System.out.println(resultado);
			}
		}
		
		sc.close();
	}
}