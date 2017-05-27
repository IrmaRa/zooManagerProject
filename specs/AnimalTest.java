import org.junit.*;
import static org.junit.Assert.assertEquals;
import animals.*;

public class AnimalTest {

@Test
public void testAnimalHasName() {
  Tiger tiger = new Tiger("Billy", 4);
  assertEquals("Billy", tiger.getName());
}





}