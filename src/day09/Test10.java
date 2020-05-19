package day09;

class Overloading_02{
	public int sumFunc(int su1, int su2) {
		return su1 + su2;
	}
	public double sumFunc(double su1, double su2) {
		return su1 + su2;
	}
}
public class Test10 {

	public static void main(String[] args) {
		Overloading_02 over = new Overloading_02();
		System.out.println("결과 : " + over.sumFunc(10, 20));
		System.out.println("결과 : " + over.sumFunc(10.11, 20.22));

	}

}
