package applicationCurrency;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;
public class program {

	public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    System.out.println("What is the dollar price? ");
    double dollarPrice = sc.nextDouble();
    System.out.println("How many dollars will be bought? ");
    double amount = sc.nextDouble();
    double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
    System.out.println("Amount to be paid in reais = " + result);
    
    
    
    
    
    sc.close();
	}

}
