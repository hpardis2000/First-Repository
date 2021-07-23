package Comparable;

import java.util.*;
import java.util.stream.Stream;


public class LaptopTester {

	public static void main(String[] args) {
		
		
		
		
		List<Laptop> laptopList= new ArrayList<>();
		laptopList.add(new Laptop("apple", 16, 200));
		laptopList.add(new Laptop("samsong", 8, 160));
		laptopList.add(new Laptop("google", 32, 186));
		
		Comparator<Laptop> com=new Comparator<Laptop>() {
			
			public int compare(Laptop o1, Laptop o2) {
				if(o1.getPrice() > o2.getPrice()) {
					return 1;
				}
				return -1;
			}
		};
		
		Collections.sort(laptopList,com);
		for(Laptop l:laptopList) {
			System.out.println(l);
		}
		
		
		
	}

}

interface hamid{
	
	static void show() {
	}
	
}