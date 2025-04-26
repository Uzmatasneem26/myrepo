package stream_api;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String [] args) {
		List<String> names=Arrays.asList("Alice","Abhi","Sowmya","Bob");
		
		List<String> result=names.stream().filter(name->name.startsWith("A"))
				                          .map(String::toUpperCase)
				                          .collect(Collectors.toList());
		System.out.println("Filtered Names:"+ result);
				
		
	}

}