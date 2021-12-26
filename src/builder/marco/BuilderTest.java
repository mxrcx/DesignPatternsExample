package builder.marco;

public class BuilderTest {
    public static void main(String[] args) {
        PizzaBuilder normaPizzaBuilder = new NormalPizzaBuilder();
        PizzaBaker alfredo = new PizzaBaker(normaPizzaBuilder);
        Pizza pizzaNormal = alfredo.makePizza();
        System.out.println("Pizza (normal): " + pizzaNormal);

        PizzaBuilder cheeseCrustPizzaBuilder = new CheeseCrustPizzaBuilder();
        PizzaBaker alonso = new PizzaBaker(cheeseCrustPizzaBuilder);
        Pizza pizzaCheeseCrust = alonso.makePizza();
        System.out.println("Pizza (cheese crust): " + pizzaCheeseCrust);
    }
}
