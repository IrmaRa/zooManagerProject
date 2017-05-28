import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;
import enclosures.*;
import animals.*;

public class EnclosureTest {
  Enclosure enclosure;
  Zebra zebra;
  Eagle eagle;
  Koala koala;

  @Before
  public void before() {
    enclosure = new Enclosure(1000, Type.GRASSLAND);
    zebra = new Zebra("Bob", 7, Group.MAMMAL, Classification.HERBIVORE);
    eagle = new Eagle("Mark", 10, Group.BIRD, Classification.CARNIVORE);
    koala = new Koala("Henry", 1, Group.MAMMAL, Classification.HERBIVORE);
  }


  @Test
  public void canCountAnimals() {
    assertEquals(0, enclosure.animalCount());
  }

  @Test
  public void canRemoveAnimal() {
    Enclosure enclosure = new Enclosure(500, Type.RAINFOREST);
    enclosure.addAnimal(zebra);
    enclosure.addAnimal(eagle);
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
    assertEquals("You can't put different classification animals to the same enclosure. Add a new enclosure.", enclosure.checkAnimals(zebra, eagle));
  }

  @Test
  public void canCheckIfAnimalsCanStayTogetherNegativeExample2() {
    enclosure.addAnimal(zebra);
    enclosure.checkAnimals(zebra, eagle);
    assertEquals(1, enclosure.animalCount());
  }
}
