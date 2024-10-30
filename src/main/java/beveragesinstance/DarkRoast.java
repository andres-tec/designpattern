package beveragesinstance;

import starbuzzcoffee.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "DarkRoast caffe";
    }

    @Override
    public double cost() {
        return .99d;
    }
}
