package CreationalDesignPatterns.FactoryPattern;

public class TransportFactory {
    public TransportCost getTransport(String transport)
    {
        if(transport==null)
        {
            return null;
        }
        else if(transport.equalsIgnoreCase("Taxi"))
        {
            return new Taxi();
        }
        else if(transport.equalsIgnoreCase("Bus"))
        {
            return new Bus();
        }
        else
        {
            return new Train();
        }
    }
}
