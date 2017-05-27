import org.junit.*;
import static org.junit.Assert.assertEquals;
import animals.*;
import food.*;

public class AnimalTest {

@Test
public void animalHasName() {
  Eagle eagle = new Eagle("Billy", 4, "Bird");
  assertEquals("Billy", eagle.getName());
}

@Test
public void canEatPlant() {
  Koala koala = new Koala("Sarah", 1, "Mammal");
  Plant bamboo = new Plant();
  koala.eat(bamboo);
  assertEquals(1, koala.foodCount());
}





}