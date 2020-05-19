package day09;

import java.util.ArrayList;
import java.util.Scanner;

//이전의 거꾸로 수를 반환하는 메소드를, 각각의 기능별로 만드시오


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
		System.out.print("수를 하나 입력하시오 : ");
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
		ArrayList reverse2 = reverseNumber(); //같은 클래스에서 접근하므로 객체 생성 필요 x
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
