public class Liquor implements Visitable {

    private double price;

    Liquor(double item) {
        price = item;
    }

    public double accept(Visitor visitor) {
        LiquorVisitor liquorVisitor = (LiquorVisitor) visitor;
        return liquorVisitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

}