package assignment_Question4;

import java.util.ArrayList;
import java.util.List;

//Write 2 methods with List and set as a return type, call that method in other class and print that values

public class ListExample {
			
	public List<String> TestList(){
		
			List<String> tst = new ArrayList<>();
		tst.add("Bhanu");
		tst.add("Madhu");
		tst.add("Arun");
		tst.add("Sneha");
		tst.add("Ankit");
		tst.add("Harish");
		tst.add("Sahil");
		tst.add("Sangeetha");	    
			return tst;
	    						
			}
	public ArrayList<String> TestList2(){
		
	ArrayList<String> names = new ArrayList<String>();
	names.add("Bhanu");
	names.add("Santosh");
	names.add("Priya");
	names.add("Sunny");
	names.add("Hunny");
		return names;
				
	} 

}