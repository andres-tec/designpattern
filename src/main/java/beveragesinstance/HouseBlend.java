package beveragesinstance;

import starbuzzcoffee.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        description="House Blend Coffe";
    }

    @Override
    public double cost() {
        return .89;
    }
}
