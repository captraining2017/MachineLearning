package dataset;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;

public class CsvHeader {
	
	public static void main(String a[]) throws IOException {
		
		File file = new File("C:/Users/1537129/Desktop/xml/csv/inp/SCB123BIS_Aggregate_Fixed_Holding_(Profile)-12-19-2016.csv");
		FileWriter writer1 = new FileWriter("C:/Users/1537129/Desktop/xml/csv/inp/SCB123BIS_Aggregate_Fixed_Holding_(Profile)-12-19-2016_01.csv");
		PrintWriter pw1 = new PrintWriter(writer1);
		FileWriter writer2 = new FileWriter("C:/Users/1537129/Desktop/xml/csv/inp/SCB123BIS_Aggregate_Fixed_Holding_(Profile)-12-19-2016_02.csv");
		PrintWriter pw2 = new PrintWriter(writer2);
		
		 BufferedReader br = new BufferedReader(new FileReader(file));
		 Scanner sc = new Scanner(file);
		 StringBuilder sb1 = new StringBuilder("");
	     StringBuilder sb2 = new StringBuilder("");
	   
	     int r=0;
	     while(br.readLine() != null)
	     {	
	    	 
	         r++;
	     }
	     System.out.println("Rows:"+r);
		 
	     String input1[]=new String [r];
	     
	     String in;
		int i=0;
		
		while(sc.hasNext())
		{
	 		
			String inp[];
		   
			if(i!=0){
				in=sc.nextLine();
				
				inp=in.split(",");
			
				 if(((input1[0].startsWith(inp[0])) && (inp[4].isEmpty()&& inp[5].isEmpty()))){
					 
					 
					 	
					
		    		  
		    		  
				 }
				 else if(((input1[0].startsWith(inp[0])) && !(inp[4].isEmpty()&& inp[5].isEmpty()))) 
				 {
					 sb2.append(in);
					 sb2.append("\n");
					 
					 
				 } else if(sb2.toString().equals("")){
					 
					 
					 sb1.append(in);
		    			sb1.append("\n");
				 }
				 else{
					 
					 sb2.append(in);
					 sb2.append("\n");
				 }
					 
					 
					
				
				
			}
 		       else{
 		    	  in=sc.nextLine();
 		    	   
 		    	  	input1[i]=in;
 	    			sb1.append(in); 
 	    			sb1.append("\n");
 		    	   
 		       }
			  
	 		      i++;
		}
		
		 
		pw1.write(sb1.toString());
		pw1.close();
		
		pw2.write(sb2.toString());
		pw2.close();
		
		
	  }
		
	}
	


