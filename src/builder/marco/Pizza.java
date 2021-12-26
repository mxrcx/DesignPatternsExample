package builder.marco;

public class Pizza {
    private String sauce;
    private String toppings;
    private boolean cheeseCrust;

    public void setSauce(String sauce){
        this.sauce = sauce;
    }

    public void setToppings(String toppings){
        this.toppings = toppings;
    }

    public void setCheeseCrust(boolean cheeseCrust){
        this.cheeseCrust = cheeseCrust;
    }

    @Override
    public String toString(){
        return "Sauce: " + sauce + "; Toppings: " + toppings + "; Cheese Crust: " + cheeseCrust;
    }
}
