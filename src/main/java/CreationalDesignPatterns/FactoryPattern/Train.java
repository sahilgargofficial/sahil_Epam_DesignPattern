package CreationalDesignPatterns.FactoryPattern;

public class Train implements TransportCost {
    public int getCost(int kms) {
        return (kms*1);
    }
}
