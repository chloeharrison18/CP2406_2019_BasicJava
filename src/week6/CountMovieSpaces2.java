package week6;

import java.util.Scanner;

public class CountMovieSpaces2  {
    public static void main(String args[]) {
        String quote;
        int spaces = 0;
        int totalSpaces;
        int x;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your favourite movie quote: ");
        quote = input.next();
        int length = quote.length();

        for(x = 0; x <= length; ++x)
        {
            if(quote.equals(""))
            {
                spaces += 1;
            }
        }

        totalSpaces = spaces;
        System.out.println("There are " + totalSpaces + "spaces in the quote");
    }
}
