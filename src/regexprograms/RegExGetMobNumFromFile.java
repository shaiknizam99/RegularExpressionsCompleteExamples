package regexprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExGetMobNumFromFile {

	public static void main(String[] args) throws Exception 
	{
		//Pattern p = Pattern.compile("[0-9a-zA-Z][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");//email pattern matcher
		Pattern p = Pattern.compile("[0|91][7-9][0-9]{9}"); // Phone number format matcher
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\NizamShaik\\OneDrive - ValueMomentum, Inc\\Desktop\\RegexDemo.txt"));
		PrintWriter pw = new PrintWriter("C:\\Users\\NizamShaik\\OneDrive - ValueMomentum, Inc\\Output.txt");
		String line = br.readLine();
		while(line!=null)
		{
			Matcher m = p.matcher(line);
			while(m.find()) 
			{
				System.out.println(m.group());
				pw.println(m.group());
				
			}

			line = br.readLine();
		}
		pw.flush();	
		pw.close();
		br.close();

	}

}
