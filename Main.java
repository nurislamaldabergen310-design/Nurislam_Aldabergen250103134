public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new OlivesDecorator(pizza);
        pizza = new PineappleDecorator(pizza);

        System.out.println("Pizza;"+pizza.getDescription());
        System.out.print("Total cost;"+pizza.getCost());

        Pizza dCheese = new CheeseDecorator(new CheeseDecorator(new PlainPizza()));
        System.out.println("Pizza;"+dCheese.getDescription());
        System.out.print("Total cost;"+ dCheese.getCost());
    }
}