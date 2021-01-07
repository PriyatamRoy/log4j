package org.demo.logger.loggerdemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	final static Logger logger = Logger.getLogger(App.class);
	
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        logger.info("logger message");
        
        Properties prop = new Properties();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
		InputStream input = loader.getResourceAsStream("config.properties");
		prop.load(input);
		
		System.out.println(prop.getProperty("MAX_ROWS"));
		logger.info(prop.getProperty("MAX_ROWS"));
    }
}
