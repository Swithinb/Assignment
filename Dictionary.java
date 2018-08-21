package Assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {

	public static void main(String[] args) {
		int linenumber=0;
		
		try {
			FileReader f=new FileReader("/home/vedams/tasks/english.txt");
			
			BufferedReader bf=new BufferedReader(f);
			
			Map<String,String> mp=new HashMap<String,String>();
			
			String line=null;
			
			while(bf.readLine()!=null) {
				 line=bf.readLine();
				 
				String str[]=line.split("  ");
			//	mp.put(str[0], str[1]);
				System.out.println(str[1]);
				
			}
			
		}

		catch(IOException e) {
			e.printStackTrace();
			
		}
	}

}
