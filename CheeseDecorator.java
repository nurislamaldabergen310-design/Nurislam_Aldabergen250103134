public class CheeseDecorator extends ToppingDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return super.getDescription()+"cheese";
    }
    @Override
    public double getCost() {
        return super.getCost()+2;
    }
}