import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;
import enclosures.*;
import animals.*;

public class EnclosureTest {

 @Test
 public void canCountAnimals() {
  Enclosure enclosure = new Enclosure(1000, Type.GRASSLAND);
  assertEquals(0, enclosure.animalCount());
 }

 @Test
 public void canAddAnimal() {
  Zebra zebra = new Zebra("Bob", 7, "Mammal");
  Enclosure enclosure = new Enclosure(1000, Type.GRASSLAND);
  enclosure.addAnimal(zebra);
  assertEquals(1, enclosure.animalCount());
 }
}
