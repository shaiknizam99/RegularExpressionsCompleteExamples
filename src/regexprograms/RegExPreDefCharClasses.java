package regexprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPreDefCharClasses {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\s");
		/*Pattern p = Pattern.compile("\\S");
		Pattern p = Pattern.compile("\\d");
		Pattern p = Pattern.compile("\\D");
		Pattern p = Pattern.compile("\\w");
		Pattern p = Pattern.compile("\\W");
		Pattern p = Pattern.compile(".");*/
		Matcher m= p.matcher("a7b Z#9");
		
		while(m.find())
		{
			System.out.println(m.start()+"----" + m.group());
			
		}

	}

}
