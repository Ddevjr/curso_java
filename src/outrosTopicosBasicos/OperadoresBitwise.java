//Operadores bitwise
//Operador        Significado
//	&		Operação "E" bit a bit
//	|		Operaçõ "OU" bit a bit		
//	^	Operação "OU-exclusivo" bit a bit

package outrosTopicosBasicos;

import java.util.Scanner;

public class OperadoresBitwise{
	public static void main(String[] args) {
		
//		int n1 = 89;
//		int n2 = 60;
//		
//		System.out.println(n1 & n2);
//		System.out.println(n1 | n2);
//		System.out.println(n1 ^ n2);
//		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if((n & mask) != 0) {
			System.out.println("o 6 bit é true!");
		}
		else {
			System.out.println("o 6 bit é false!");
		}
		
		sc.close();
	}
}