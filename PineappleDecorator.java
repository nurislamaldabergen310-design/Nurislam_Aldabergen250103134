public class PineappleDecorator extends ToppingDecorator {
    public PineappleDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "pnieapple";
    }
    @Override
    public double getCost() {
        return super.getCost()+1;
    }
}