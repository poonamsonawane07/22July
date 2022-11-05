package javabasic2;

public class stringopration 
{
	public static void main(String [] args)
	{
		
		String s="hello i love java";
		System.out.println(s.length());
//convert to UpperCase
		System.out.println(s.toUpperCase());
//convert to LowerCase
		System.out.println(s.toLowerCase());
//it willgive the character at specificindex possion
		System.out.println(s.charAt(5));
//concat string
		String l="hello";
		String j="java";
		System.out.println(l+""+j);
		System.out.println(l+" "+j);
		System.out.println(j.concat(" "+l));
		
		
		String lp="Hello I love \"java\"";
		
		// Hello I love "java"
		
		System.out.println(lp);
		String kl="hello i love \\backslash character";
		System.out.println(kl);
		String jk="hello i love @ character";
		System.out.println(jk);
		
	//Equals
		/*String o="Hello demo java";
		String p="Hello demo java";

		System.out.println(o.equals(p));
		System.out.println(o.equalsIgnoreCase(p));
		System.out.println(o.contentEquals(p));*/
		
		
		  String actualString = "Anil Sonawane"; 
		  String identicalString =
		  "Anil Sonawane";
		 
		
		System.out.println(actualString.equals(identicalString));
		System.out.println(actualString.contentEquals(identicalString));
		
		
		StringBuffer identicalStringBufferInstance = new StringBuffer("Anil Sonawane");

		System.out.println(actualString.equals(identicalStringBufferInstance));
		System.out.println(actualString.contentEquals(identicalStringBufferInstance));
	//replace	
String k="poonam";
System.out.println(k.replace('n','o'));
	//replace  all
String m="atharv";
System.out.println(m.replaceAll("atharv","aarya"));
//Trim
String n=" hello ";
System.out.println(n.trim());
//substring




	}
	
	
	

}
