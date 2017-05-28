import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;
import enclosures.*;
import animals.*;

public class EnclosureTest {
  Enclosure enclosure;
  Zebra zebra;
  Eagle eagle;

  @Before
  public void before() {
    enclosure = new Enclosure(1000, Type.GRASSLAND);
    zebra = new Zebra("Bob", 7, Group.MAMMAL, Classification.HERBIVORE);
    eagle = new Eagle("Mark", 10, Group.BIRD, Classification.CARNIVORE);
  }


  @Test
  public void canCountAnimals() {
    assertEquals(0, enclosure.animalCount());
  }

  @Test
  public void canAddAnimal() {
    enclosure.addAnimal(zebra);
    assertEquals(1, enclosure.animalCount());
  }

  @Test
  public void canRemoveAnimal() {
    Enclosure enclosure = new Enclosure(500, Type.RAINFOREST);
    enclosure.addAnimal(zebra);
    enclosure.addAnimal(eagle);
    enclosure.removeAnimal(zebra);
    assertEquals(1, enclosure.animalCount());
  }
}
