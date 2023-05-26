package day06;

import java.util.HashMap;
import java.util.Scanner;

public class map_test4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<String, String> map =new HashMap<>();
		String k ,v ;
		k = input.next();
		v = input.next();
		map.put(k, v);
		System.out.println(map);
		System.out.println("k 값을 찾기");
		k = input.next();
		if(map.containsKey(k)) {
			System.out.println(map.get(k));
			
		}
		else {
		
			System.out.println("존재하지 않습니다");
		}
		String result = map.get(k);
		if(result == null) {
			System.out.println("존재하지 않습니다");
		}
		else {
			System.out.println(map.get(k));
		}
	}

}
