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

  public void eatPlant(Edible food) {
    if(this.classification.equals(Classification.HERBIVORE) || this.classification.equals(Classification.OMNIVORE)) {
      this.belly.add(food);
    }
  }

  public void eatMeat(Edible food) {
    if(this.classification.equals(Classification.CARNIVORE) || this.classification.equals(Classification.OMNIVORE)) {
      this.belly.add(food);
    }
  }

  public void sleep() {
    this.belly.clear();
  }

}