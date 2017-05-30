import org.junit.*;
import static org.junit.Assert.assertEquals;
import animals.*;
import food.*;

public class AnimalTest {

  Bird eagle;

  @Before
  public void before() {
  eagle = new Bird("Billy", 4, Classification.CARNIVORE, 50);
  }

@Test
public void animalHasName() {
  assertEquals("Billy", eagle.getName());
}

@Test
public void animalHasAge() {
  assertEquals(4, eagle.getAge());
}

@Test
public void animalHasClassification() {
  assertEquals(Classification.CARNIVORE, eagle.getClassification());
}

@Test
public void animalHasPrice() {
  assertEquals(50, eagle.getPrice());
}

@Test
public void canCountFoodInBelly() {
  assertEquals(0, eagle.foodCount());
}

@Test
public void canEatPlant() {
  Mammal koala = new Mammal("Sarah", 1, Classification.HERBIVORE, 200);
  Plant bamboo = new Plant();
  koala.eat(bamboo);
  assertEquals(1, koala.foodCount());
}

@Test
public void canNotEatPlant() {
  Mammal lion = new Mammal("Michael", 3, Classification.CARNIVORE, 500);
  Plant bamboo = new Plant();
  lion.eat(bamboo);
  assertEquals(0, lion.foodCount());
}

@Test
public void canEatMeat() {
  Mammal lion = new Mammal("Michael", 3, Classification.CARNIVORE, 500);
  Meat rabbit = new Meat();
  lion.eat(rabbit);
  assertEquals(1, lion.foodCount());
}


@Test
public void canEmptyBelly() {
  Mammal bear = new Mammal("John", 2, Classification.CARNIVORE, 400);
  Meat steak = new Meat();
  Meat rabbit = new Meat();
  bear.eat(steak);
  bear.eat(rabbit);
  bear.sleep();
  assertEquals(0, bear.foodCount());
}


}