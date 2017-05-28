package zoo;
import java.util.ArrayList;
import visitors.*;
import enclosures.*;
import animals.*;


public class Zoo {
  private int tickets;
  private int entryFee;
  private int budget;
  private int babyAnimalPrice;
  private ArrayList<Visitor> visitors;
  private ArrayList<Enclosure> enclosures;
  private ArrayList<Animal> animals;

  public Zoo() {
    this.tickets = 100;
    this.entryFee = 15;
    this.budget = 0;
    this.babyAnimalPrice = 100;
    this.visitors = new ArrayList<Visitor>();
    this.enclosures = new ArrayList<Enclosure>();
    this.animals = new ArrayList<Animal>();
  }

  public int getBudget() {
    return this.budget;
  }

  public int getTickets() {
    return this.tickets;
  }

  public void sellTicket(Visitor visitor) {
    if(visitor.getAge() > 10 && this.tickets != 0) {
      this.budget += this.entryFee;
    }
    this.visitors.add(visitor);
    this.tickets -= 1;
  }

  public int visitorCount() {
    return this.visitors.size();
  }

  public void removeVisitor(Visitor visitor) {
    this.visitors.remove(visitor);
  }

  public void addEnclosure(Enclosure enclosure) {
    this.enclosures.add(enclosure);
  }

  public int enclosureCount() {
    return this.enclosures.size();
  } 

  public void sellBabyAnimal(Animal animal, Enclosure enclosure) {
   if(animal.getAge() <= 1) {
    this.budget += this.babyAnimalPrice;
    enclosure.removeAnimal(animal);
  }
}

}