package CreationalDesignPatterns.FactoryPattern;

public class Taxi implements TransportCost {
    public int getCost(int kms) {

        return (kms*10);
    }
}
