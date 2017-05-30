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
    zebra = new Mammal("Bob", 7, Classification.HERBIVORE, 300);
    lion = new Mammal("Mark", 10, Classification.CARNIVORE, 500);
    koala = new Mammal("Henry", 1, Classification.HERBIVORE, 200);
  }

  @Test
  public void hasSize() {
    assertEquals(1000, enclosure.getSize());
  }

  @Test 
  public void hasType() {
    assertEquals(Type.GRASSLAND, enclosure.getType());
  }

  @Test
  public void canCountAnimals() {
    assertEquals(0, enclosure.animalCount());
  }

  @Test 
  public void canAddFirstAnimal() {
    enclosure.addAnimal(zebra);
    assertEquals(1, enclosure.animalCount());
  }

  @Test
  public void canRemoveAnimal() {
    Enclosure enclosure = new Enclosure(500, Type.RAINFOREST);
    enclosure.addAnimal(zebra);
    enclosure.removeAnimal(zebra);
    assertEquals(0, enclosure.animalCount());
  }

  @Test
  public void canRemoveAnimalByName() {
    Enclosure enclosure = new Enclosure(500, Type.RAINFOREST);
    enclosure.addAnimal(zebra);
    enclosure.removeAnimalByName("Bob");
    assertEquals(0, enclosure.animalCount());
  }

  @Test
  public void canCheckIfAnimalsCanStayTogetherPositiveExample() {
    enclosure.addAnimal(zebra);
    enclosure.addAnimal(koala);
    assertEquals(2, enclosure.animalCount());
  }

  @Test
  public void canCheckIfAnimalsCanStayTogetherNegativeExample() {
    enclosure.addAnimal(zebra);
    enclosure.addAnimal(lion);
    assertEquals(1, enclosure.animalCount());
  }

  // tested if method works, commented out because returns random result
  // @Test
  // public void canGetEscapedAnimal() {
  //   enclosure.addAnimal(zebra);
  //   enclosure.addAnimal(koala);
  //   assertEquals("Bob", enclosure.getEscapedAnimal().getName());
  // }

  @Test
  public void canRemoveEscapedAnimalFromEnclosure() {
    enclosure.addAnimal(zebra);
    enclosure.addAnimal(koala);
    enclosure.getEscapedAnimal();
    assertEquals(1, enclosure.animalCount());
  }
}
