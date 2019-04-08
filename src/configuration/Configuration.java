package configuration;

import model.mail.Personne;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class Configuration implements IConfiguration {
    private String ServerAddress;
    private int ServerPort;
    private String numberOfGroups;
    private List<Personne> victimesCC;
    private final List<Personne> victimes;
    private final List<String> messages;


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
            victimesCC = prop.getProperty("witnessesToCC");

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