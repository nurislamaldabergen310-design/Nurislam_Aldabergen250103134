public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "plain dough & sauce";
    }

    @Override
    public double getCost() {
        return 0.5;
    }
}
