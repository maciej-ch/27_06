
public class AnimalFactory {
	
	public Animal createAnimal( String type, String name ) {
		switch ( type.toLowerCase()) {
		case "dog":
			return new Dog(name);
		case "horse":
			return new Horse(name);
		case "cat":
			return new Cat(name);
		case "lion":
			return new Lion(name);
		case "duck":
			return new Duck(name);
		}
		return null;}}


