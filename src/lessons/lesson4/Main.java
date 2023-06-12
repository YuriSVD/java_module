package lessons.lesson4;

import lessons.lesson2.Gender;
import lessons.lesson2.Person;
import lessons.lesson2.Skill;
import lessons.lesson4.user.User;
import lessons.lesson4.zooClub.Pet;
import lessons.lesson4.zooClub.ZooClub;
import lessons.lesson4.zooClub.ZooMember;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("vasya", 31, false));
        users.add(new User("petya", 30, true));
        users.add(new User("kolya", 29, true));
        users.add(new User("olya", 28, false));
        users.add(new User("max", 30, true));
        users.add(new User("anya", 31, false));
        users.add(new User("oleg", 28, false));
        users.add(new User("andrey", 29, true));
        users.add(new User("masha", 30, true));
        users.add(new User("olya", 31, false));
        users.add(new User("max", 31, true));

        //Collections.sort(users, (User u1, User u2) -> u1.getAge() - u2.getAge());
        users.sort(Comparator.comparingInt(User::getAge));
        users.sort((u1, u2) -> u2.getAge() - u1.getAge());
        users.sort(Comparator.comparingInt((User u) -> u.getName().length()));
        users.sort((u1, u2) -> u2.getName().length() - u1.getName().length());
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("c++");
        list.add("angular");
        list.add("spring");
        list.add("hypernate");
        list.add("react");
        list.add("node");
        list.add("tomcat");
        list.add("sql");
        list.add("mongodb");
        list.add("css");
        list.add("html");
        list.add("kotlin");
        list.add("django");
        list.add("vue");
        list.add("swift");
        list.add("ruby");
        list.add("pascal");
        list.add("git");
        list.sort(String::compareToIgnoreCase);
        System.out.println(list);
        //users.sort(Comparator.comparing(User::getName));
        //users.sort((u1, u2) -> u2.getName().compareTo(u1.getName()));


        Skill[] vasyaSkills = {
                //3
                new Skill("java", 3),
                new Skill("js", 5),
                new Skill("c++", 7)};

        Skill[] petroSkills = {
                //2
                new Skill("html", 5),
                new Skill("css", 5)};

        Skill[] kolyaSkills = {
                //4
                new Skill("react", 7),
                new Skill("node", 5),
                new Skill("vue", 3),
                new Skill("angular", 4)
        };

        Skill[] olyaSkills = {
                //5
                new Skill("java", 6),
                new Skill("spring", 6),
                new Skill("hypernate", 5),
                new Skill("tomcat", 4),
                new Skill("maven", 5)
        };
        Skill[] maxSkills = {
                //10
                new Skill("c++", 10),
                new Skill("c#", 4),
                new Skill("c", 8),
                new Skill("objective-c", 7),
                new Skill("git", 10),
                new Skill("ruby", 6),
                new Skill("java", 8),
                new Skill("python", 9),
                new Skill("swift", 3),
                new Skill("sql", 10)
        };
        Skill[] annaSkills = {
                //9
                new Skill("js", 5),
                new Skill("ts", 4),
                new Skill("react", 4),
                new Skill("angular", 4),
                new Skill("node", 3),
                new Skill("html", 7),
                new Skill("css", 7),
                new Skill("git", 5),
                new Skill("vue", 2)
        };
        Skill[] olegSkills = {
                //1
                new Skill("Pascal", 15)
        };
        Skill[] andriiSkills = {
                //6
                new Skill("python", 8),
                new Skill("django", 8),
                new Skill("bottle", 7),
                new Skill("flask", 6),
                new Skill("cherryPy", 4),
                new Skill("dash", 2)
        };
        Skill[] mashaSkills = {
                //8
                new Skill("angular", 5),
                new Skill("react", 6),
                new Skill("vue", 5),
                new Skill("ember", 3),
                new Skill("node", 4),
                new Skill("meteor", 2),
                new Skill("mithril", 1),
                new Skill("polymer", 2)
        };
        Skill[] dashaSkills = {
                //7
                new Skill("spring", 12),
                new Skill("hibernate", 11),
                new Skill("play", 9),
                new Skill("apache struts", 3),
                new Skill("dropwizard", 6),
                new Skill("GWT", 5),
                new Skill("JSF", 3)
        };
        Person vasya = new Person(
                1,
                "Vasya",
                "Vasylev",
                "vasylev@gmail.com",
                31,
                Gender.MALE,
                vasyaSkills,
                "Toyota",
                2021,
                250);
        Person petro = new Person(
                2,
                "Petro",
                "Petrov",
                "petrov@gmail.com",
                30,
                Gender.MALE,
                petroSkills,
                "Fiat",
                2019,
                190);
        Person kolya = new Person(
                3,
                "Kolya",
                "Nilolaev",
                "nikolayev@gmail.com",
                29,
                Gender.MALE,
                kolyaSkills,
                "Audi",
                2023,
                300);
        Person olya = new Person(
                4,
                "Olya",
                "Olyaeva",
                "olyaeva@gmail.com",
                28,
                Gender.FEMALE,
                olyaSkills,
                "Mersedes",
                2022,
                250);
        Person max = new Person(
                5,
                "Max",
                "Maximov",
                "maximov@gmail.com",
                30,
                Gender.MALE,
                maxSkills,
                "Porsche",
                2019,
                310);
        Person anna = new Person(
                6,
                "Anna",
                "Annaeva",
                "annaeva@gmail.com",
                31,
                Gender.FEMALE,
                annaSkills,
                "Fiat",
                2020,
                120);
        Person oleg = new Person(
                7,
                "Oleg",
                "Olegov",
                "olegov@gmail.com",
                28,
                Gender.MALE,
                olegSkills,
                "Ford",
                2001,
                140);
        Person andrii = new Person(
                8,
                "Andrii",
                "Andriev",
                "andriev@gmail.com",
                29,
                Gender.MALE,
                andriiSkills,
                "Honda",
                2009,
                250);
        Person masha = new Person(
                9,
                "Masha",
                "Shaeva",
                "shaeva@gmail.com",
                30,
                Gender.FEMALE,
                mashaSkills,
                "Mazda",
                2013,
                220);
        Person dasha = new Person(
                10,
                "Dasha",
                "Dashaeva",
                "dashaeva@gmail.com",
                27,
                Gender.FEMALE,
                dashaSkills,
                "Volvo",
                2019,
                270);
        HashSet<Person> personHashSet = new HashSet<>();
        personHashSet.add(vasya);
        personHashSet.add(petro);
        personHashSet.add(kolya);
        personHashSet.add(olya);
        personHashSet.add(max);
        personHashSet.add(anna);
        personHashSet.add(oleg);
        personHashSet.add(andrii);
        personHashSet.add(masha);
        personHashSet.add(dasha);

        personHashSet.removeIf(person -> person.getGender().equals(Gender.MALE));
        for (Person person : personHashSet) {
            System.out.println(person.getName());
        }

        TreeSet<Person> personTreeSet = new TreeSet<>(Comparator.comparingInt(o -> o.getSkills().length));
        personTreeSet.add(vasya);
        personTreeSet.add(petro);
        personTreeSet.add(kolya);
        personTreeSet.add(olya);
        personTreeSet.add(max);
        personTreeSet.add(anna);
        personTreeSet.add(oleg);
        personTreeSet.add(andrii);
        personTreeSet.add(masha);
        personTreeSet.add(dasha);

        //System.out.println(personTreeSet);

        ZooClub zooClub = new ZooClub();
        ZooMember vasya1 = new ZooMember("Vasya");
        ZooMember vika = new ZooMember("Vika");
        zooClub.setMember(vasya1);
        zooClub.setMember(vika);
        zooClub.setPet(vika, new Pet("kokos", 2));
        //System.out.println(zooClub);
        zooClub.setPet(vasya1, new Pet("kokos", 3));
        zooClub.setPet(vasya1, new Pet("tom", 5));
        zooClub.showZooClub();
        zooClub.deletePetFromAllMembers("kokos");
        zooClub.showZooClub();
    }
}