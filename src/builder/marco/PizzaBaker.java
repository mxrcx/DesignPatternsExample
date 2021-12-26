package builder.marco;

public class PizzaBaker {
    private PizzaBuilder pizzaBuilder;

    public PizzaBaker(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza makePizza(){
        pizzaBuilder.addSauce();
        pizzaBuilder.addCheeseCrust();
        pizzaBuilder.addToppings();
        return pizzaBuilder.getPizza();
    }
}
