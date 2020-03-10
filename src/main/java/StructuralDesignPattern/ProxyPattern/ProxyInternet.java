package StructuralDesignPattern.ProxyPattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private  static List<String> bannedsites;
    Internet internet = new RealInternet();
    static
    {
        bannedsites = new ArrayList<String>();
        bannedsites.add("abc.com");
        bannedsites.add("xyz.com");
        bannedsites.add("123.com");
    }
    public void connectTo(String serverhost) throws Exception {

            if(bannedsites.contains(serverhost.toLowerCase()))
            {
                throw new Exception("Access Denied");
            }


        internet.connectTo(serverhost);
    }
}
