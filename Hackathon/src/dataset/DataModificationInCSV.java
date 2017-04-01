package dataset;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DataModificationInCSV {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String splitBy = ",";
		File file = new File("D:\\Users\\ssakthiv\\Desktop\\details\\Master customer.csv");
		FileWriter writer1 = new FileWriter("D:\\Users\\ssakthiv\\Desktop\\details\\Mascustomer.csv");
		PrintWriter pw1 = new PrintWriter(writer1);
		
        BufferedReader br = new BufferedReader(new FileReader("D:\\Users\\ssakthiv\\Desktop\\details\\Master customer.csv"));
        String line = br.readLine();
        Scanner sc = new Scanner(file);
       /* while(line!=null){
             String[] b = line.split(splitBy);
             System.out.println(b);
        }
        br.close();*/
        String in;
        while(sc.hasNext()){
        	String inp[];
        	in=sc.nextLine();
        	inp=in.split(",");
        	inp[2]=inp[2]+"0";
        	
        }
	}

}
