package CreationalDesignPatterns.FactoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryPatternDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter mode of transport to use Taxi,Bus or Train");
        String mode = br.readLine();
        System.out.println("Enter number of Kilometers to travel");
        int km = Integer.parseInt(br.readLine());
        TransportFactory transportFactory = new TransportFactory();
        TransportCost transportCost = transportFactory.getTransport(mode);
        int cost = transportCost.getCost(km);
        System.out.println("The Cost for journey is Rs "+cost);

    }
}
