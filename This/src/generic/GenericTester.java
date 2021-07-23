package generic;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GenericTester {
	private static final int ARRAY_SIZE=100;
	private static final int MAX_VALUE=500;
	private static final int WORD_LENGHT=3;

	public static void main(String[] args) {
		
	Integer [] numbersArray = new Integer[ARRAY_SIZE];
	fillArray(numbersArray);
	System.out.println(Arrays.toString(numbersArray));
	
	
	String [] wordsArray = new String[ARRAY_SIZE];
	fillArray(wordsArray);
	System.out.println(Arrays.toString(wordsArray));
	
	
	
	List<Integer> numberDups= ArrayUtilities.findDuplicate(numbersArray);
	System.out.println("Number Duplicates from non generic: " + numberDups);
	numberDups=ArrayUtilities.findDuplicate(numbersArray);
	System.out.println("Number Duplicates from generic: " + numberDups);
	
	List<String> wordDups=ArrayUtilities.findDuplicate(wordsArray);
	System.out.println("Word Duplicates: " + wordDups);
	wordDups=ArrayUtilities.<String>findDuplicate(wordsArray);
	System.out.println("Word Duplicates from generic: " + wordDups);
	
	
	Pair<Integer> minMaxNumber = ArrayUtilities.findMinMaxInteger(numbersArray);
	System.out.println("The min is "+ minMaxNumber.getFirst());
	System.out.println("The max is "+ minMaxNumber.getSecond());

	
	Pair<String> minMaxWord = ArrayUtilities.findMinMax(wordsArray);
	System.out.println("The min is "+ minMaxNumber.getFirst());
	System.out.println("The max is "+ minMaxNumber.getSecond());
	
	Pair<Integer> minMaxInterger = ArrayUtilities.findMinMax(numbersArray);
	System.out.println("The min is "+ minMaxNumber.getFirst());
	System.out.println("The max is "+ minMaxNumber.getSecond());

	
	
	}
	public static void fillArray(Integer [] numbers) {
		Random generator=new Random();
		for(int i=0; i<numbers.length;i++) {
			numbers[i]=generator.nextInt(MAX_VALUE);
		}
	}

	public static void fillArray(String[] words) {
		Random random= new Random();
		for(int i=0;i< words.length;i++) {
			char [] wordChar=new char[WORD_LENGHT];
			for(int j=0;j<wordChar.length;j++) {
				wordChar[j]=(char)(97 + random.nextInt(10));//a=97 and we need only first 10 caractor
			}
			words[i]=String.valueOf(wordChar);
		}
	}
}
