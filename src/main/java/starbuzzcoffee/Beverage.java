package starbuzzcoffee;

public abstract class Beverage {
    protected Sizes size = Sizes.TALL;
    protected String description;

  public String getDescription(){
      return description;
  }
    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size){
      this.size = size;
    }

    public abstract double cost();

}
