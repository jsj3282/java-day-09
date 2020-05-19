package day09;

import java.util.Scanner;

//두 정수를 입력받아 앞의 정수에 대한 뒤의 정수 승을 구하여 반환하는 
//프로그램을 작성하여라. 문자와 숫자합을 구하는 함수도 만드시오.
class Multiplication{
		
	public int multiple(int x, int y) {
		int num = 1;
		for(int i = 0; i < y; i++) {
			num *= x;
		}
		return num;
	}
	
	public char multiple(char x, int y) {
		char abc = (char) (x + y);
		return abc;
	}
}

public class Test12 {

	public static void main(String[] args) {
		
		Multiplication mp = new Multiplication();
		//int num = mp.multiple(3, 4);
		//System.out.println(num);
		char abc = mp.multiple('a', 1);
		System.out.println(abc);
	}

}
