package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public COLOR getRandomColor() {
        int index = new Random().nextInt(COLOR.values().length);
        return COLOR.values()[index];
    }
}
