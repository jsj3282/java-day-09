package day09;

import java.util.Scanner;

//���� ��� ������ Ȯ���� ���

class Monster{
	public void catchmon() {
		boolean flag = true;
	while(flag) {
		System.out.println("1. ���� ���");
		System.out.println("2. ���� �ϱ�");
		System.out.print("�Է� : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch(num) {
		case 1: 
			int n = (int) (Math.random()*5+1);
			if(n==1) {
				System.out.println("���͸� ��ҽ��ϴ�.");
				System.out.println("100�� ȹ���Ͽ����ϴ�.");
			}else if(n==2) {
				System.out.println("���͸� ��ҽ��ϴ�.");
				System.out.println("200�� ȹ���Ͽ����ϴ�.");
			}else if(n==3) {
				System.out.println("���͸� ��ҽ��ϴ�.");
				System.out.println("500�� ȹ���Ͽ����ϴ�.");
			}else if(n==4) {
				System.out.println("���͸� ��ҽ��ϴ�.");
				System.out.println("20�� ȹ���Ͽ����ϴ�.");
			}else {
				System.out.println("���͸� ��ҽ��ϴ�.");
				System.out.println("������ ���� ȹ���Ͽ����ϴ�.");
			}
			break;
		case 2:
			System.out.println("�ý��� ����");
			flag = false;
		}
		}
	}
}
public class Test14 {

	public static void main(String[] args) {
		
		Monster mon = new Monster();
		mon.catchmon();

	}

}
