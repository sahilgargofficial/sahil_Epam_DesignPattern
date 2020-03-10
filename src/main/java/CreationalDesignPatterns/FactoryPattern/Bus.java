package CreationalDesignPatterns.FactoryPattern;

public class Bus implements TransportCost {

    public int getCost(int kms) {
        return (kms*2);
    }
}
