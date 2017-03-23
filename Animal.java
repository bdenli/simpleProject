package simplePackage;

public abstract class Animal {

	String _name; 
	String _species;
	String _sound;

	public void setName(String name){

		this._name = name;
	}

	public String getName(){

		if (this._name == null){
			return this._name = "[Unknown]";
		}
		else
			return this._name;
	}

	public void setSpecies(String species){

		this._species = species;
	}

	public String getSpecies(){

		if (this._species == null){
			return this._species = "[Unknown]";
		}
		else
			return this._species;
	}

	public void sleep(){

		System.out.println("ZZZzzZZZ");
	}

	public void eat(){

		System.out.println("Yum yum yum!");
	}

	public void makeSound(){

		System.out.println(this._sound);
	}
}
