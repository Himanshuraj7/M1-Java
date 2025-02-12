package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MaxElement {
	public static void main(String []args) {
		
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	Integer array[]=new Integer[size];
	List<Integer> list=new ArrayList<>();
	
	for(int i=0; i<size; ++i) {
		array[i]=sc.nextInt();
	}
	
	list=Arrays.asList(array);
	
	Integer maxNo=list.parallelStream().max(Comparator.comparing(Integer::valueOf)).get();
	System.out.print("max element : "+maxNo);
	
	Integer minNo=list.stream().min(Comparator.comparing(Integer::valueOf)).get();
	System.out.print("\n"+"min element : "+minNo);
	
	sc.close();
	}
}