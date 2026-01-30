//Faça um programa para ler dois valores inteiros, e 
//depois mostrar na tela a soma desses números com uma
//mensagem explicativa.
package estruturaSequencial;

import java.util.Scanner;

public class exercicio_1 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int soma = a + b;
		
		System.out.println("SOMA = " + soma);
		sc.close();
	}
}