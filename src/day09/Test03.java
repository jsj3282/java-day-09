package day09;

import java.util.Scanner;

//�μ��� �Է¹޾� ū ���� ����ϴ� �Լ��� ����ÿ�.
class Big{
	public void bigFunc() {
	Scanner input = new Scanner(System.in);
	System.out.print("�� ���� �Է� �Ͻÿ� : ");
	int n1 = input.nextInt();
	int n2 = input.nextInt();
	String s1 = null;
	if(n1>n2) {
		System.out.println(n1 + "�� " + n2 + "���� ũ��.");
	}else if(n1<n2) {
		System.out.println(n2 + "�� " + n1 + "���� ũ��");
	}else {
		System.out.println(n1 + "�� " + n2 + "�� ����.");
	}
	}
}
public class Test03 {

	public static void main(String[] args) {
		Big bg = new Big();
		bg.bigFunc();

	}

}
