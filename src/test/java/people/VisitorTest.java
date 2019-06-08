package people;

import attractions.Attraction;
import attractions.Dodgems;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    Dodgems attraction1;
    RollerCoaster attraction2;

    @Before
    public void before(){
        visitor = new Visitor(14, 1.2, 40.0);
        attraction1 = new Dodgems("Dodgem", 8);
        attraction2 = new RollerCoaster("RollerCoaster", 9);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void hasVisitedAttractions(){
        visitor.addAttractionToVisited(attraction1);
        visitor.addAttractionToVisited(attraction2);
        assertEquals(2, visitor.noOfVisitedAttractions());
    }
}
