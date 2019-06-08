import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Attraction attraction1;
    Stall stall1;
    Visitor visitor1;

    @Before
    public void setUp(){
        themePark = new ThemePark("Alton Towers");
        themePark.addAttraction(attraction1);
        themePark.addStall(stall1);
        visitor1 = new Visitor(25, 160, 2.50);
        attraction1 = new Dodgems("Dodgy", 8);
    }

    @Test
    public void hasAttraction(){
        assertEquals(1, themePark.getAttractionCount());
    }

    @Test
    public void hasStall(){
        assertEquals(1, themePark.getStallCount());
    }

    @Test
    public void canGetReviewedList(){
        ArrayList<IReviewed> reviewed = themePark.getAllReviewed();
        assertEquals(2, reviewed.size());
    }

    @Test
    public void canVisit(){
        themePark.visit(visitor1, attraction1);
        assertEquals(1, visitor1.noOfVisitedAttractions());
        assertEquals(1, attraction1.getVisitCount());
    }
}
