import org.junit.*;
import static org.junit.Assert.assertEquals;
import visitors.*;


public class ZooTest {

  @Test
  public void canSellTicket() {
    Zoo zoo = new Zoo();
    Visitor visitor = new Visitor(25);
    zoo.sellTicket(visitor);
    assertEquals(15, zoo.getBudget());
  }

  @Test
  public void canSellTicketButNotCharge() {
    Zoo zoo = new Zoo();
    Visitor visitor = new Visitor(5);
    zoo.sellTicket(visitor);
    assertEquals(0, zoo.getBudget());
  }

}