package com.org.hackaton.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.org.hackaton.model.Customer;
import com.org.hackaton.model.Tranaction;

public class Load {

	
	public void lodingCSV(String path, String fileName) throws IOException{
		
		String split=",";
		ArrayList<Customer> customer=new ArrayList<Customer>();
		ArrayList<Tranaction> tranaction=new ArrayList<Tranaction>();
		File file = new File(path+"/"+fileName);
		Scanner sc = new Scanner(new FileReader(file));
		BufferedReader br = new BufferedReader(new FileReader(file));
		int r=0;
	     while(br.readLine() != null)
	     {	
	    	 
	         r++;
	     }
	     //System.out.println("Rows:"+r);
		StringBuilder sb=new StringBuilder();
		String line;
		
		int i=0;
		while(sc.hasNext()){
			String lineSplit[];
			if(i==0){
			line=sc.nextLine();
			lineSplit=line.split(split);
			}else{
				line=sc.nextLine();
				lineSplit=line.split(split);
			sb.append(line);
			sb.append("\n");
			}
			for(int a=0;a<lineSplit.length;a++){
			customer.add(lineSplit[a]);
			}
			i++;
		}
		System.out.println(sb);
		for(int j=0;j<r;j++){
		//System.out.println(sb[j]);
	
	}
	}
	
	
	
}
