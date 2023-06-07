package lessons.lesson3;

import lessons.lesson3.instrument.Drum;
import lessons.lesson3.instrument.Guitar;
import lessons.lesson3.instrument.Instrument;
import lessons.lesson3.instrument.Trumpet;
import lessons.lesson3.printables.Book;
import lessons.lesson3.printables.Magazine;
import lessons.lesson3.printables.Printable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(new Book("Animal Farm", "George Orwell", 120));
        printables.add(new Magazine("Forbes", "Donald Trump", 54, 2));

        for (Printable printable : printables) {
            printable.print();
        }
        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(new Guitar(6));
        instruments.add(new Drum(5));
        instruments.add(new Trumpet(20));

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}