package lessons.lesson2;

public class Magazine extends Book {
    String photographer;

    public Magazine() {
        super();
    }

    public Magazine(
            String title,
            int pages,
            boolean isPaper,
            String author,
            String publisher,
            String photographer) {
        super(title, pages, isPaper, author, publisher);
        this.photographer = photographer;
    }

}
