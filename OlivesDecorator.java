public class OlivesDecorator extends ToppingDecorator {

    public OlivesDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return super.getDescription()+"olives";
    }
    @Override
    public double getCost() {
        return super.getCost() +1;
    }
}