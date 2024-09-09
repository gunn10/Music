package Animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Animal animal;
    Moveable moveable;
    @BeforeEach
    void setup(){
        moveable=new Walk();
        animal=new Dog(moveable);

    }
    @Test
    void testanimalformove(){
        assertEquals("Animal walks",animal.move());
    }
    @Test
    void testanimalforswim(){
        assertEquals("Animal swims",animal.move());
    }
}