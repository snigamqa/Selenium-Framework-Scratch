package googlepage;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jdemo {
	
	private static Logger logger = LogManager.getLogger(log4jdemo.class);

	public static void main(String[] args) {
		
		
	System.out.println(" Hello World");
	
	logger.info("This is message");
	logger.error("This is message");
	logger.warn("This is message");
	logger.fatal("This is message");
	System.out.println(" Completed");
	
	}

}
