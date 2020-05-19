package day09;

import java.util.Scanner;

class MethodTest_07{
	public void reverse() {
		Scanner input = new Scanner(System.in);
		int su = 0, temp = 0;
		System.out.print("¼ö ÀÔ·Â : ");
		su = input.nextInt();
		while(true) {
			temp = su % 10;
			su = su / 10;
			System.out.print(temp + ", ");
			if(su == 0)break;
		}
	}
}
public class Test02 {

	public static void main(String[] args) {
		
		MethodTest_07 mt = new MethodTest_07();
		mt.reverse();

	}

}
