package com.Utility;

import java.io.FileInputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {
	
			
			public static void info(String message)
			{
				Logger log=Logger.getLogger("Log");
				PropertyConfigurator.configure("Log4j.properties");
				log.info(message);
				
            }
			
			//Log logfiles;
			//logfiles= new Log();
			
}
