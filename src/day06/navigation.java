package day06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class navigation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		String key,value;
		boolean bool =true;
		
		while(bool) {
			
			System.out.println("1.주소 등록");
			System.out.println("2.경로 등록 확인하기");
			System.out.println("3.삭제 혹은 수정하기");
			System.out.println("4.종료");
			int num = sc.nextInt();
			switch(num) {
			case 1: 
					System.out.println("주소 등록하세요");
					key = sc.next();
					
					
					if(!map.containsKey(key)) {
						value = sc.next();
						map.put(key, value);
						System.out.println("등록했습니다");
					}
					else {
						System.out.println("등록되지 않습니다");
					}
					break;
			case 2:
					
					Set<String> onekey = map.keySet();
					Iterator<String> twokey = onekey.iterator();
						while(twokey.hasNext()) {
						 String k =twokey.next();
						 System.out.println(k+":"+map.get(k));
						}
					
					
					break;
			case 3:
					System.out.println("1.수정할 경로");
					System.out.println("2.삭제할 경로");
					System.out.println("입력해주세요");
					int num2 = sc.nextInt();
					if(num2 == 1) {
						System.out.println("수정할 경로를 입력해주세요");
						String key1 =sc.next();
					
					if(map.containsKey(key1)) {
						
						value =sc.next();
						map.put(key1, value);
						System.out.println("수정완료");
					}
						else {
							System.out.println("수정하지 못했습니다");
						}
					}
					else if(num2 == 2) {
						System.out.println("삭제할 경로 선택");
						key = sc.next();
						if(map.containsKey(key)) {
							map.remove(key);
							System.out.println("삭제 완료");
						}
						else {
							
						}
					
					}
					
					break;
			case 4:
					bool =false;
					break;
				
			}
		}
		
	}

}
