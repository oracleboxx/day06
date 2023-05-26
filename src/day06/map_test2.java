package day06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class map_test2 {

	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();// LinkedHashMap은 결과 값에 순서를 고정시켜준다
	//HashMap<String, String> map = new HashMap<>();
		map.put("선풍기", "100만원");
		map.put("에어컨", "10만원");
		map.put("자동차", "20만원");
		System.out.println(map);
		System.out.println("에어컨 가격: "+map.get("에어컨"));
		
		System.out.println(map.keySet()); // key 값을 나타내준다 ex : 선풍기,에어컨
		System.out.println(map.values()); // value 값을 나타내준다 ex : 100만원 10만원
		
		Set<String> key = map.keySet(); // Set<String>을 통해서 key값에 저장가능함
		Iterator<String> it = key.iterator();
		
		while(it.hasNext()) {
			String k= it.next();
			System.out.println(k+":"+map.get(k));
		}
		/*
		String k = it.next();
		System.out.println(k+": "+map.get(k));
		k = it.next();
		System.out.println(k+":"+map.get(k));
		
		System.out.println(it.next());
		*/
	}

}
