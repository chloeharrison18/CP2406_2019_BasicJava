package week7;

public class Poem {
    private String name;
    private int lines;

    public Poem(String _name, int _lines) {
        name = _name;
        lines = _lines;
    }

    public String getName() {
        return name;
    }

    public int getLines() {
        return lines;
    }
}
