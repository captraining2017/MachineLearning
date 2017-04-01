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

public class Csc_Header_Split {
	
	public static void main(String a[]) throws IOException {
		
		File file = new File("C:/Users/1537129/Desktop/xml/csv/inp/SCB123BIS_Aggregate_Fixed_Holding_(Profile)-12-19-2016.csv");
		FileWriter writer1 = new FileWriter("C:/Users/1537129/Desktop/xml/csv/inp/SCB123BIS_Aggregate_Fixed_Holding_(Profile)-12-19-2016_1.csv");
		PrintWriter pw1 = new PrintWriter(writer1);
		FileWriter writer2 = new FileWriter("C:/Users/1537129/Desktop/xml/csv/inp/SCB123BIS_Aggregate_Fixed_Holding_(Profile)-12-19-2016_2.csv");
		PrintWriter pw2 = new PrintWriter(writer2);
		// FileReader inputFile = new FileReader("C:/Users/1537129/Desktop/xml/csv/inp/SCB123BIS_Aggregate_Fixed_Holding_(Profile)-12-19-2016.csv");
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
	     String input2[]=new String [r];
	     String in;
		// String inp[];
	    /* while(sc.hasNext())
			{
	    	 
	    	 inp=sc.nextLine().split(",");
	    	 
	    	 System.out.println(inp[0]);
	    	 
			}*/
	     
	     //from here to...
	    
		 
		
	    if(sb2.toString().equals("")){
	    	 System.out.println("StringBuilder2wdfd "+sb2);
	     }
	     
		//for(int i = 0; (sc.hasNext())!=false; i++)
		int i=0;
		while(sc.hasNext())
		{
	 		/*       if(i==0){
					in=sc.nextLine();
	    			 input1[i]=in;
	    			sb1.append(in); 
	 		       }
	 		       else{
	 		    	   
	 		    	   if((in=sc.nextLine())==input1[0]){
	 		    		   
	 		    		   sb2.append(in);
	 		    	   }
	 		    	   else{
	 		    		  in=sc.nextLine();
	 	    			 input1[i]=in;
	 	    			sb1.append(in); 
	 		    	   }
	 		       }
	    			// System.out.println(input[0]);
	 		   */
			String inp[];
		   
		    	 
		    	 //inp=sc.nextLine().split(",");
		    	 
			if(i!=0){
				in=sc.nextLine();
				
				inp=in.split(",");
				 if(input1[0].startsWith(inp[0])){
				System.out.println("input  starts: "+input1[0]);
		    		   sb2.append(in);
		    		   sb2.append("\n");
		    		   System.out.println(in);
		    		  
				 }
				 else if(sb2.toString().equals("")){
					 
					// in=sc.nextLine();
	    			// input1[i]=in;
					 
					// System.out.println("inp "+in);
	    			sb1.append(in);
	    			sb1.append("\n");
				 }
				 else{
					
					 
					// input1[i]=in;
					/* if(i==360){
						 
					 }*/
					// System.out.println(in);
					 sb2.append(in);
					 sb2.append("\n");
				 }
				
				
			}
 		       else{
 		    	  in=sc.nextLine();
 		    	   
 		    	 /* if(in.equals("EDR ACCOUNT,CLIENT NAME,EVAL. CURR.,MODEL,,,CURRENCY,PRODUCT,TYPE,,,,USD BALANCE,,,,,LOCAL BALANCE,INITIAL AMOUNT IN USD,GLOBUS,BASE BALANCE"))
					{
						System.out.println(in);
					}
 		    		 */
 	    			 input1[i]=in;
 	    			//System.out.println("input1[0]"+input1[0]);
 	    			sb1.append(in); 
 	    			sb1.append("\n");
 		    	   
 		       }
			
			
			
			
		
	 		      
	 		     
	 		      i++;
		}
		
		
	     
	     //here....
	     
	     
	     
	     
	     
		pw1.write(sb1.toString());
		pw1.close();
		
		pw2.write(sb2.toString());
		pw2.close();
	    		 
	    		//System.out.println(input1[0]);
	    	 
	       
	   
	}
		
	}
	


