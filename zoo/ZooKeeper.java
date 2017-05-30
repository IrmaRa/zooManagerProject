package zoo;
import java.util.ArrayList;
import animals.*;
import food.*;

public class ZooKeeper {

  private String name;
  private ArrayList<Edible> basket;

  public ZooKeeper(String name) {
    this.name = name;
    this.basket = new ArrayList<Edible>();
  }

  public String getName() {
    return this.name;
  }

  public void getFood(Edible food) {
   this.basket.add(food);
 }

 public int basketCount() {
  return this.basket.size();
}

// public void feedMeatEater(Animal animal, Meat meat) {
//   if (basketCount() > 0 &&  animal.eatMeat(meat)) {  
   
//     this.basket.remove(meat);
//   }
// }

// public void feedPlantEater(Animal animal, Plant plant) {
//   if (basketCount() > 0 && animal.eatPlant(plant)) {
    
//     this.basket.remove(plant);
//   }
// }

}