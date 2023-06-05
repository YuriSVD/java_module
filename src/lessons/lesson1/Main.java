package lessons.lesson1;

public class Main {
    public static void main(String[] args) {
        String[] authors = {"George Martin"};
        Book book = new Book("Game of Thrones", 924, authors, "fantasy");
        System.out.println(book);

        Car car = new Car("Ford Mustang", 224, 4.7F, false);
        System.out.println(car);

        Dog dog = new Dog("Churchill", 8, "Bulldog");
        System.out.println(dog);

        Comment comment = new Comment(1, 1, "CommentTitle", "CommentBody");
        System.out.println(comment);

        Post post = new Post(1, 1, "PostName", "email@gmail.com", "PostBody");
        System.out.println(post);
    }
}