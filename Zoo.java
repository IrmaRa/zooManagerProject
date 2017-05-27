import java.util.ArrayList;
import visitors.*;
import enclosures.*;

public class Zoo {
  private int entryFee;
  private int budget;
  private ArrayList<Visitor> visitors;
  private ArrayList<Enclosure> enclosures;

  public Zoo() {
    this.entryFee = 15;
    this.budget = 0;
    this.visitors = new ArrayList<Visitor>();
    this.enclosures = new ArrayList<Enclosure>();
  }

  public int getBudget() {
    return this.budget;
  }

  public void sellTicket(Visitor visitor) {
    if(visitor.getAge() >= 10) {
      budget += entryFee;
    }
  }


}