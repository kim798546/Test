package com.example;

import java.util.Random;

public class CollisionExample {
	
	public static void main(String[] args) {		
		Random r = new Random();
		int A = r.nextInt(1,6);
		int B = r.nextInt(6,11);
		
		int result = A+B;
		System.out.printf("합은 %d입니다. 충돌 테스트(B에서 수정)",result);
	}
}
