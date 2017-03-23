package simplePackage;

public abstract class Animal {

	String _name; 
	String _species;

	public void setName(String name){

		_name = name;
	}

	public String getName(){

		if (_name == null){
			return _name = "[Unknown]";
		}
		else
			return _name;
	}

	public void setSpecies(String species){

		_species = species;
	}

	public String getSpecies(){

		if (_species == null){
			return _species = "[Unknown]";
		}
		else
			return _species;
	}

	public void sleep(){

		System.out.println("ZZZzzZZZ");
	}

	public void eat(){

		System.out.println("Yum yum yum!");
	}

	public abstract void makeSound();
}
