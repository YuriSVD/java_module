package lessons.lesson2;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)

public class Book extends Papyrus {
    String author;
    String publisher;

    public Book() {
        super();
    }

    public Book(
            String title,
            int pages,
            boolean isPaper,
            String author,
            String publisher) {
        super(title, pages, isPaper);
        this.author = author;
        this.publisher = publisher;
    }
}
