package week7;

public class DemoCandles {
    public static void main(String args[]) {
        Candle candle = new Candle();

        candle.setHeight(10);
        double price = candle.getPrice();
        System.out.println("The price of the candle is: " + price + ".");
    }
}