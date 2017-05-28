import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;
import enclosures.*;
import animals.*;

public class EnclosureTest {
  Enclosure enclosure;
  Mammal zebra;
  Mammal lion;
  Mammal koala;

  @Before
  public void before() {
    enclosure = new Enclosure(1000, Type.GRASSLAND);
    zebra = new Mammal("Bob", 7, Classification.HERBIVORE);
    lion = new Mammal("Mark", 10, Classification.CARNIVORE);
    koala = new Mammal("Henry", 1, Classification.HERBIVORE);
  }


  @Test
  public void canCountAnimals() {
    assertEquals(0, enclosure.animalCount());
  }

  @Test
  public void canRemoveAnimal() {
    Enclosure enclosure = new Enclosure(500, Type.RAINFOREST);
    enclosure.addFirstAnimal(zebra);
    enclosure.removeAnimal(zebra);
    assertEquals(0, enclosure.animalCount());
  }

  @Test 
  public void canAddFirstAnimal() {
    enclosure.addFirstAnimal(zebra);
    assertEquals(1, enclosure.animalCount());
  }

  @Test
  public void canCheckIfAnimalsCanStayTogetherPositiveExample() {
    enclosure.addFirstAnimal(zebra);
    enclosure.addNewAnimal(zebra, koala);
    assertEquals(2, enclosure.animalCount());
  }

  @Test
  public void canCheckIfAnimalsCanStayTogetherNegativeExample1() {
    enclosure.addFirstAnimal(zebra);
    assertEquals("You can't put different classification animals to the same enclosure. Add a new enclosure.", enclosure.addNewAnimal(zebra, lion));
  }

  @Test
  public void canCheckIfAnimalsCanStayTogetherNegativeExample2() {
    enclosure.addFirstAnimal(zebra);
    enclosure.addNewAnimal(zebra, lion);
    assertEquals(1, enclosure.animalCount());
  }

  @Test
  public void canGetEscapedAnimal() {
    enclosure.addFirstAnimal(zebra);
    enclosure.addNewAnimal(zebra, koala);
    assertEquals("Bob", enclosure.getEscapedAnimal());
  }
}
