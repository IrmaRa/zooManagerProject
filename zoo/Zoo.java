package zoo;
import java.util.ArrayList;
import visitors.*;
import enclosures.*;

public class Zoo {
  private int tickets;
  private int entryFee;
  private int budget;
  private ArrayList<Visitor> visitors;
  private ArrayList<Enclosure> enclosures;

  public Zoo() {
    this.tickets = 100;
    this.entryFee = 15;
    this.budget = 0;
    this.visitors = new ArrayList<Visitor>();
    this.enclosures = new ArrayList<Enclosure>();
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

}