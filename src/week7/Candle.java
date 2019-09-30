package week7;

public class Candle {
    private String colour;
    private int height;
    private double price;


    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setHeight(int height) {
        this.height = height;
        price = 2 * height;
    }

    public int getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }
}
