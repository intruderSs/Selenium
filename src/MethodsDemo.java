import javax.sound.sampled.TargetDataLine;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MethodsDemo demo = new MethodsDemo();
       String nameString = demo.getData();
       
       System.out.println(nameString);
       getData2();
	}
	
	public String getData () {
		System.out.println("Hello from method demo");
		return "Shahil Sinha";
	}
	
	public static String getData2 () {
		System.out.println("Hello from static method");
		return "Shahil Sinha";
	}

}
