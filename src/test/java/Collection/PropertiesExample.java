package Collection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String [] args) throws IOException {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("Configuration.properties");
        p.load(fis);
        System.out.println(p);
       String s= p.getProperty("venki");
       System.out.println(s);


    }
}
