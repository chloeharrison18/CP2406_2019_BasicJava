package week9;

import javax.swing.*;
import java.awt.*;

public class JBookQuote {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame quoteFrame = new JFrame("Book Quote");
        quoteFrame.setSize(1200, 800);
        quoteFrame.setVisible(true);
        quoteFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel quote = new JLabel("Thor was SERIOUSLY annoyed.");
        quote.setFont(font);
        quoteFrame.add(quote);
    }
}
