package regexprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExQantifiers {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a");
		/*Pattern p = Pattern.compile("a+");
		Pattern p = Pattern.compile("a*");
		Pattern p = Pattern.compile("a?");*/
		Matcher m= p.matcher("abaabaaab");
		
		while(m.find())
		{
			System.out.println(m.start()+"----" + m.group());
			
		}

	}

}
