package Animal;

public class Dog implements Animal, Moveable {
    Moveable moveable;

    Dog(Moveable moveable) {
        this.moveable = moveable;
    }

    public String move() {

     return  moveable.move();
    }

    public void sleep() {
        System.out.println("Dog can sleep");
    }

    public void eats() {
        System.out.println("Dog can eat");
    }
}
