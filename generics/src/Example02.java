public class Example02 {
    public static void main(String[] args) throws Exception {

		// Only object that extends Animal are allowed
		// AnimalSoundPrinter<Integer> p1 = new AnimalSoundPrinter<>(10);

		AnimalSoundPrinter<Cat> p2 = new AnimalSoundPrinter<>(new Cat());
		p2.makeSound();
		
		AnimalSoundPrinter<Dog> p3 = new AnimalSoundPrinter<>(new Dog());
		p3.makeSound();

    }
}

class AnimalSoundPrinter<T extends Animal> {
	
	T object;

	public AnimalSoundPrinter(T thingToPrint) {
		this.object = thingToPrint;
	}

	public void makeSound() {
		System.out.println(object.makeSound());
	}
}

abstract class Animal {
	public abstract String makeSound();
}

class Cat extends Animal {

	@Override
    public String makeSound() {
        return "Meow";
    }

}

class Dog extends Animal {
	
	@Override
    public String makeSound() {
        return "Woof";
    }
}