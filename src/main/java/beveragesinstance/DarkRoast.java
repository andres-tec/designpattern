package beveragesinstance;

import starbuzzcoffee.Beverage;
import starbuzzcoffee.Sizes;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "DarkRoast caffe";
    }

    @Override
    public double cost() {
        switch (this.getSize()){
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
