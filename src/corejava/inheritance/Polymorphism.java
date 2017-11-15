package corejava.inheritance;

interface Sound {
    void getSound();
}

/**
 * Created by Gowtham on 03-11-2017.
 */
// Ad-hoc (method overriding), Parametric (generics) and Sub-typing (inheritance) polymorphisms.
public class Polymorphism {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.getName();
        dog.getName();
        cat.getName();

        Object[] array = {animal, cat, dog};

        for (Object object : array) {
            if (object instanceof Animal) {
                ((Animal) object).getName();
            }

            if (object instanceof Sound) {
                ((Sound) object).getSound();
            }
        }
    }
}


// All top-level, non-public classes (types) are package-private.
// They can't be private or protected.
class Animal {

    String name = "Animal";

    void getName() {

        System.out.println(name);
    }

    void get() {
        System.out.println("gowtham");
    }
}

class Cat extends Animal {

    String name = "Cat";

    // super can be used to access a super class's hidden field.
    // super can be used to invoke a super class's overridden method.
    // private fields & methods are not accessible this way.
    // call to super need not be the first statement in a method.
    void getName() {
        super.getName();
        System.out.println(super.name);
        System.out.println(name);
        super.get();
    }
}

class Dog extends Animal implements Sound {

    void getName() {
        String name = "Dog";
        System.out.println(name);
    }

    @Override
    public void getSound() {
        String sound = "Bark";
        System.out.println(sound);
    }
}