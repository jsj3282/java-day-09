package day09;

class MethodTest_06{
	private String big(int x, int y) {
		if(x>y)	return x+"�� "+y+"���� ũ��";
		else if(y>x)	return y+"�� "+x+"���� ũ��";
		else	return x+"�� "+y+"�� ����";
	}
	public String subFunc(int x, int y) {
		return big(x, y);
	}
}
public class Test01 {

	public static void main(String[] args) {
		MethodTest_06 mt = new MethodTest_06();
		String str = null;
		str = mt.subFunc(100, 200);
		System.out.println("��� �� : " + str);

	}

}
