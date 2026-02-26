package util;

public class CurrencyConverter {
		public static double converter(double coin, double amount) {
			double iof = coin * 1.06;
			return iof * amount;
		}
		
}

