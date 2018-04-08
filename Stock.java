import java.util.Scanner;

public class Stock {
    double previousClosingPrice;
    double currentPrice;
    String name;
    String symbol;

    public Stock(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public Stock (String name, String symbol, double previousClosingPrice, double currentPrice) {
        this.name = name;
        this.symbol = symbol;
        this.previousClosingPrice= previousClosingPrice;
        this.currentPrice= currentPrice;
    }

    public double getChangePercent(double currentPrice, double previousClosingPrice) {
        return ((this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice) * 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter previousClosingPrice: ");
        double previousClosingPrice = scanner.nextDouble();
        System.out.println("Enter currentPrice:");
        double currentPrice = scanner.nextDouble();
        Stock stock = new Stock("ORCL ", "Oracle Corporation",currentPrice,previousClosingPrice);
        double resultChangePercent = stock.getChangePercent(currentPrice, previousClosingPrice);
        System.out.println("Result change percent the share : " + resultChangePercent + "%");


    }
}

