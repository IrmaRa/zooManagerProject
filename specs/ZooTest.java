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
  Mammal koala;
  Enclosure enclosure;

  @Before 
  public void before() {
    zoo = new Zoo();
    adultVisitor = new Visitor(25);
    kidVisitor = new Visitor(5);
    koala = new Mammal("Sarah", 1, Classification.HERBIVORE, 200);
    enclosure = new Enclosure(1000, Type.BUSH);
  }

  @Test
  public void hasIncome() {
    assertEquals(0, zoo.getIncome());
  }

  @Test
  public void hasTickets() {
    assertEquals(100, zoo.getTickets());
  }

  @Test
  public void canSellTicket() {
    zoo.sellTicket(adultVisitor);
    assertEquals(15, zoo.getIncome());
  }

  @Test
  public void canSellTicketButNotCharge() {
    zoo.sellTicket(kidVisitor);
    assertEquals(0, zoo.getIncome());
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

  @Test
  public void canSellBabyAnimal() {
    enclosure.addFirstAnimal(koala);
    zoo.sellBabyAnimal(koala, enclosure);
    assertEquals(200, zoo.getIncome());
    assertEquals(0, enclosure.animalCount());
  }

  @Test
  public void canNotSellAnimalIfOlderThanOneYear() {
    Mammal zebra = new Mammal("Linda", 5, Classification.HERBIVORE, 300);
    enclosure.addFirstAnimal(zebra);
    zoo.sellBabyAnimal(zebra, enclosure);
    assertEquals(1, enclosure.animalCount());
  }

  @Test
  public void canGetTotalIncome() {
    enclosure.addFirstAnimal(koala);
    zoo.sellBabyAnimal(koala, enclosure);
    zoo.sellTicket(adultVisitor);
    assertEquals(215, zoo.getIncome());
  }

}