package StructuralDesignPattern.ProxyPattern;

public class ProxyInternetDemo {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("google.com");
            internet.connectTo("123.com");

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
