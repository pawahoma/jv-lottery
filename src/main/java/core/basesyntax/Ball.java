package core.basesyntax;

public class Ball {

  private COLOR color;
  private int number;

  @Override
  public String toString() {
    return "Ball{color: " + color + ", number: " + number + "}";
  }

  public COLOR getColor() {
    return color;
  }

  public Ball setColor(COLOR color) {
    this.color = color;
    return this;
  }

  public int getNumber() {
    return number;
  }

  public Ball setNumber(int number) {
    this.number = number;
    return this;
  }
}
