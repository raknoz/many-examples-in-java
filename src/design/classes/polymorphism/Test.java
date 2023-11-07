package design.classes.polymorphism;

import design.classes.common.Animal;

public class Test {
  public static void main(String args[]) {
    Animal a = new Dog();
    a.eat();
    a = new Cat();
    a.eat();
  }
}
