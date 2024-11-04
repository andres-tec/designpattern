package condiments;

import starbuzzcoffee.Beverage;
import starbuzzcoffee.CondimentDecorator;
import starbuzzcoffee.Sizes;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    @Override
    public Sizes getSize() {
        return this.beverage.getSize();
    }

    @Override
    public double cost() {
        switch (getSize()){
            case Sizes.TALL:
                return this.beverage.cost() +.10;
            case Sizes.GRANDE:
                return this.beverage.cost() +.15;
            case Sizes.VENTI:
                return this.beverage.cost() +.20;
            default:
                System.out.println("not in options");
                return 0;
        }
    }
}
