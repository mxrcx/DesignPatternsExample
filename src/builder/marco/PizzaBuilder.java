package builder.marco;

public interface PizzaBuilder {
    void addSauce();
    void addToppings();
    void addCheeseCrust();
    Pizza getPizza();
}
