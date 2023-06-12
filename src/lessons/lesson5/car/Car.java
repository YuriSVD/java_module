package lessons.lesson5.car;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Car {
    String brand;
    int powerEngine;
    Owner owner;
    int price;
    int year;

}
