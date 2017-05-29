package enclosures;
import java.util.ArrayList;
import java.util.Random;
import animals.*;

public class Enclosure {

  private ArrayList<Animal> animals;
  private int size;
  private Type type;
  private Random randomGenerator = new Random();

  public Enclosure(int size, Type type) {
    this.animals = new ArrayList<Animal>();
    this.size = size;
    this.type = type;
  }

  public ArrayList<Animal> getAnimals() {
    return this.animals;
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

  public void addFirstAnimal(Animal animal) {
    if(this.animals.size() == 0) {
      this.animals.add(animal);
    }
  }

  public String addNewAnimal(Animal animal, Animal newAnimal) {
    if(animal.getClassification().equals(newAnimal.getClassification())) {
      this.animals.add(newAnimal);
    }
      return "You can't put different classification animals to the same enclosure. Add a new enclosure.";
  }

  public void removeAnimal(Animal animal) {
    this.animals.remove(animal);
  }

  public String getEscapedAnimal() {
    int index = randomGenerator.nextInt(this.animals.size());
    Animal escapedAnimal = this.animals.get(index);
    this.animals.remove(escapedAnimal);
    return escapedAnimal.getName();
  } 

}