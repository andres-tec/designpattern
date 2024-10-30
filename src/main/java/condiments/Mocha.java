package condiments;

import starbuzzcoffee.Beverage;
import starbuzzcoffee.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage){
        this.beverage= beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + .20;
    }

}
