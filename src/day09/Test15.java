package day09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//�ζ� ���α׷��� ������(1 ~ 45���� 6���� �ߺ����� �ʴ� ����)
//ArrayList�� HashSet �� ���� ������� ������.
//Lotto Ŭ���� ��� �޼ҵ� arrayList, hashSet ���� ����
//������� return���� main���� ��� Ȯ��
class Lotto {
	public void lucky() {
		ArrayList arr = new ArrayList();
		for (int i = 0; arr.size()<6; i++) {
			arr.add((int) (Math.random() * 45 + 1));
			for(int j = 0; j < i; j++) {
				if(arr.get(i).equals(arr.get(j))) {
					arr.remove(j);
					i--;
				}
			}
		}
		System.out.println(arr);
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + "\t");
		}

	}

	public void lucky2() {
		HashSet hs = new HashSet();
		for (int i = 0; hs.size() < 6; i++) {
			hs.add((int) (Math.random() * 45 + 1));
		}
		
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			int lotto = (int)it.next();
			System.out.print(lotto+ "\t");
		}
	}
}

public class Test15 {

	public static void main(String[] args) {

		Lotto lo = new Lotto();
		lo.lucky();
		//lo.lucky2();

	}

}
