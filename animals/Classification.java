package animals;

public enum Classification {
  HERBIVORE ("Plant"),
  CARNIVORE ("Meat");

  private final String foodType;

  private Classification(String foodType) {
    this.foodType = foodType;
  }

  public String getFoodType() {
    return this.foodType;
  }
}