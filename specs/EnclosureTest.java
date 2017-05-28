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
    enclosure.addAnimal(zebra);
    enclosure.addAnimal(lion);
    enclosure.removeAnimal(zebra);
    assertEquals(1, enclosure.animalCount());
  }

  @Test 
  public void canAddAnimal() {
    enclosure.addAnimal(zebra);
    assertEquals(1, enclosure.animalCount());
  }

  @Test
  public void canCheckIfAnimalsCanStayTogetherPositiveExample() {
    enclosure.addAnimal(zebra);
    enclosure.checkAnimals(zebra, koala);
    assertEquals(2, enclosure.animalCount());
  }

  @Test
  public void canCheckIfAnimalsCanStayTogetherNegativeExample1() {
    enclosure.addAnimal(zebra);
    assertEquals("You can't put different classification animals to the same enclosure. Add a new enclosure.", enclosure.checkAnimals(zebra, lion));
  }

  @Test
  public void canCheckIfAnimalsCanStayTogetherNegativeExample2() {
    enclosure.addAnimal(zebra);
    enclosure.checkAnimals(zebra, lion);
    assertEquals(1, enclosure.animalCount());
  }

  @Test
  public void canGetEscapedAnimal() {
    enclosure.addAnimal(zebra);
    enclosure.addAnimal(koala);
    assertEquals("Bob", enclosure.getEscapedAnimal());
  }
}
