package lang;
// Wrapper Class ����
public class WrapperDemo {
	/*
	 Wrapper Class
	 - ������ Ÿ�� 8���� �� char �� int �� ������ ������ Ÿ�Ե� ���蹮�ڸ� �빮�ڷ� �ٲپ� ��üȭ ��Ų ��
	 - �� Boolean, Byte, Double, Float, Short, Long �̴�
	 - �׸��� int �� Integer char�� Character �̴�
	 - �� primitive Ÿ�Ե� ��ü�� ó���ϴ� ���� Wrapper(����) class�̴�
	 */
	public static void main(String[] args) {
		// int �� -> StringŸ��(���ͷ�)
		String str = String.valueOf(50);
		// ���ͷ� ���� �⺻���� ĳ���ý� ��ȯ ��� (String => int)
		int num1 = Integer.parseInt("200");
		int num2 = Integer.parseInt("200");
		int result = num1 + num2;
		System.out.println(result);
		
		// �⺻���� ���������� ����ȯ�ϴ� ���(ĳ���� ��������)
		// Integer num3 = (Integer)result;
		Integer num3 = result;
		System.out.println("�⺻���� ���������� ����ȯ�� ��� : " + num3);
		
		int num4 = 2 + num3;
		System.out.println("�������� �⺻������ ������ : " + num4);
		
		// int num5 = Integer.parseInt("Hello");
		// System.out.println(num5);
		
	}
}
