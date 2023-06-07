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

public class Guitar implements Instrument {
    int numberOfStrings;

    @Override
    public void play() {
        System.out.printf("Playing %s with %s number of strings\n", this.getClass().getSimpleName(), numberOfStrings);
    }
}