import beveragesinstance.DarkRoast;
import beveragesinstance.Espresso;
import beveragesinstance.HouseBlend;
import condiments.Mocha;
import condiments.Soy;
import condiments.Whip;
import starbuzzcoffee.Beverage;
import starbuzzcoffee.Sizes;

public class Main {

    public static void main(String[] args) {
        System.out.println("*******************WELCOME TO THE DECORATOR PATTERN*******************************");

        Beverage beverage = new Espresso();
        beverage.setSize(Sizes.TALL);
        System.out.println(beverage.getDescription()+ " Size:" +beverage.getSize() + " $" +beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1.setSize(Sizes.GRANDE);
        beverage1= new Mocha(beverage1);
        beverage1= new Mocha(beverage1);
        beverage1= new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " Size:" +beverage1.getSize() +" $" + beverage1.cost());

        Beverage beverage2= new HouseBlend();
        beverage2.setSize(Sizes.VENTI);//.20
        beverage2 = new Soy(beverage2);//.20
        beverage2= new Mocha(beverage2);//.20
        beverage2= new Whip(beverage2);//.20
        System.out.println(beverage2.getDescription() + " Size:" +beverage2.getSize() + " $"  + beverage2.cost());

    }
}
