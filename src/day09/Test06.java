package day09;

import java.util.Scanner;

//수를 입력받아 소수를 판별하는 함수 제작
class PrimeNumber{
	public void primeNumber() {
		Scanner input = new Scanner(System.in);
		System.out.print("수를 하나 입력하시오 : ");
		int n = input.nextInt();
		int j = 0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				j+=1;
			}
		}
		if(j==2) {
			System.out.println(n + "은 소수입니다.");
		}else {
			System.out.println(n + "은 소수가 아닙니다.");
		}
	}
}

public class Test06 {

	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		pn.primeNumber();

	}

}
