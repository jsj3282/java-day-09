package day09;

import java.util.Scanner;

//입력받은 값이 짝수인지 홀수인지 판별하는 함수 제작

class OddEven{
	public void oddEven() {
		Scanner input = new Scanner(System.in);
		System.out.print("수 한 개를 입력해 주세요 : ");
		int n = input.nextInt();
		if(n%2==0) {
			System.out.println(n + "는 짝수입니다.");
		}else {
			System.out.println(n + "는 홀수입니다.");
		}
	}
}
public class Test04 {

	public static void main(String[] args) {
		OddEven oe = new OddEven();
		oe.oddEven();

	}

}
