package regexprograms;

import java.util.StringTokenizer;

public class RegExStringTokenizer {

	public static void main(String[] args) 

	{

		StringTokenizer st = new StringTokenizer ("All the Best");	
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}


		StringTokenizer ot = new StringTokenizer ("12-21-2022","-");

		while(ot.hasMoreTokens())
		{
			System.out.println(ot.nextToken());
		}

	}

}
