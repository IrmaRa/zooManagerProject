import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;
import enclosures.*;

public class EnclosureTest {
 Enclosure enclosure;

 @Test
 public void canCountAnimals() {
  enclosure = new Enclosure(1000, Type.GRASSLAND);
  assertEquals(0, enclosure.animalCount());
 }
}
