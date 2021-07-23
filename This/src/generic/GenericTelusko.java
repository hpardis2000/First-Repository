package generic;

import java.util.*;
import java.util.function.Consumer;


public class GenericTelusko {

	public static void main(String[] args) {
		
	
		
		List<Integer> listVal = new ArrayList<Integer>();
		
		listVal.add(12);
		listVal.add(34);
		listVal.add(56);
		listVal.add(10);
		
		List<Integer> listVal2=Arrays.asList(23,12,43,65);
		
		Consumer<Integer> consumer=new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("from consumer " + t);
				
			}
			
		};
		
		listVal2.forEach(consumer);
		
		//or
		
		
		listVal2.forEach(t -> System.out.println("from lamda for each " +t));
		System.out.println("start lamda with ::");
		
		listVal2.forEach((System.out::println));
		
		System.out.println("end lamda with ::");
		
		Iterator<Integer> ii=listVal2.iterator();
		while(ii.hasNext()) {
			System.out.println("from iterator " + ii.next());
		}
		
		List<Integer> listVal3=new ArrayList<Integer>() {{
			add(65);
			add(76);
			add(12);
		}};
		
		listVal3.forEach(i -> doubleit(i));
		
		//or
		
		listVal3.forEach(GenericTelusko::doubleit);
	
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "hamid");
		map.put(2, "hasan");
		map.put(3, "rasol");
		map.put(5, "kir");

		Set<Integer> key=map.keySet();
		
		for(Integer i: key) {
		System.out.println(map.get(i));
	}
		Set <Map.Entry<Integer, String>> values= map.entrySet();
		
		for(Map.Entry<Integer, String> e: values) {
			System.out.println(e.getValue());
			
		}	
	}
	public static void doubleit(int i) {
		System.out.println(i*2);
	}
}


