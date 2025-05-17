import java.util.Scanner;

public class SimpleCurrencyConverter {
    public static void main(String[] args) {
        // Example static rates: USD to others
        double usdToEur = 0.92;
        double usdToJpy = 155.5;
        double usdToGbp = 0.79;
        double usdToInr = 83.2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Convert from USD to: EUR, JPY, GBP, INR");
        System.out.print("Enter target currency code: ");
        String currency = sc.nextLine().trim().toUpperCase();

        System.out.print("Enter amount in USD: ");
        double amount = sc.nextDouble();

        double result = 0;
        switch (currency) {
            case "EUR": result = amount * usdToEur; break;
            case "JPY": result = amount * usdToJpy; break;
            case "GBP": result = amount * usdToGbp; break;
            case "INR": result = amount * usdToInr; break;
            default: System.out.println("Unsupported currency."); return;
        }

        System.out.printf("%.2f USD = %.2f %s%n", amount, result, currency);
        sc.close();
    }
}