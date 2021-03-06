package enclosures;
import java.util.ArrayList;
import java.util.Random;
import animals.*;

public class Enclosure {

  private ArrayList<Animal> animals;
  private int size;
  private Type type;
  private Random randomGenerator;

  public Enclosure(int size, Type type) {
    this.animals = new ArrayList<Animal>();
    this.size = size;
    this.type = type;
    this.randomGenerator = new Random();

  }

  public int getSize() {
    return this.size;
  }

  public Type getType() {
    return this.type;
  }

  public int animalCount() {
    return this.animals.size();
  }


  public void addAnimal(Animal newAnimal) {
    if(this.animals.size() == 0) {
      this.animals.add(newAnimal);
      return;
    }
    if(this.animals.get(0).getClassification().equals(newAnimal.getClassification())) {
      this.animals.add(newAnimal);
    }
  }

  public void removeAnimal(Animal animal) {
    this.animals.remove(animal);
  }

  public void removeAnimalByName(String name) {
    for (Animal animal : new ArrayList<>(animals)) {

      if (animal.getName().equals(name)) {
        animals.remove(animal);
      }

    }
  }

  public Animal getEscapedAnimal() {
    int index = randomGenerator.nextInt(this.animals.size());
    Animal escapedAnimal = this.animals.get(index);
    this.animals.remove(escapedAnimal);
    return escapedAnimal;
  } 
  
}