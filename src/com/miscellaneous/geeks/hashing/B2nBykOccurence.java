package com.miscellaneous.geeks.hashing;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class B2nBykOccurence {

	public static void main(String[] args) {
		int[] array = {10,30,20,20,20,10,40,30,30};
		int k=4, n=array.length;
		
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < n; i++) {
			if(map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i])+1);
			} else if(map.size() < (k-1)) {
				map.put(array[i], 1);
			} else {
				Iterator<Entry<Integer, Integer>> iterator = map.entrySet().iterator();
				while(iterator.hasNext()) {
					Entry<Integer, Integer> next = iterator.next();
					next.setValue(next.getValue()-1);
					if(next.getValue() == 0) {
						iterator.remove();
					}
				}
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			if(val >= n/k) {
				System.out.println(key + " :: " + val);
			}
		}
	}

}
