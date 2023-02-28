package regexprograms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExValidMobileNumber {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Mobile Number");
		String mobnum = sc.next();
		Pattern p = Pattern.compile("(0|91)?[789][0-9]{9}");
		Matcher m = p.matcher(mobnum);
		if (m.find() && m.group().equals(mobnum))
		{
			System.out.println("The Mobile number is Valid");
		}
		
		else
		{
			System.out.println("The Mobile Number is Invalid");
		}

	}

}
