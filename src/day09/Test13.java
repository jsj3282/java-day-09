package day09;

public class Test13 {

	public static void main(String[] args) {
		
		//예제 1.
		for(int i = 0; i<5; i++) {
			System.out.println(Math.random());
		}
		
		//예제 2.
		int ran;
		for(int i = 0; i < 5; i++) {
			ran = (int)(Math.random()*3+1);
			System.out.println(ran);
		}
		
		
	}
}
