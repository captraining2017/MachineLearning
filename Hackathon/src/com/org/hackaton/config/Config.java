package com.org.hackaton.config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.org.hackaton.model.Range;

public class Config {
	
	public void configProperties(String fileName){
		
		 Properties prop = new Properties();
	        try
	        {            
	            InputStream is = new FileInputStream(fileName);
	            // load the properties file
	            prop.load(is);
	            Range range=new Range();
	            range.setSalary(Float.parseFloat(prop.getProperty("salary")));
	            range.setCredit(Float.parseFloat(prop.getProperty("credit")));
	            range.setDebit(Float.parseFloat(prop.getProperty("debit")));
	            range.setDeposit(Float.parseFloat(prop.getProperty("deposit")));
	        
	        }
	        catch(Exception Ex){
	        	Ex.printStackTrace();
	        }
		
	}

}
