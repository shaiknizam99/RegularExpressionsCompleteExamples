package regexprograms;

import java.util.regex.Pattern;

public class RegExSplitOperation {

	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("[.]");
		/*Pattern p = Pattern.compile("//.");
		Pattern p = Pattern.compile("w");*/
		String[] str = p.split("www.hazewell.com");
		
		for(String s1 : str)
		{
			System.out.println(s1);
		}

	}

}
