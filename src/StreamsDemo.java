import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamsDemo {
	
	@Test
	public void regular () {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Shahil");
		names.add("Akash");
		names.add("Kapil");
		names.add("Vikas");
		names.add("S2");
		names.add("S3");
		int count = 0;
		for (String name : names) {
			if (name.startsWith("S")) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	@Test
	public void javaStreamDemo () {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Shahil");
		names.add("Akash");
		names.add("Kapil");
		names.add("Vikas");
		names.add("S2");
		names.add("S3");
		
		Long countS = names.stream().filter(s->s.startsWith("S")).count();
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
	
	@Test
	public void streamMap () {
		Stream.of("Shahil", "Sinha", "Abhijeet", "Adam", "Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		List<String> namesList = Arrays.asList("Shahil", "Sinha", "Abhijeet", "Adam", "Rama");
		namesList.stream().filter(s->s.startsWith("S")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	
	
	@Test
	public void MergingTwoArrayList () {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Shahil");
		names.add("Akash");
		names.add("Kapil");
		names.add("Vikas");
		names.add("S2");
		names.add("S3");
		
		List<String> namesList = Arrays.asList("Shahil", "Sinha", "Abhijeet", "Adam", "Rama");
		
		Stream<String> mergedStream = Stream.concat(names.stream(), namesList.stream());
		
		///check if a name s present in the give stream or not
		///
	    Assert.assertTrue(mergedStream.anyMatch(s->s.equalsIgnoreCase("shahil")));
	}
	
	@Test
	public void collectionStream () {
		List<String> ls =  Stream.of("Shahil", "Sinha", "Abhijeet", "Adam", "Rama").filter(s->s.startsWith("S")).map(s->s.toUpperCase()).collect(Collectors.toList());
	}
	
	@Test
	public void Assignment () {
		List<Integer> numbers = Arrays.asList(3,2,2,7,5,1,9,7);
		numbers.stream().distinct().sorted().forEach(s->System.out.println(s));
		List<Integer> list = numbers.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(list.get(2));
	}

}
