package services;

public class Repair extends Service {

    private boolean needsNewPieces;

    public Repair(String name, double price, boolean needsNewPieces) {
        super(name, price);
        this.needsNewPieces = needsNewPieces;
    }
}
