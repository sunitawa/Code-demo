package cep.ibm.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IsPrime {
	public static boolean isPrime(int number) {
	    return !IntStream.rangeClosed(2, number/2).anyMatch(i -> number%i == 0); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20,23);
         // Prime number 
     System.out.println(numbers.stream()
                              .filter(IsPrime::isPrime)
                              .collect(Collectors.toList()));
	}

}
