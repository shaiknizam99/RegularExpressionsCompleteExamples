package regexprograms;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExFilesCount {

	public static void main(String[] args) 
	{
		int count =0;
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9$_\\s]*[.]txt");
		File f = new File("C:\\Users\\NizamShaik\\OneDrive - ValueMomentum, Inc\\Desktop");
		String[] s = f.list();
		
		for(String name : s)
		{
			Matcher m= p.matcher(name);
			if(m.find() && m.group().equals(name))
			{
				count++;
				System.out.println(name);
			}
			
		}
		System.out.println("The number of files are --: " + count);
	}

}
