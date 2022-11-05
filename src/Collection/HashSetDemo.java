package Collection;

import java.util.HashSet;

public class HashSetDemo { 
	public static void main(String [] args)
	{
		HashSet<Integer> obj=new HashSet<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(40);
		System.out.println(obj);
		for(Integer k:obj)
		{
			System.out.println(k);
			
		}
		System.out.println(obj.size());
		System.out.println(obj.contains(40));
		obj.clear();
		
		
	}
	
}
