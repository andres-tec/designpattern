package beveragesinstance;

import starbuzzcoffee.Beverage;
import starbuzzcoffee.Sizes;

public class Espresso extends Beverage {


    public Espresso() {
        description= "Espresso";
    }

    @Override
    public double cost() {
        switch (getSize()){
            case Sizes.TALL:
                return .10;
            case Sizes.GRANDE:
                return .15;
            case Sizes.VENTI:
                return .20;
            default:
                System.out.println("not in options");
                return 0;
        }
    }
}
