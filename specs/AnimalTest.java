import org.junit.*;
import static org.junit.Assert.assertEquals;
import animals.*;

public class AnimalTest {

@Test
public void testAnimalHasName() {
  Eagle eagle = new Eagle("Billy", 4, "Bird");
  assertEquals("Billy", eagle.getName());
}





}