package lessons.lesson2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user = new User(
                1,
                "Leanne Graham",
                "Bret",
                "Sincere@april.biz",
                new Address(
                        "Kulas Light",
                        "Apt. 556",
                        "Gwenborough",
                        "92998-3874",
                        new Geo(-37.3159F, 81.1496F)),
                "1-770-736-8031 x56442",
                "hildegard.org",
                new Company(
                        "Romaguera-Crona",
                        "Multi-layered client-server neural-net",
                        "harness real-time e-markets"
                )
        );
        //System.out.println(user);
        Skill[] skills = {
                new Skill("java", 10),
                new Skill("js", 10),
                new Skill("c++", 10)};

        Person person = new Person(
                1,
                "Vasya",
                "Pupkin",
                "asd@asd.com",
                31,
                Gender.MALE,
                skills,
                "Toyota",
                2021,
                250
        );
        //System.out.println(person);
        Book book = new Book("kskks", 12, true, "jjjd", "jfjjf");
        System.out.println(book);
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post(1, 1,
                "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
                "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"));
        posts.add(new Post(1, 2,
                "qui est esse",
                "est rerum tempore vitae\\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\\nqui aperiam non debitis possimus qui neque nisi nulla"));
        posts.add(new Post(1, 3,
                "ea molestias quasi exercitationem repellat qui ipsa sit aut",
                "et iusto sed quo iure\\nvoluptatem occaecati omnis eligendi aut ad\\nvoluptatem doloribus vel accusantium quis pariatur\\nmolestiae porro eius odio et labore et velit aut"));

        ArrayList<Comment> comments = new ArrayList<>();
        comments.add(new Comment(1, 1,
                "id labore ex et quam laborum",
                "Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"));
        comments.add(new Comment(1, 2,
                "quo vero reiciendis velit similique earum",
                "Jayne_Kuhic@sydney.com",
                "est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et"));
        comments.add(new Comment(1, 3,
                "odio adipisci rerum aut animi",
                "Nikita@garfield.biz",
                "quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione"));
        comments.add(new Comment(2, 7,
                "repellat consequatur praesentium vel minus molestias voluptatum",
                "Dallas@ole.me",
                "maiores sed dolores similique labore et inventore et\nquasi temporibus esse sunt id et\neos voluptatem aliquam\naliquid ratione corporis molestiae mollitia quia et magnam dolor"));
        comments.add(new Comment(2, 8,
                "et omnis dolorem",
                "Mallory_Kunze@marie.org",
                "ut voluptatem corrupti velit\nad voluptatem maiores\net nisi velit vero accusamus maiores\nvoluptates quia aliquid ullam eaque"));
        comments.add(new Comment(3, 13,
                "aut inventore non pariatur sit vitae voluptatem sapiente",
                "Kariane@jadyn.tv",
                "fuga eos qui dolor rerum\ninventore corporis exercitationem\ncorporis cupiditate et deserunt recusandae est sed quis culpa\neum maiores corporis et"));
        comments.add(new Comment(3, 14,
                "et officiis id praesentium hic aut ipsa dolorem repudiandae",
                "Nathan@solon.io",
                "vel quae voluptas qui exercitationem\nvoluptatibus unde sed\nminima et qui ipsam aspernatur\nexpedita magnam laudantium et et quaerat ut qui dolorum"));
        comments.add(new Comment(3, 15,
                "debitis magnam hic odit aut ullam nostrum tenetur",
                "Maynard.Hodkiewicz@roberta.com",
                "nihil ut voluptates blanditiis autem odio dicta rerum\nquisquam saepe et est\nsunt quasi nemo laudantium deserunt\nmolestias tempora quo quia"));
        for (Post post : posts) {
            for (Comment comment : comments) {
                if (post.getId() == comment.getPostId()) {
                    post.getComments().add(comment);
                }
            }
        }
    }
}
