package week7;

import java.awt.desktop.SystemEventListener;

public class DemoPoems {
    public static void main(String args[]) {
        Poem poem = new Poem("Poem", 10);
        Couplet couplet = new Couplet("Couplet");
        Haiku haiku = new Haiku("Haiku");
        Limerick limerick = new Limerick("Limerick");

        String poemName = poem.getName();
        int poemLines = poem.getLines();
        String coupletName = couplet.getName();
        int coupletLines = couplet.getLines();
        String haikuName = haiku.getName();
        int haikuLines = haiku.getLines();
        String limerickName = limerick.getName();
        int limerickLines = limerick.getLines();

        System.out.println("The " + poemName + " has " + poemLines + " lines.");
        System.out.println("The " + coupletName + " has " + coupletLines + " lines.");
        System.out.println("The " + haikuName + " has " +haikuLines + " lines.");
        System.out.println("The " + limerickName + " has " + limerickLines + " lines.");
    }
}
