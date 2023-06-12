package lessons.lesson5;

import lessons.lesson5.car.Car;
import lessons.lesson5.car.Owner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("yuri");
        names.add("vasyl");
        names.add("mykola");
        names.add("oksana");
        names.add("anna");
        names.add("vladyslav");
        names.add("iryna");
        names.add("roman");
        names.add("kateryna");
        names.add("victoria");
        names.add("oleksandr");
        names.add("serhii");
        names.add("ivan");
        names.add("tetiana");
        names.add("yaroslav");
        names.add("mykhailo");
        names.add("kristina");
        names.add("yulia");
        names.add("daryna");
        names.add("anastasia");

        names = names.stream().sorted(String::compareToIgnoreCase).toList();
        //names.sort(String::compareToIgnoreCase);
        System.out.println(names);
        List<String> filterList = names.stream().filter(s -> s.length() < 5).toList();
        System.out.println(filterList);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(4);
        numbers.add(10);
        numbers.add(20);
        numbers.add(41);
        numbers.add(32);
        numbers.add(13);
        numbers.add(22);
        numbers.add(9);
        numbers.add(15);
        numbers.add(2);
        numbers.add(10);
        numbers.add(64);
        numbers.add(23);
        numbers.add(51);
        numbers.add(29);
        numbers.add(17);
        numbers.add(81);
        numbers.add(40);
        //Collections.sort(numbers); // можна так
        System.out.println(numbers);
        numbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(numbers);
        numbers.stream().filter(x -> x % 3 == 0).forEach(System.out::println); // 2 в 1
        List<Integer> ints = numbers.stream().map(x -> x * 10).toList();
        ints.forEach(System.out::println);
        List<Car> cars = new ArrayList<>();
        Owner yuri = new Owner("Yuri", 33, 4);
        Owner kolya = new Owner("Kolya", 37, 17);
        Owner vlad = new Owner("Vlad", 21, 3);
        Owner vika = new Owner("Vika", 27, 3);
        Owner ivan = new Owner("Ivan", 22, 3);
        Owner sasha = new Owner("Sasha", 25, 6);
        Owner roma = new Owner("Roma", 34, 10);
        Owner oksana = new Owner("Oksana", 42, 20);
        Owner stepan = new Owner("Stepan", 38, 18);

        cars.add(new Car("Ford", 130, yuri, 65000, 1972));
        cars.add(new Car("Audi", 140, kolya, 10000, 2005));
        cars.add(new Car("Nissan", 120, vlad, 12000, 2009));
        cars.add(new Car("Toyota", 150, vika, 15000, 2011));
        cars.add(new Car("Peugeot", 100, ivan, 9000, 1999));
        cars.add(new Car("Mercedes", 160, sasha, 21000, 2009));
        cars.add(new Car("Volkswagen", 180, roma, 17000, 2015));
        cars.add(new Car("Fiat", 120, oksana, 13000, 2013));
        cars.add(new Car("BMW", 180, stepan, 19000, 2019));
        cars.add(new Car("Skoda", 180, yuri, 19000, 2015));

        cars.stream().limit(cars.size() / 2).forEach(car -> car.setPowerEngine((int) (car.getPowerEngine() * 1.1)));
        cars.stream().filter(car -> car.getOwner().getDrivingExperience() < 5 && car.getOwner().getAge() > 25)
                .forEach(car -> car.getOwner().setDrivingExperience(car.getOwner().getDrivingExperience() + 1));
        cars.forEach(System.out::println);
        Integer summeryOfCarsCost = cars.stream().mapToInt(Car::getPrice).sum();
        System.out.println(summeryOfCarsCost);
    }
}
