package day09;

import java.util.Scanner;

//절대값을 구하는 함수를 정의하시오.
class AbsoluteValue{
	public void absoulteValue() {
		Scanner input = new Scanner(System.in);
		System.out.print("수를 하나 입력하시오 : ");
		int num = input.nextInt();
		if(num>=0) {
			System.out.println(num+"의 절댓값은 : " + num);
		}else {
			System.out.println(num+"의 절댓값은 : " + -num);
		}
	}
}
public class Test07 {

	public static void main(String[] args) {
		
		AbsoluteValue av = new AbsoluteValue();
		av.absoulteValue();

	}

}
