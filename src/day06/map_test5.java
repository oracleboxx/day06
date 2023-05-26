package day06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class map_test5 {

	public static void main(String[] args) {
		HashMap<String, String> menu =new HashMap<>();
		Scanner input =new  Scanner(System.in);
		int num = 0;
		String key,value ;
		
		boolean  bool = true;
		while(bool) {
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴를 눌러서 가격확인");
			System.out.println("3.삭제 혹은 수정");
			System.out.println("4.종료");
			
			num = input.nextInt();
			switch(num) {
			case 1: 
					System.out.println("메뉴 등록하고 가격 입력");
					key = input.next();
					value = input.next();
					if(!menu.containsKey(key)) {
						menu.put(key, value);
						 
						  System.out.println("등록했습니다");
						
					}
					else {
						System.out.println("등록되지 않는다");
					}
					break;
			case 2:
					Set<String> inkey = menu.keySet(); // Set<String>을 통해서 key값에 저장가능함
					Iterator<String> it = inkey.iterator();
					while(it.hasNext()) {
					String k= it.next();
					System.out.println(k+":"+menu.get(k));
					}
				
				
					break;
			case 3: 
					System.out.println("1.삭제할 메뉴");
					System.out.println("2.수정할 메뉴");
					int inputnum =input.nextInt();
					
					if(inputnum == 1) {
						System.out.println("삭제할 메뉴 이름 입력");
						key = input.next();
					
					if(menu.containsKey(key)) {
						menu.remove(key);
						System.out.println("삭제 하였습니다");
					}
						else {
							System.out.println("삭제하지 못했습니다");}
					}
						else if(inputnum == 2) {
							System.out.println("수정할 메뉴");
							
							String key1 =input.next();
							if(menu.containsKey(key1)) {
								
								String value1 =input.next();
								
								menu.put(key1 ,value1 );
								
								System.out.println("수정 완료");
								
							}
							
						}
					
					
					break;
			case 4: 
					bool = false;
			}
		}
	}

}
