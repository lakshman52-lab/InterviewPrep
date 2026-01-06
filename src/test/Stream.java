package test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		
	   //Create the number list	
       List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
       
       //Predicate condition for the even numbers
       Predicate<Integer> condition=n->n%2==0; 
       
       //Streams for getting the even
       List<Integer> even=numbers.stream().filter(condition).collect(Collectors.toList());
       
       //Print the output
       System.out.println(even);
		
	}

}
