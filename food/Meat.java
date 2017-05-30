package food;

public class Meat implements Edible {
  public int nutritionValue() {
    return 200;
  }

  public String getType() {
    return "Meat";
  }
}