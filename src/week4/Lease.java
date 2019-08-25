package week4;

public class Lease {
    private String tenantName;
    private int apartmentNum;
    private double monthlyRent;
    private String leaseTerm;

    public Lease(String _tenantName, int _apartmentNum, double _monthlyRent, String _leaseTerm) {
        tenantName = _tenantName;
        apartmentNum = _apartmentNum;
        monthlyRent = _monthlyRent;
        leaseTerm = _leaseTerm;
    }

    public void setTenantName(String value) { tenantName = value; }
    public void setApartmentNum(int value) {apartmentNum = value;}
    public void setMonthlyRent(double value) {monthlyRent = value;}
    public void setLeaseTerm(String value) {leaseTerm = value;}

    public String getTenantName() {return tenantName;}
    public int getApartmentNum() {return apartmentNum;}
    public double getMonthlyRent() { return monthlyRent; }
    public String getLeaseTerm() {return leaseTerm;}

    void addPetFee() {
        monthlyRent += 10.00;
        getMessage();
    }

    private static void getMessage() {
        System.out.println("A $10 fee will be added to your monthly rent for your pet to stay in the apartment.");
    }
}
