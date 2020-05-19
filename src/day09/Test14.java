package day09;

import java.util.Scanner;

//몬스터 잡기 아이템 확률로 드랍

class Monster{
	public void catchmon() {
		boolean flag = true;
	while(flag) {
		System.out.println("1. 몬스터 잡기");
		System.out.println("2. 종료 하기");
		System.out.print("입력 : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch(num) {
		case 1: 
			int n = (int) (Math.random()*5+1);
			if(n==1) {
				System.out.println("몬스터를 잡았습니다.");
				System.out.println("100원 획득하였습니다.");
			}else if(n==2) {
				System.out.println("몬스터를 잡았습니다.");
				System.out.println("200원 획득하였습니다.");
			}else if(n==3) {
				System.out.println("몬스터를 잡았습니다.");
				System.out.println("500원 획득하였습니다.");
			}else if(n==4) {
				System.out.println("몬스터를 잡았습니다.");
				System.out.println("20원 획득하였습니다.");
			}else {
				System.out.println("몬스터를 잡았습니다.");
				System.out.println("전설의 검을 획득하였습니다.");
			}
			break;
		case 2:
			System.out.println("시스템 종료");
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
