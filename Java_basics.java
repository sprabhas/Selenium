package Browserautomation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Java_basics {

	public static void main(String[] args) {	
		int number = 7;
		double decimal_numer = 5.5;
		String sentence = "Hava a good day";
		char d = 'r';
		
		System.out.println(sentence + ", Muthu prabha");
		//Array
		int[] arr = new int[9];
		int count = 0;
		for(int i = 0;i< arr.length ; i++) {
			arr[i] = i;		
			if(arr[i] % 2 == 0) {
				count += 1;				
			}
		}
		
		System.out.println(count);		
		String[] name = {"muthu" , "prabha" , "s"};		
		List<String> convert_name_as_arrlist =  Arrays.asList(name);
			
		for(String n :name) {
			System.out.println(n);
		}
		
		double[] numbers = {6.7,9.6,7,8,2};
	    int count1 = numbers.length;
	    
	    System.out.println(count1);
	    //print the first element
		for(int i = 0;i < count1 ; i ++) {
			System.out.println(numbers[i]);
			break;
		}
	    //print the last element
	    /*for(int i = count1-1 ;i >= 0 ; i --) {
	    	System.out.println(numbers[i]);
	    	break;
	    }*/		
		ArrayList<String> al = new ArrayList<String>();
		al.add("c");
		al.add("d");
		al.add("e");
		al.add("f");
		al.add("g");
		System.out.println(al.get(2));
		
	for(int k = 0; k < al.size() ; k ++) {		
		System.out.println(al.get(k));
	}
	for (String g  :al) {
		System.out.println(g + "*");
		
	}	
	//Strings
	//in java string is an object which represents a sequence of characters
	
	String str = "Selenium";
	String str_new = new String("Learning selenium");
	
	String[] splitted_string = str_new.split(" ");
	for (String f : splitted_string) {
		System.out.println(f);
	}
	
	for(int i = str_new.length()-1 ; i > 0 ; i--) {
		System.out.println(str_new.charAt(i));
	}
	
		
	}
}
