package day09;

import java.util.Scanner;

//3�� ����� �Ǻ��ϴ� �Լ��� ����� �� �Լ��� �̿��Ͽ� main���� 3�� ����� ����Ͻÿ�.
class Multiple3{
	public void multiple3() {
		Scanner input = new Scanner(System.in);
		System.out.print("�� �ϳ��� �Է��Ͻÿ� : ");
		int n = input.nextInt();
		if(n%3==0) {
			System.out.println(n + "�� 3�� ����Դϴ�.");
		}
		
	}
}
public class Test05 {

	public static void main(String[] args) {
		
		Multiple3 mp = new Multiple3();
		mp.multiple3();

	}

}
