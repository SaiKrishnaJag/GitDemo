package Practice;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertSetToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		
		        Set<Integer> a = new HashSet<>();
		        a.add(1);
		        a.add(2);
		        a.add(4);
		        a.add(1);
		        System.out.println(a);
		        //directly
		        List<Integer> arr = new ArrayList<>(a);
		        System.out.println(arr);
		        System.out.println(arr.get(1));
		        //Using conventional for loop
		        List<Integer> arr1 = new ArrayList<>();
		        for (int i : a)
		        
		            arr1.add(i);
		        
		        System.out.println(arr1);
		        System.out.println(arr1.get(1));
		        //Using addAll()
		        List<Integer> arr2 = new ArrayList<>();
		        arr2.addAll(a);
		        System.out.println(arr2);
		        //Using Streams
		        List<Integer> arr3;
		        arr3 = a.stream().collect(Collectors.toList());
		        System.out.println(arr3);
		        //Using copyOf()
		        List<Integer> arr4;
		        
		        arr4 = List.copyOf(a);
		        System.out.println(arr4);
		        
		        
		        //Streams and  are not accurate and reliable when we have null values
		    }
		
	}


