package Java_Basic;

import java.util.ArrayList;

public class cOREjAVA {
	public static void main(String[] args) {
		ArrayList <String>name= new ArrayList<String>();
		name.add("Ashish");
		name.add("Rahl");
		name.add("Ashitosh");
		name.add("Jitendra");
		name.add("Bhaveshh");
		int count=0;
		for(int i=0;i<name.size();i++)
		{
			String actual=name.get(i);
			if(actual.contains("R"))
			{
				count++;
				
			}
			
		}
		System.out.println(count);
		
		
	}
	

}
