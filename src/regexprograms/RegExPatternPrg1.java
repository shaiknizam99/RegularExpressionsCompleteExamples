package regexprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPatternPrg1 {

	public static void main(String[] args) 
	{
		int count =0;
		Pattern p = Pattern.compile("ab");
		Matcher m= p.matcher("abaabaaab");
		
		while(m.find())
		{
			System.out.println(m.start()+"----"+ m.end()+"----" + m.group());
			
		}
		System.out.println("the No Of Occurancesof ab are " + count );

	}

}
