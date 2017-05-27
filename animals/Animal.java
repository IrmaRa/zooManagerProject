package animals;

public abstract class Animal {
  private String name;
  private int age;
  private String group;


public Animal(String name, int age, String group) {
  this.name = name;
  this.age = age;
  this.group = group;

}

public String getName() {
  return this.name;
}

public int getAge() {
  return this.age;
}

public String getGroup() {
  return this.group;
}


}

