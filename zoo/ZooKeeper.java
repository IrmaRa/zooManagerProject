package zoo;
import java.util.ArrayList;
import animals.*;
import food.*;

public class ZooKeeper {

  private String name;
  private ArrayList<Edible> basket;

  public ZooKeeper(String name){
    this.name = name;
    this.basket = new ArrayList<Edible>();
  }

  public String getName(){
    return this.name;
  } 

  public int basketCount(){
  return this.basket.size();
  }

  public void getFood(Edible food){
   this.basket.add(food);
  } 

  public void feedAnimal(Animal animal, Edible food){
    String foodType = food.getType();
    String animalFoodType = animal.getAnimalFoodType();

    if (basketCount() > 0 && animalFoodType.equals(foodType)){ 
    animal.eat(food);
    this.basket.remove(food);
    }
  }


}