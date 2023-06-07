package lessons.lesson3.printables;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Book implements Printable {
    String title;
    String authors;
    int pages;

    @Override
    public void print() {
        System.out.println("I am print book");
    }
}
