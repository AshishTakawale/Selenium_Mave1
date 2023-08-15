package Selenium1;
import java.util.ArrayList;

public class javabasics {

	public static void main(String[] args) {
		
		int[] array= {1,2,3,4,5,6,7,8,102};
		
	for(int i=0; i<array.length; i++)
		{
		if (array[i] % 2 ==0)
			{
			System.out.println(array[i]);
			}

	
			else 
			{
		     System.out.println(array[i] + " Is not multiple of 2");
			
			}
		ArrayList<String> a = new ArrayList<String>();
		a.add("Ashish");
		a.add("Rahul");
		a.add("Kaushik");
		a.add("Jitendra");
		System.out.println(a.get(3));
		
		
		
		
	
			
		}
		
		

	}

}
