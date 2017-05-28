package enclosures;
import java.util.ArrayList;
import animals.*;

public class Enclosure {

  private ArrayList<Animal> animals;
  private int size;
  private Type type;

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

  public void addAnimal(Animal animal) {
      this.animals.add(animal);
  }

  public String checkAnimals(Animal animal1, Animal animal2) {
    if(animal1.getClassification().equals(animal2.getClassification())) {
      this.animals.add(animal2);
    }
      return "You can't put different classification animals to the same enclosure. Add a new enclosure.";
  }

  public void removeAnimal(Animal animal) {
    this.animals.remove(animal);
  }

}