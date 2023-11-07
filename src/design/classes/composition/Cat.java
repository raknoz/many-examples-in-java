package design.classes.composition;

import design.classes.common.Animal;

// Cat is an Animal, so Cat class extends Animal class.
class Cat extends Animal {
  // Cat has a Toy, so Cat has an instance of Toy as its member.
  private Toy toy;
}
