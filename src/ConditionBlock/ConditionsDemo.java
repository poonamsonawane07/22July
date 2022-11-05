package ConditionBlock;

public class ConditionsDemo {

	public static void main(String [] args)
	{
		int studentMarks=60;
		
		if(studentMarks>=90)
		{
			System.out.println("Distinction");
		}
		else if(studentMarks<90&&studentMarks>=65)
		{
			System.out.println("grade1");
		}
		else if(studentMarks<65&&studentMarks>=40)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
			
}
	

