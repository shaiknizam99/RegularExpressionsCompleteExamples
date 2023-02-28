package regexprograms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExValidEmail {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter email ID");
		String email = sc.next();
		Pattern p = Pattern.compile("[a-zA-Z0-9_.]*@gmail.com");
		Matcher m = p.matcher(email);
		if (m.find() && m.group().equals(email))
		{
			System.out.println("The email is Valid");
		}
		
		else
		{
			System.out.println("The email is Invalid");
		}

	}

}