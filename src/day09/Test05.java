package day09;

import java.util.Scanner;

//3의 배수를 판별하는 함수를 만들고 이 함수를 이용하여 main에서 3의 배수만 출력하시오.
class Multiple3{
	public void multiple3() {
		Scanner input = new Scanner(System.in);
		System.out.print("수 하나를 입력하시오 : ");
		int n = input.nextInt();
		if(n%3==0) {
			System.out.println(n + "은 3의 배수입니다.");
		}
		
	}
}
public class Test05 {

	public static void main(String[] args) {
		
		Multiple3 mp = new Multiple3();
		mp.multiple3();

	}

}
