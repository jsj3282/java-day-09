package day09;

import java.util.Scanner;

//���� �Է¹޾� �Ҽ��� �Ǻ��ϴ� �Լ� ����
class PrimeNumber{
	public void primeNumber() {
		Scanner input = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է��Ͻÿ� : ");
		int n = input.nextInt();
		int j = 0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				j+=1;
			}
		}
		if(j==2) {
			System.out.println(n + "�� �Ҽ��Դϴ�.");
		}else {
			System.out.println(n + "�� �Ҽ��� �ƴմϴ�.");
		}
	}
}

public class Test06 {

	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		pn.primeNumber();

	}

}
