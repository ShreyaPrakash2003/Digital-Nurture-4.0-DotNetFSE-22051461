// Animal Interface
interface Animal {
    void makeSound();
}

// Dog Class
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// Duck Class
class Duck implements Animal {
    public void makeSound() {
        System.out.println("Quack!");
    }
}

// Factory class
class AnimalFactory {
    public static Animal createAnimal(String animalType) {
        if (animalType.equalsIgnoreCase("dog")) {
            System.out.println("Dog Object created.");
            return new Dog();
        } else if (animalType.equalsIgnoreCase("duck")) {
            System.out.println("Duck Object created.");
            return new Duck();
        } else {
            // default case
            System.out.println("Invalid animal type.");
            return null;
        }
    }
}

// Main class
public class exercise2 {
    public static void main(String[] args) {
        // Requesting Dog Obj.
        System.out.println("Requesting Dog:");
        Animal a1 = AnimalFactory.createAnimal("dog");
        if (a1 != null) a1.makeSound();

        // Requesting Duck Obj.
        System.out.println("Requesting Duck:");  
        Animal a2 = AnimalFactory.createAnimal("duck");
        if (a2 != null) a2.makeSound();

        // Requesting Horse Obj.
        System.out.println("Requesting Horse:");  
        Animal a3 = AnimalFactory.createAnimal("horse");
        if (a3 != null) a3.makeSound(); // Safe Check as a3 will return null
    }
}
