package gr.aueb.cf.challenges.tasks15;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Dog [Name: " + this.name + "]" + ", [Age: " + this.age + "]";
    }

    @Override
    public void speak() {
        System.out.println("I am a dog");
    }
}
