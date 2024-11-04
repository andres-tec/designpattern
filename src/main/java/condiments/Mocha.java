package condiments;

import starbuzzcoffee.Beverage;
import starbuzzcoffee.CondimentDecorator;
import starbuzzcoffee.Sizes;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage){
        this.beverage= beverage;

    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
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
