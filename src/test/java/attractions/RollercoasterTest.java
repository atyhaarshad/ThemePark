package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(18, 140, 1.50);
        visitor2 = new Visitor(13, 205, 2.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void visitorAllowedOnRollercoaster(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void canChargeTallVisitorsDouble(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor2), 0);

    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0);
    }
}
