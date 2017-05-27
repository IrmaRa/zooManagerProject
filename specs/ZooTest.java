import org.junit.*;
import static org.junit.Assert.assertEquals;
import zoo.*;
import visitors.*;
import enclosures.*;


public class ZooTest {

  Zoo zoo;

  @Before 
  public void before() {
    zoo = new Zoo();
  }

  @Test
  public void canSellTicket() {
    Visitor visitor = new Visitor(25);
    zoo.sellTicket(visitor);
    assertEquals(15, zoo.getBudget());
  }

  @Test
  public void canSellTicketButNotCharge() {
    Visitor visitor = new Visitor(5);
    zoo.sellTicket(visitor);
    assertEquals(0, zoo.getBudget());
  }

  @Test
  public void canAddNewEnclosure() {
    Enclosure enclosure = new Enclosure(1000, Type.WETLAND);
    zoo.addEnclosure(enclosure);
    assertEquals(1, zoo.enclosureCount());
  }

}