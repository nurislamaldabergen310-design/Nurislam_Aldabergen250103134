public abstract class ToppingDecorator implements Pizza {
    protected final Pizza pizza;

    protected ToppingDecorator(Pizza pizza){
        if(pizza == null) throw new IllegalArgumentException("Error");
        else this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}