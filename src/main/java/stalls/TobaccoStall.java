package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);

    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18){
            return true;
        } else {
            return false;
        }
    }

}
