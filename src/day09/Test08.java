package day09;

import java.util.ArrayList;
import java.util.Scanner;

//������ �Ųٷ� ���� ��ȯ�ϴ� �޼ҵ带, ������ ��ɺ��� ����ÿ�


class AAA{
	public void aa() {
		System.out.println("hi~");
	}
}

class ReverseNumber{
	
	public int scan() {
		AAA aa = new AAA();
		aa.aa();
		Scanner input = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է��Ͻÿ� : ");
		int x = input.nextInt();
		return x;
	}
	
	private ArrayList reverseNumber() {
		int x = scan();
		ArrayList reverse = new ArrayList();
		while(true) {
			int temp = x % 10;
			x = x / 10;
			reverse.add(temp);		
			if(x==0)		break;
		}
		return reverse;
		
	}
	public void printReverse() {
		ArrayList reverse2 = reverseNumber(); //���� Ŭ�������� �����ϹǷ� ��ü ���� �ʿ� x
		for(int i=0; i<reverse2.size();i++) {
			System.out.print(reverse2.get(i));
		}
		
	}
}
public class Test08 {

	public static void main(String[] args) {
		ReverseNumber rn = new ReverseNumber();
		rn.printReverse();
		
	}

}
