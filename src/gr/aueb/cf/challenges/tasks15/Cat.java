package gr.aueb.cf.challenges.tasks15;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Cat [Name: " + this.name + "]" + ", [Age: " + this.age + "]";
    }

    @Override
    public void speak() {
        System.out.println("I am a cat");
    }
}
