package day09;

import java.util.Scanner;

//�� ������ �Է¹޾� ���� ������ ���� ���� ���� ���� ���Ͽ� ��ȯ�ϴ� 
//���α׷��� �ۼ��Ͽ���. ���ڿ� �������� ���ϴ� �Լ��� ����ÿ�.
class Multiplication{
		
	public int multiple(int x, int y) {
		int num = 1;
		for(int i = 0; i < y; i++) {
			num *= x;
		}
		return num;
	}
	
	public char multiple(char x, int y) {
		char abc = (char) (x + y);
		return abc;
	}
}

public class Test12 {

	public static void main(String[] args) {
		
		Multiplication mp = new Multiplication();
		//int num = mp.multiple(3, 4);
		//System.out.println(num);
		char abc = mp.multiple('a', 1);
		System.out.println(abc);
	}

}
