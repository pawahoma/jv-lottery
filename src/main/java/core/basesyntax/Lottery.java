package core.basesyntax;

import java.util.Random;

public class Lottery {

  public Ball getRandomBall() {
    COLOR color = new ColorSupplier().getRandomColor();
    int number = new Random().nextInt(21);
    return new Ball()
        .setColor(color)
        .setNumber(number);
  }

}
