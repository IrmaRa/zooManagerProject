package animals;
import java.util.ArrayList;
import food.*;

public abstract class Animal {
  private String name;
  private int age;
  private Classification classification;
  private ArrayList<Edible> belly;
  private int price;


  public Animal(String name, int age, Classification classification, int price) {
    this.name = name;
    this.age = age;
    this.classification = classification;
    this.belly = new ArrayList<Edible>();
    this.price = price;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public Classification getClassification() {
    return this.classification;
  }

  public int getPrice() {
    return this.price;
  }

  public int foodCount() {
    return this.belly.size();
  }

  public String getAnimalFoodType() {
    return this.classification.getFoodType();
  }

  public void eat(Edible food) {
    String foodType = food.getType();
    String animalFoodType = getAnimalFoodType();

    if(animalFoodType.equals(foodType)) {
      this.belly.add(food);
    }
  }

  public void sleep() {
    this.belly.clear();
  }

}