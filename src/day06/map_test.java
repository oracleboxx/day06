package day06;

import java.util.HashMap;

public class map_test {

	public static void main(String[] args) {
		/*Map = HashMap
		 * -key,value 형식으로 만들어진다.
		 * -순서는 유지되지 않는다.
		 * -원하는 값을 얻고자 하는 경우 key를 통해 얻어온다.
		 * -키의 중복은 허용되지 않으며 value는 중복 가능
		 * 
		 * 
		 * 
		 */
		HashMap<String, String> map = new HashMap<>();
		map.put("num", "100");
		map.put("name", "홍길동");
		map.put("addr", "산골짜기");
		System.out.println(map);
		String n = map.get("num");
		System.out.println(n);
		System.out.println(map.get("num"));
		System.out.println(map.get("name"));
		System.out.println(map.get("없는 키"));
		
		System.out.println("키가 존재: "+map.containsKey("name"));
		
		System.out.println("=================");
		map.put("name", "김개똥");
		map.put("name1", "김개똥");// key대한 중복은 허용하지 않는다 대신 값은 중복가능
		
		System.out.println(map);
		
		map.remove("name1"); // remove 삭제 기능
		System.out.println("name1 삭제: "+map);
	}
	

}
