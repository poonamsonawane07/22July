package ProgrammingPractise;

public class CountOfWords {
	public static void main(String[] args)
	{
		String s="hello i love java";
		String[] words=s.split(" ");
		
				System.out.println(words.length);
	
				for(String p:words)
				{
					System.out.println(p+"'s lenght is="+p.length());
				}
				
}
	}


