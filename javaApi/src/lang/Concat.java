package lang;
// concat() �� ���ͷ� Ÿ���� ������� ��ġ�� �޼ҵ�
public class Concat {
	 public static void main(String[] args) {
		String str1 = "�ڹ�";
		String str2 = " �н���";
		String str3 = str1 + str2;
		System.out.println(str3);
		String str4 = "API��";
		System.out.println(str4.concat(str2));
	}
}
