
import java.util.logging.Logger;
import java.util.logging.Level; 
public class HelloWorld {
	 public static void main(String[] args) {
	    
		 Logger LOGGER = Logger.getLogger(HelloWorld.class.getName());
		 LOGGER.log(Level.INFO, "HELLO WORLD!");

	}

}

