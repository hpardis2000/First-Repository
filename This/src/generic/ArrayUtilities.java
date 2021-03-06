package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrayUtilities {
	
	
	public static List<Integer> findDuplicate(Integer[] numbers){
		ArrayList<Integer> duplicates=new ArrayList<Integer>();
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i].equals(numbers[j]) && !duplicates.contains(numbers[i])) {
					
					duplicates.add(numbers[i]);
					
				}
			}
		}
		
		return duplicates;
	}
	
	public static List<String> findDuplicate(String [] words){
		ArrayList<String> duplicates = new ArrayList<String>();
		
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])&& !duplicates.contains(words[i])) {
					duplicates.add(words[i]);
				}
			}
		}
		return duplicates;
	}
	
	
	// generic vergion
	
	public static <T> List<T> findDuplicate(T[] array){
		ArrayList<T> duplicates = new ArrayList<T>();
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i].equals(array[j])&& !duplicates.contains(array[i])) {
					duplicates.add(array[i]);
				}
			}
		}
		return duplicates;
	}
	
	
	
	
	
	public static Pair<Integer> findMinMaxInteger(Integer [] array){
		int min=array[0];
		int max=array[0];
		
		for(int i=0;i< array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
			if(array[i]>max) {
				max=array[i];
			}
		}
		return new Pair<Integer>(min, max);
	}
	
	public static <T extends Comparable<T>> Pair<T> findMinMax(T [] array){
		T min=array[0];
		T max=array[0];
		
		for(int i=0;i< array.length;i++) {
			if(min.compareTo(array[i])>0) {
				min=array[i];
			}
			if(max.compareTo(array[i])<0) {
				max=array[i];
			}
		}
		return new Pair<T>(min, max);
	}
}
