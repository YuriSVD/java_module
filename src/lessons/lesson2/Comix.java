package lessons.lesson2;

public class Comix extends Book {
    String painter;

    public Comix() {
        super();
    }

    public Comix(
            String title,
            int pages,
            boolean isPaper,
            String author,
            String publisher,
            String painter){
        super(title, pages, isPaper, author, publisher);
        this.painter = painter;
    }
}
