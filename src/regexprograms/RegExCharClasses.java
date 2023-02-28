package regexprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExCharClasses {

	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("[^A-Z]");
		Matcher m= p.matcher("a7b@Z#9");
		
		while(m.find())
		{
			System.out.println(m.start()+"----" + m.group());
			
		}

	}

}
