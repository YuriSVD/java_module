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

public class Drum implements Instrument {
    int size;

    @Override
    public void play() {
        System.out.println("Playing " + this.getClass().getSimpleName() + " with " + size + " size");
    }
}