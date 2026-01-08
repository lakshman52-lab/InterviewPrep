package test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> data1=Arrays.asList("lakshman","swetha","chaithra","karthikeya");
		
		
		List<String> uppercase=data1.stream()
				                    .map(String::toUpperCase)
				                    .collect(Collectors.toList());
		
		System.out.println("uppercase::"+uppercase);

	}

}
