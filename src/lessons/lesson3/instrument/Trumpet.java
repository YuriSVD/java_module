package lessons.lesson3.instrument;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Trumpet implements Instrument {
    int diameter;
    @Override
    public void play() {
        System.out.printf("Playing %s with %s diameter\n", this.getClass().getSimpleName(), diameter);
    }
}