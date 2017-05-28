import org.junit.*;
import static org.junit.Assert.assertEquals;
import animals.*;
import food.*;

public class AnimalTest {

@Test
public void animalHasName() {
  Bird eagle = new Bird("Billy", 4, Classification.CARNIVORE);
  assertEquals("Billy", eagle.getName());
}

@Test
public void canEatPlant() {
  Mammal koala = new Mammal("Sarah", 1, Classification.HERBIVORE);
  Plant bamboo = new Plant();
  koala.eat(bamboo);
  assertEquals(1, koala.foodCount());
}

}