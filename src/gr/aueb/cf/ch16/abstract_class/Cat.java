package gr.aueb.cf.ch16.abstract_class;

public class Cat extends Animal {

    public Cat() {
        super();
    }

    @Override
    public String toString() {
        return getName() + ", " + getId();
    }

    @Override
    public void speak() {
        System.out.println("niaou");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("... ate all the food");
    }
}