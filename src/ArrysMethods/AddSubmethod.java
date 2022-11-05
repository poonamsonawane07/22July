package ArrysMethods;

public class AddSubmethod 
{
	public void Addition()
	{
		int a=20;
		int b=30;
		System.out.println("Addition is:" +(a+b));
	}
	public void Subtraction()
	{
		int c=50;
		int d=70;
		System.out.println("Subtraction is:" +(c-d));

	}

public static void main(String [] args)
{
AddSubmethod obj=new AddSubmethod();
obj. Addition();
obj.Subtraction();
}
}

