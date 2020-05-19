package day09;

class Overloading_03{
	public int sumFunc(int su1, int su2) {
		return su1 + su2;
	}
	public double sumFunc(double su1, double su2) {
		return su1 + su2;
	}
	public int sumFuc(int su1) {
		return su1 + 123456;
	}
}
public class Test11 {

	public static void main(String[] args) {
		Overloading_03 over = new Overloading_03();
		System.out.println("결과 : " + over.sumFunc(10, 20));
		System.out.println("결과 : " + over.sumFunc(10.11, 20.22));
		System.out.println("결과 : " + over.sumFuc(10));

	}

}
