package lessons.lesson3.printables;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)

public class Magazine extends Book implements Printable {
    int issue;

    public Magazine() {
    }

    public Magazine(String title, String authors, int pages, int issue) {
        super(title, authors, pages);
        this.issue = issue;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

    @Override
    public void print() {
        System.out.println("I am print magazine");
    }
}
