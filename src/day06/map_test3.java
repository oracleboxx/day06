package day06;

import java.util.HashMap;
import java.util.Scanner;

public class map_test3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //
		HashMap<String, String> map = new HashMap<>();// 
		String key,value;// key와 value 초기화
		System.out.println("저장할 키 입력:"); 
		key =input.next(); // key의 값을 입력해준다
		System.out.println("저장할 값 입력");
		value = input.next();// value값을 입력해준다
		map.put(key, value); // 입력 받은 값을 key와 value의 각각 값을 저장해준다
		System.out.println(map); 
		System.out.println("찾는 키 입력:");
		key =input.next();
		if(!map.containsKey(key)) { // 
			System.out.println("존재하지 않습니다");
		}
		else {
			System.out.println("key의 value값: "+map.get(key));
		}
		String result = map.get(key);
		if(result == null) {
			System.out.println("존재하지 않는다");
		}
		else {
			System.out.println(key+":"+result);
		}
	}

}
