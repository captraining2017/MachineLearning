package com.org.hackaton.service;

import java.io.File;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import com.org.hackaton.view.Load;

import sun.reflect.generics.tree.Tree;

public class Service {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// D:/Wolverin/inbox
		
		Load load=new Load();
		Scanner scan=new Scanner(System.in);
		System.out.println("Select which Dataset to be load.....");
		
		File folder = new File(args[0]);
		File[] listOfFiles = folder.listFiles();
		
		
		TreeMap<Integer, String> fileName=new TreeMap<Integer, String>();
		
			
		    for (int i=0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
		        //System.out.println("File: "+i+" " + listOfFiles[i].getName());
		        fileName.put(i,listOfFiles[i].getName());
		        
		      } else if (listOfFiles[i].isDirectory()) {
		        //System.out.println("Directory " + listOfFiles[i].getName());
		      }
		    }
		    for(Entry<Integer, String> Name: fileName.entrySet()){
		    	System.out.println(Name.getKey()+" : "+Name.getValue());
		    }
		    int option=scan.nextInt();
		    if(option<listOfFiles.length){
		    //System.out.println(option);
		    	System.out.println(fileName.get(option).toString());
		    	
		    	load.lodingCSV(args[0],fileName.get(option).toString());
		    	
		    }
		    else{
		    	System.out.println("enter correct value");
		    }
		
		
		
		

	}

}
