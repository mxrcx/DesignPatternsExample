package builder.marco;

public class NormalPizzaBuilder implements PizzaBuilder{
    private Pizza pizza;

    public NormalPizzaBuilder(){
        this.pizza = new Pizza();
    }

    @Override
    public void addSauce() {
        pizza.setSauce("Tomato-Sauce");
    }

    @Override
    public void addToppings() {
        pizza.setToppings("Mozzarella");
    }

    @Override
    public void addCheeseCrust() {
        pizza.setCheeseCrust(false);
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
    
}
