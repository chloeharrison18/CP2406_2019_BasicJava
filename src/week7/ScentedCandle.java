package week7;

public class ScentedCandle extends Candle {
    private String scent;

    public void setScent(String scent) {
        this.scent = scent;
    }

    public String getScent() {
        return scent;
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        int price = 3 * height;
    }
}
