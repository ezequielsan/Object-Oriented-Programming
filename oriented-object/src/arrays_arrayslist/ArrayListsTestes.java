package arrays_arrayslist;

import java.util.*;

public class ArrayListsTestes {
	public static void main(String[] args) {
		ArrayList<String> str1 = new ArrayList<String>(10);
		ArrayList<Integer> valuesInteger = new ArrayList<Integer>(5);
		ArrayList<Boolean> boll = new ArrayList<Boolean>();
		
		valuesInteger.add(5);
		valuesInteger.add(9);
		valuesInteger.add(Integer.MAX_VALUE);
		valuesInteger.add(2, 77);
		
		Integer value = 77;
		valuesInteger.remove(value); // remove o elemento 77
		
		valuesInteger.remove(0); // remove o valor que esta no indice 0
		
		valuesInteger.set(0, value);
		
		System.out.println(valuesInteger.get(1));
		System.out.println(valuesInteger);
		
		/**
		 * Outros metodos
		 * @method equals()
		 * @method isEmpty()
		 * @method size()
		 * @method toArray()
		 * @method contains()
		 * @method toString()
		 * @method indexOf()
		 * @link JAVA API: https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/ArrayList.html
		 */
	}
	
}

