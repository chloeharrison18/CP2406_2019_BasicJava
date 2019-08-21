package week4;

public class Student {
    private int id;
    private int creditHours;
    private int points;

    public Student() {
        id = 9999;
        creditHours = 3;
        points = 12;
    }

    // Setter Methods.
    public void setId(int value) { id = value; }
    public void setCreditHours(int value) { creditHours = value; }
    public void setPoints(int value) { points = value; }

    // Getter Methods.
    public int getId() { return id; }
    public int getCreditHours() { return creditHours; }
    public int getPoints() { return points; }

    double gpa() {
        double average = points / creditHours;
        return average;
    }
}
