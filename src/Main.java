//superclass
class Animal {
//    method
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

//subsclass
class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow"); //
    }
}


public class Main {
    public static void main(String[] args) {
        Dog object = new Dog();
        object.animalSound();
    }
}