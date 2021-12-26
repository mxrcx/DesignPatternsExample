package builder.marco;

public class CheeseCrustPizzaBuilder implements PizzaBuilder{
    private Pizza pizza;

    public CheeseCrustPizzaBuilder(){
        this.pizza = new Pizza();
    }

    @Override
    public void addSauce() {
        pizza.setSauce("Cheese-Sauce");
    }

    @Override
    public void addToppings() {
        pizza.setToppings("Chicken, Bacon");
    }

    @Override
    public void addCheeseCrust() {
        pizza.setCheeseCrust(true);
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
    
}
