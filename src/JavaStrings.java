
public class JavaStrings {
	
	public static void main(String[] args) {
		
		String nameString = "Shahil Kumar Sinha";
		
		String[] splittedName = nameString.split("Kumar");
		
		String reversedName = "";
		
		
//		for (int i = 0; i < splittedName.length; i++) {
//			System.out.println(splittedName[i]);
//		}
		
		for (int j = nameString.length()-1; j >= 0; j--) {
			reversedName = reversedName + nameString.charAt(j);
		}
		System.out.println(reversedName);
	}

}
