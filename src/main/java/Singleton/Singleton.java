package Singleton;

public enum Singleton {
    UNIQUE_INSTANCE;
    private boolean empty;
    private boolean boiled;

    public void start(){
        empty = true;
        boiled = false;
    }

    public void fill(){
        if (isEmpty() ){
            empty=false;
            boiled =false;
        }
    }

    public void drain(){
        if (!isEmpty() && isBoiled()){
            empty=true;
        }
    }

    public void boil(){
        if (!isEmpty() && isBoiled()){
            boiled=true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
