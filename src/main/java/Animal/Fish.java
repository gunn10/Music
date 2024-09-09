package Animal;

public class Fish implements Animal,Moveable{
    Moveable moveable;

    Fish(Moveable moveable) {
        this.moveable = moveable;
    }

    public String move() {
      return  moveable.move();
    }

    public void sleep() {
        System.out.println("Fish can sleep");
    }

    public void eats() {
        System.out.println("Fish can eat");
    }
}
