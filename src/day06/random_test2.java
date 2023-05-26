package day06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class random_test2 {

	public static void main(String[] args) {

		HashMap<Integer, Integer> map = new LinkedHashMap<>();
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		for (int i = 0; i < 6; i++) {
			int putmap = rand.nextInt(44) + 1;
			if (!map.containsValue(putmap)) {
				map.put(i, putmap);
				System.out.print(map.get(i)+" ");
			}
		}
			HashSet<Integer> hs = new HashSet<>();
			 // Set<String>을 통해서 key값에 저장가능함
			Iterator<Integer> it = hs.iterator();
			for(int i = 0 ; i<6 ; i++) {
				int putlo = rand.nextInt(44) + 1;
				if (!hs.contains(putlo)) {
					hs.add(putlo);
				}
			}
		
			while(it.hasNext()) {
			
			System.out.println(it.next());
			
			}
			
		
	
		}
	}


