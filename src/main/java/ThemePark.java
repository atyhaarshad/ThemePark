import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<Stall> stalls;
    private ArrayList<Attraction> attractions;

    public ThemePark(String name) {
        this.name = name;
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
    }

    // add attraction, add stall /

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public void addStall(Stall stall) {
        this.stalls.add(stall);
    }

    public ArrayList <IReviewed> getAllReviewed(){
        ArrayList<IReviewed> allReviewed = new ArrayList<IReviewed>();
            allReviewed.addAll(this.attractions);
            allReviewed.addAll(this.stalls);


            return allReviewed;
        }

    public int getAttractionCount() {
        return this.attractions.size();
    }

    public int getStallCount(){
        return this.stalls.size();

    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.incrementVisitCountBy1();
        visitor.addAttractionToVisited(attraction);

    }
}

