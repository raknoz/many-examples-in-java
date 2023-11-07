package design.classes.inheritance;

import design.classes.common.Animal;

public class Dog extends Animal {
  public void bark() {
    System.out.println("BARK!!!");
  }

  public void eat() {
    System.out.println("Dog Food");
  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.eat();
    dog.bark();
  }
}


