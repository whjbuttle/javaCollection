package lang;

public class PersonMain {
	public static void main(String[] args) {
		
		Person p1 = new Person("800101-1234567");
		Person p2 = new Person("800101-1234567");
		
		String result = "";
		result = (p1 == p2) ? "������" : "�ٸ����";
		System.out.println("p1 == p2 �� ��� ��� : " + result);
		// ����� �ٸ�������� ��µǴ� ���� ������ �񱳰� �ƴ϶� == �� ���� �ּҰ� ���̱� �����̴�.
		result = (p1.equals(p2)) ? "������" : "�ٸ����";
		// �ּҰ� �񱳰� �ƴ� ������ �� ����� ����
		// �ּҰ� : call by Reference --> �ڹٿ��� ���� �ּҷ� �޸� ����
		// ������ : call by Value --> C���� ���� �޸𸮸� ����
	}
}
