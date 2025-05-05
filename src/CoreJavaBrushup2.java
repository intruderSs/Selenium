import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr2 = {5,8,7,6,3,55,44,99,66,576,26653};
//		
//		for (int i : arr2) {
//			if (i%2 == 0) {
//				System.out.println(i+" is multiple of 2");
//				break;
//			} else {
//				System.out.println(i+" is not a multiple of 2");
//			}
//		
		
		int[] numbers = {1,2,3,4,5};
	    
	    System.out.println(numbers[0]);
	    System.out.println(numbers[4]);
	    
	    for (int i = numbers.length-1; i >= 0; i--) {
	    	System.out.println(i);
	    }
	    
	    System.out.println(numbers.length);
	    
	    ArrayList<String> arrayList = new ArrayList<String>();
	    arrayList.add("Shahil");
	    arrayList.add("Sinha");
	    arrayList.add("Shubham");
	    arrayList.add("Shashi");
	    arrayList.remove(1);
	    arrayList.add(1, "Avnish");
	    System.out.println(arrayList);
	    System.out.println(arrayList.get(2));
	    
	    for (int j = 0; j < arrayList.size(); j++) {
	    	System.out.println(arrayList.get(j));
	    }
	    System.out.println("*********************************");
	    for (String s: arrayList) {
	    	if (s.contains("Shashi")) {
	    		System.out.println(s);
	    	}
	    }
	    
	    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
	    String[] arr = {"Shahil", "Shubham", "Shashi", "Avnish"};
	    
	    java.util.List<String> arrayToArrayList = Arrays.asList(arr);
	    
	    for (String nameString : arrayToArrayList) {
	    	System.out.println(nameString);
	    }
	    
	    
	    
	    
	}

}
