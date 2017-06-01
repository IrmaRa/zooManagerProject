import org.junit.*;
import static org.junit.Assert.assertEquals;
import animals.*;
import zoo.*;
import food.*;

public class ZooKeeperTest {

  ZooKeeper zooKeeper;
  Bird eagle;
  Mammal zebra;
  Meat rabbit;
  Plant bamboo;

  @Before
  public void before() {
    zooKeeper = new ZooKeeper("Laura");
    eagle = new Bird("Billy", 4, Classification.CARNIVORE, 50);
    zebra = new Mammal("Bob", 7, Classification.HERBIVORE, 400);
    rabbit = new Meat();
    bamboo = new Plant();
  }

  @Test
  public void zooKeeperHasName() {
    assertEquals("Laura", zooKeeper.getName());
  }

  @Test
  public void zooKeeperCanGetFood() {
    zooKeeper.getFood(bamboo);
    assertEquals(1, zooKeeper.basketCount());
  }

  @Test
  public void zooKeeperCanFeedAnimal() {
    zooKeeper.getFood(bamboo);
    zooKeeper.feedAnimal(zebra, bamboo);
    assertEquals(0, zooKeeper.basketCount());
  }

  @Test
  public void zooKeeperCanNotFeedAnimalPlantIfOnlyEatsMeat() {
    zooKeeper.getFood(bamboo);
    zooKeeper.feedAnimal(eagle, bamboo);
    assertEquals(1, zooKeeper.basketCount());
  }

  @Test
  public void animalsBellyIsFullAfterFeeding() {
    zooKeeper.getFood(bamboo);
    zooKeeper.feedAnimal(zebra, bamboo);
    assertEquals(1, zebra.foodCount());
  }

  @Test 
  public void animalsBellyIsNotFullAfterFeedingWrongFood() {
    zooKeeper.getFood(bamboo);
    zooKeeper.feedAnimal(eagle, bamboo);
    assertEquals(0, eagle.foodCount());
  }


}