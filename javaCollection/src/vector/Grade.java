package vector;

public class Grade {
	private int kor, eng, math;
	private String hak, name;
	
	public Grade() {
		this("", "",0,0,0);
	}
	
	// �л��ο� ����Ǹ鼭 �ٷ� �й�, �̸�, ����, ����, ���� ������ �����
	
	// getter setter �� ����µ� �ʿ���� ���� ����
	
	// ������ ���Ҿ� ��µ�
	
	
	public Grade(String hak, String name, int kor, int eng, int math) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public String getHak() {
		return hak;
	}

	public String getName() {
		return name;
	}
	
	private String getTotal() {
		return String.valueOf(kor + eng + math);
	}

	@Override
	public String toString() {
		return "����ǥ [ �й� : " + hak + ", �̸�: " + name + ", ����: " + kor
				+ ", ����: " + eng + ", ����: " + math + ", ����: " + getTotal() + " ] \n";
	}

}
