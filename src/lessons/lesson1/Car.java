package lessons.lesson1;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Car {
    String model;
    int power;
    float volumeEngine;
    boolean turbo;
}
