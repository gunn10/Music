package House;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CottageBuilderTest {

    private House cottage;

    @BeforeEach
    void setUp() {
        cottage = new CottageBuilder("Brick walls", "Large windows", "Wooden doors", "roof")
                .withSwimmingpool("I want swimming pool")
                .build();
    }

    @Test
    void testWithSwimmingpool() {
        assertEquals("I want swimming pool", cottage.swimmingpool);
    }

    @Test
    void testWithGarden() {
        assertNull(cottage.garden);
    }
}
