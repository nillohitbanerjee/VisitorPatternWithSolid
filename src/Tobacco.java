public class Tobacco implements Visitable {

    private double price;

    Tobacco(double item) {
        price = item;
    }

    public double accept(Visitor visitor) {
        TobaccoVisitor necessityVisitor = (TobaccoVisitor) visitor;
        return necessityVisitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

}
