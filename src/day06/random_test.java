package day06;

import java.util.Random;

public class random_test {

	public static void main(String[] args) {
		for(int i =0 ; i<5; i++) {
			double ran = Math.random();
			// 0.00 ~0.99 * 3
			// 		=
			// 0.00 ~ 2.9999 
			// int 형변환 => 0~2 총 3개의 값을 가져온다
			System.out.println((int)(ran*3));
		}
		System.out.println("============");
		for(int i=0; i<10; i++) {
			int n =(int)(Math.random()*10+10); // 20이하로 나온다
			System.out.println(n);
		}
		for(int i=0 ; i <5 ; i++) {
			System.out.println((int)(Math.random()*4+10));
		}
		System.out.println("================");
		Random rand =new Random();
		for(int i=0 ; i<5 ; i++) {
			System.out.println(rand.nextInt(10));
		}
	
		}

}
