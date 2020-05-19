package day09;

import java.util.Scanner;

//두수를 입력받아 큰 수를 출력하는 함수를 만드시오.
class Big{
	public void bigFunc() {
	Scanner input = new Scanner(System.in);
	System.out.print("두 수를 입력 하시오 : ");
	int n1 = input.nextInt();
	int n2 = input.nextInt();
	String s1 = null;
	if(n1>n2) {
		System.out.println(n1 + "이 " + n2 + "보다 크다.");
	}else if(n1<n2) {
		System.out.println(n2 + "이 " + n1 + "보다 크다");
	}else {
		System.out.println(n1 + "과 " + n2 + "는 같다.");
	}
	}
}
public class Test03 {

	public static void main(String[] args) {
		Big bg = new Big();
		bg.bigFunc();

	}

}
