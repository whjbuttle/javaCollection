package lang;
// Story : trim() ����
public class Trim {
	public static void main(String[] args) {
		String str = "     Hello     Java     World!!      ";
		System.out.println(str.trim());
		// trim() �� ���ͷ����� �յ� ������ ���ִ� ����� �Ѵ�
		System.out.println(str.trim().replace("Java", "JSP"));
		/*
		 �޼ҵ� ü�α��
		 String �� �޼ҵ���� �����ؼ� ����� �� �ִµ� �̰��� �޼ҵ� ü���̶�� �Ѵ�
		 */
	}
}
