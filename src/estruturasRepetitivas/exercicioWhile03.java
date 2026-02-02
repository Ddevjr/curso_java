//Um posto de combustíveis deseja determinar qual de seus
//produtos tem a preferência de seus clientes. Escreva um
//algoritmo para ler o tipo de combustível abastecido
//(codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usário informe um código inválido (fora
//da faixa de 1 a 4) deve ser solicitado um novo código
//(até que seja válido). O programa será encerrado quando
//o código informado for o número 4. Deve ser escrito a 
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que
//abasteceram cada tipo de combustível, conforme exemplo:
//	

package estruturasRepetitivas;

import java.util.Scanner;

public class exercicioWhile03{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtdAlcool = 0;
		int qtdGasolina = 0;
		int qtdDiesel = 0;
		int cod = 0;
		
		while(true) {
			cod = sc.nextInt();
			if(cod == 1) {
				qtdAlcool += 1;
			}
			else if(cod == 2) {
				qtdGasolina += 1;
			}
			else if(cod == 3) {
				qtdDiesel += 1;
			}
			else if(cod == 4) {
				System.out.println("MUITO OBRIGADO");
				System.out.println("Alcool: " + qtdAlcool);
				System.out.println("Gasolina: " + qtdGasolina);
				System.out.println("Diesel: " + qtdDiesel);
				break;
			}
		}
		
		
		sc.close();
	}
}