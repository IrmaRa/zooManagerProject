package zoo;
import java.util.ArrayList;
import java.util.HashMap;
import visitors.*;
import enclosures.*;
import animals.*;


public class Zoo {
  private int tickets;
  private int entryFee;
  private int income;
  private ArrayList<Visitor> visitors;
  private HashMap<Type, Enclosure> enclosures;
  private ArrayList<Animal> animals;

  public Zoo() {
    this.tickets = 100;
    this.entryFee = 15;
    this.income = 0;
    this.visitors = new ArrayList<Visitor>();
    this.enclosures = new HashMap<Type, Enclosure>();
    this.animals = new ArrayList<Animal>();
  }

  public int getIncome() {
    return this.income;
  }

  public int getTickets() {
    return this.tickets;
  }

  public void sellTicket(Visitor visitor) {
    if(visitor.getAge() > 10 && visitor.getAge() < 65 && this.tickets != 0) {
      this.income += this.entryFee;
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
    this.enclosures.put(enclosure.getType(), enclosure);
  }

  public int enclosureCount() {
    return this.enclosures.size();
  } 

  public void sellBabyAnimal(Animal animal, Enclosure enclosure){
    if(animal.getAge() <= 1){
      this.income += animal.getPrice();
      enclosure.removeAnimal(animal);
    }
  }

}