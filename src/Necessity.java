public class Necessity implements Visitable {

    private double price;

    Necessity(double item) {
        price = item;
    }

    public double accept(Visitor visitor) {
        NecessityVisitor necessityVisitor = (NecessityVisitor) visitor;
        return necessityVisitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

}