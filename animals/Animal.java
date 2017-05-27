package animals;
import java.util.ArrayList;
import food.*;

public abstract class Animal {
  private String name;
  private int age;
  private String group;
  private ArrayList<Edible> belly;


public Animal(String name, int age, String group) {
  this.name = name;
  this.age = age;
  this.group = group;
  this.belly = new ArrayList<Edible>();

}

public String getName() {
  return this.name;
}

public int getAge() {
  return this.age;
}

public String getGroup() {
  return this.group;
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

