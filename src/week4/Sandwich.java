package week4;

public class Sandwich {
    String main_ingredient;
    String bread_type;
    double price;

    public Sandwich(String _main_ingredient, String _bread_type, double _price) {
        main_ingredient = _main_ingredient;
        bread_type = _bread_type;
        price = _price;
    }

    public void setMain_ingredient(String value) {
        main_ingredient = value;
    }
    public void setBread_type(String value) {
        bread_type = value;
    }
    public void setPrice(double value) {
        price = value;
    }

    public String getMain_ingredient() {
        return main_ingredient;
    }
    public String getBread_type(){
        return bread_type;
    }
    public double getPrice() {
        return price;
    }
}
