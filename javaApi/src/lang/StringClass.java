package lang;

import java.util.Arrays;

public class StringClass {
	public static void main(String[] args) {
		String fruit = "apple, banana, cherry, orange";
		String[] fruits = fruit.split(",");
		for (int i = 0; i < fruits.length; i++) {
			//System.out.print(fruits[i] + "\t");
		}
		System.out.println("Arrays �� ���");
		//String[] fruits2 = fruit.split(",",2);	// ������ �� ���� �ʰ� ������ ���� ��
		System.out.println(Arrays.toString(fruit.split(",")));
	}
}
