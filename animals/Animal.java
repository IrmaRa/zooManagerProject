package animals;
import java.util.ArrayList;
import food.*;

public abstract class Animal {
  private String name;
  private int age;
  private Classification classification;
  private ArrayList<Edible> belly;


public Animal(String name, int age, Classification classification) {
  this.name = name;
  this.age = age;
  this.classification = classification;
  this.belly = new ArrayList<Edible>();
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

public int foodCount() {
  return this.belly.size();
}

public void eat(Edible food) {
  this.belly.add(food);
}

public void sleep() {
  this.belly.clear();
}

}