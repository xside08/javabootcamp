package main.java.com.goog;

public class Dog extends Animal {
    int legs;
    String name;
  public Dog(int id, int legs) {
      super(id);
      this.legs = legs;
  }

  public Dog(int id, int legs, String name) {
      this(id,legs);
      this.name = name;

  }
}
