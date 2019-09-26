package week7;

public class DemoHorses {
    public static void main(String args[]) {
        Horse horse = new Horse();
        RaceHorse raceHorse = new RaceHorse();

        String horseName = "Beauty";
        horse.setName(horseName);
        String getHorseName = horse.getName();
        String colour = "Black";
        horse.setColour(colour);
        String getColour = horse.getColour();
        int year = 2006;
        horse.setYear(year);
        int getYear = horse.getYear();
        System.out.println("Horse name: " + getHorseName + "\nHorse colour: " + getColour + "\nHorse year of birth: " + getYear);

        int races = 5;
        raceHorse.setRaces(races);
        int getRaces = raceHorse.getRaces();
        System.out.println("The race horse has had" + getRaces + "races total.");
    }
}
