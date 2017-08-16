package utilitarios.bd;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuracao {
	
	public Configuracao(){
		
	}
	
	 public static Properties getProp() throws IOException {
	        Properties properties = new Properties();
	        FileInputStream fileStream = new FileInputStream("/js/src/main/java/utilitarios/prop.properties");
	        try {
	            properties.load(fileStream);
	            return properties;

	        } finally {
	            try {
	                fileStream.close();
	            } catch (IOException ex) {
	            	   throw new RuntimeException(ex);
	            }

	        }
	    }
	}


