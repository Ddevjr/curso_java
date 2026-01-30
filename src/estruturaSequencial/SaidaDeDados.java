package estruturaSequencial;
import java.util.Locale;

public class SaidaDeDados {
	
	public static void main(String[] args) {
		
//		String nome = "Maria";
//		int idade = 31;
//		double renda = 4000.0;
//		System.out.printf("%s tem %d anos e ganha R$%.2f reais%n", nome, idade, renda);
//		
//		double x = 10.35784;
//		System.out.println(x);
//		System.out.printf("%.2f%n", x);
//		
//		Locale.setDefault(Locale.US);
//		System.out.printf("%.2f%n", x);
//		
//		System.out.println("Resultado = " + x + " METROS");
//		System.out.printf("Resultado = %.2f metros%n", x);
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:%n%s, "
				+ "which price is $ %.2f%n"
				+ "%s, which price is $ %.2f"
				+ "%n", product1, price1, product2, price2);
		
		System.out.printf("%nRecord: %d years olf, code %d "
				+ "and gender: %s%n", age, code, gender);
		
		System.out.printf("%nMeasue with eight decimal places: %f%n"
				+ "Rouded (three decimal places): %.3f%n"
				+ "US decimal point: %.3f", measure, measure, measure);
	}

}
