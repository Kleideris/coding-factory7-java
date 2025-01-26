package gr.aueb.cf.challenges.tasks15;

public class Main {

    public static void main(String[] args) {
        Animal gorilla = new Animal("Harambe", 17);

        Animal dog = new Dog("Fang", 8);
        Animal cat = new Cat("yoruichi", 21);


        System.out.println("Gorilla: " + gorilla.getName());
        System.out.println("Dog: " + dog.getName());
        dog.setName("Silver");
        System.out.println("Dog: " + dog.getName());

        System.out.println(cat.toString());

        doSpeak(gorilla);
        doSpeak(dog);
    }

    public static void doSpeak(Animal animal) {
        animal.speak();
    }
}