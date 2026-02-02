//Leia um valor inteiro X (1 <= X <= 1000). Em seguida
//mostre os ímparesde 1 até X, um valor por linha, inclusive o 
//X, se for o caso.

package estruturasRepetitivas;

import java.util.Scanner;

public class exerciciofor01{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		for(int i = 1; i<=X; i++) {
			if(i % 2 !=	0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}