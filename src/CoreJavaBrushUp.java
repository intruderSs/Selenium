import io.opentelemetry.sdk.metrics.internal.state.ArrayBasedStack;

public class CoreJavaBrushUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 int myNum = 5;
	 String name = "Shahil Sinha";
	 char firstLetter = 'S';
	 double decimal = 7.7;
	 boolean bool = true;
	 
	 System.out.println(myNum+" is the value stored in the myNum variable");
	 System.out.println(name);
	 System.out.println(firstLetter);
	 System.out.println(decimal);
	 System.out.println(bool);
	 
	 int[] arr1 = new int[5];
	 arr1[0] = 1;
	 arr1[1] = 7;
	 arr1[2] = 8;
	 arr1[3] = 9;
	 arr1[4] = 4;
	 
	 int[] arr2 = {5,8,7,6,3};
	 
	 System.out.println(arr1[1]);
	 System.out.println(arr2[1]);
	 
	 for(int i = 0; i < arr1.length; i++) {
		 int position = i+1;
		 System.out.println(i+" is the valus stored in arr1 at "+position+"th position.");
	 }
	 
	 String[] friendNameStrings = {"Shubham", "Avnish", "Shashi"};
	 
	 for (int i = 0; i < friendNameStrings.length; i++) {
		 int position = i+1;
		 System.out.println("Shahil's "+position+"st friend is "+friendNameStrings[i]);
	 }
	 
	 for (String s : friendNameStrings) {
		 System.out.println(s);
	 }
	 
	}

}
