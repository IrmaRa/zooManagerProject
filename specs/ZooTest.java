import org.junit.*;
import static org.junit.Assert.assertEquals;
import zoo.*;
import visitors.*;
import enclosures.*;
import animals.*;


public class ZooTest {

  Zoo zoo;
  Visitor adultVisitor;
  Visitor kidVisitor;

  @Before 
  public void before() {
    zoo = new Zoo();
    adultVisitor = new Visitor(25);
    kidVisitor = new Visitor(5);
  }

  @Test
  public void canSellTicket() {
    zoo.sellTicket(adultVisitor);
    assertEquals(15, zoo.getBudget());
  }

  @Test
  public void canSellTicketButNotCharge() {
    zoo.sellTicket(kidVisitor);
    assertEquals(0, zoo.getBudget());
  }

  @Test
  public void canAddNewEnclosure() {
    Enclosure enclosure = new Enclosure(1000, Type.WETLAND);
    zoo.addEnclosure(enclosure);
    assertEquals(1, zoo.enclosureCount());
  }

  @Test
  public void canAddVisitor() {
    zoo.sellTicket(adultVisitor);
    zoo.sellTicket(kidVisitor);
    assertEquals(2, zoo.visitorCount());
  }

  @Test
  public void canRemoveVisitor() {
    zoo.sellTicket(adultVisitor);
    zoo.sellTicket(kidVisitor);
    zoo.removeVisitor(kidVisitor);
    assertEquals(1, zoo.visitorCount());
  }

  @Test
  public void canDecreaseTicketsNumberAfterSellingOne() {
    zoo.sellTicket(adultVisitor);
    assertEquals(99, zoo.getTickets());
  }

}