package food;

public class Plant implements Edible {
  public int nutritionValue() {
    return 100;
  }

  public String getType() {
    return "Plant";
  }
}