package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, IReviewed, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() > 12 && visitor.getHeight() > 145){
            return true;
        } else {
            return false;
        }
    }


    @Override
    public Double defaultPrice() {
        return 8.40;
    }

    @Override
    public Double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200){
            return defaultPrice() * 2;
        } else {
            return defaultPrice();
        }
    }
}
