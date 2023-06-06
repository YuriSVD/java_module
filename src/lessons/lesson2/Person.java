package lessons.lesson2;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {
    int id;
    String name;
    String surname;
    String email;
    int age;
    Gender gender;
    Skill[] skills;
    Car car;

    public Person(int id,
                  String name,
                  String surname,
                  String email,
                  int age,
                  Gender gender,
                  Skill[] skills,
                  String model,
                  int year,
                  int power) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = new Car(model, year, power);
    }
}
