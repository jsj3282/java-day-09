package day09;

import java.util.Scanner;

//�Է¹��� ���� ¦������ Ȧ������ �Ǻ��ϴ� �Լ� ����

class OddEven{
	public void oddEven() {
		Scanner input = new Scanner(System.in);
		System.out.print("�� �� ���� �Է��� �ּ��� : ");
		int n = input.nextInt();
		if(n%2==0) {
			System.out.println(n + "�� ¦���Դϴ�.");
		}else {
			System.out.println(n + "�� Ȧ���Դϴ�.");
		}
	}
}
public class Test04 {

	public static void main(String[] args) {
		OddEven oe = new OddEven();
		oe.oddEven();

	}

}
