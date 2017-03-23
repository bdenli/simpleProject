package simplePackage;

public class Dog extends Animal implements Walkable{

	public Dog() {

	}

	public Dog(String name) {
		this._name = name;
	}

	@Override
	public void walk() {
		System.out.println("It is walking!");
	}

	@Override
	public void run() {

		System.out.println("It is running!");
	}

	public void makeSound(){

		System.out.println(this._name + " says " + "Bark! Bark!");
	}

	public static void main(String[] args) {

		Dog dog1 = new Dog();

		dog1.setName("Olivia");
		System.out.println("Let me introduce you to " + dog1.getName() + ".");

		dog1.setSpecies("dog");
		System.out.println(dog1.getName() + " is a " + dog1.getSpecies() + ".");

		dog1.makeSound();

		//Polymorphism example
		Animal dog2 = dog1;
		System.out.println("Animal's name is " + dog2.getName() + ".");
		dog2.makeSound();

	}
}
