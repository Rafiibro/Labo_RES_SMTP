import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
    public String ServerAddress;
    public String ServerPort;
    public String numberOfGroups;
    public String witnessesToCC;

    public Configuration() {
        Properties prop = new Properties();
        InputStream input = null;

        try {

            input = new FileInputStream("./config/config.properties");

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            ServerAddress = prop.getProperty("smtpServerAddress");
            ServerPort = prop.getProperty("smtpServerPort");
            numberOfGroups = prop.getProperty("numberOfGroups");
            witnessesToCC = prop.getProperty("witnessesToCC");

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        Properties prop = new Properties();
        InputStream input = null;

        try {

            input = new FileInputStream("./config/config.properties");

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.println(prop.getProperty("smtpServerAddress"));
            System.out.println(prop.getProperty("smtpServerPort"));
            System.out.println(prop.getProperty("numberOfGroups"));
            System.out.println(prop.getProperty("witnessesToCC"));

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}