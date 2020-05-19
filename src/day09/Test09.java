package day09;

import java.util.Scanner;

class Overloading{
	
	public int scan() {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.print("수를 입력하시오 : ");		
		num = input.nextInt();
		return num;
	}
	public int sumFunc() {
		int su1 = scan();
		int su2 = scan();
		return su1 + su2;
	}
	public int sumFunc(int su1, int su2) {
		return su1 + su2;
	}
}
public class Test09 {

	public static void main(String[] args) {
		
		Overloading over = new Overloading();
		int sum = over.sumFunc();
		System.out.println(sum);
		
		System.out.println("결과 : " + over.sumFunc(20, 30));
	}

}
