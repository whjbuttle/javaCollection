package vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{
	
	private Vector<Grade> grades = new Vector<Grade>();
	private Grade grade;

	// �Ķ���� Ÿ���� ��ü ��ü�̹Ƿ� �����ڰ� ����, ���� ���� ���� �ڵ鸵 �� �ʿ䰡 ����.
	@Override
	public void input(Grade grade) {
		grades.add(grade);
	//	grades.addElement(grade);
	}

	@Override
	public void printList() {
		// ���� ���ο� toString �� ȣ���ϸ� ��� ���ο� ���ǵ� toString�� ���� ȣ�����ش�
		System.out.println(grades.toString());
	}

	@Override
	public String searchGradeByHak(String hak) {
		String msg = "";
		String searchedHak = "", name= "";	// �˻��Ϸ��� �й�
		int kor = 0, eng = 0, math = 0;
		for (int i = 0; i < grades.size(); i++) {
			searchedHak = grades.elementAt(i).getHak();
			if (hak.equalsIgnoreCase(searchedHak)) {
				name = grades.elementAt(i).getName();
				kor = grades.elementAt(i).getKor();
				eng = grades.elementAt(i).getEng();
				math = grades.elementAt(i).getMath();
				
				// ��ü�� �̷�� �ʵ尪�� �� �˾Ƴ� ����
				grade = new Grade(searchedHak, name, kor, eng, math);
				msg = grade.toString();
				break;
			} else {
				msg = "�˻��Ϸ��� �й��� �����ϴ�.";
			}
		}
		return msg;
	}

	/*
	 �̸����� ������ȸ�ε� ���ϰ��� ������ ������ �������� ���������� ����϶�� �߱� �����Դϴ�.
	 ������� �ϳ��̵� �������̵� ��� �˰����� forloop + if ������ ����Ѵ�.
	 */
	@Override
	public Vector<Grade> searchGradesByName(String name) {
		/*
		 �ڵ�����
		 1. �������̽��� ������ ������ �������̽��̸�+Impl Ŭ���� ����
		 2. �� Ŭ������ �������̽��� ������ implements ��
		 3. �޼ҵ尡 ����� ���� �������� ��Ƶ� �ڷᱸ���� �ʵ忡 ����
		 	- �ڷᱸ���� ����ÿ��� �ڷᱸ�� ���ο� �ִ� ��ü ���� ���Ҿ� ����
		 4. �޼ҵ� ���ο� ����Ÿ���� ������ �����ϰ� �ʱ�ȭ�� �� ���ϰ��� ��ġ
		 	- �ڷᱸ���� ����ÿ��� �ڷᱸ�� ���ο� �ִ� ��ü ���� ���Ҿ� ����
		 5. �˰����� �ʿ��� ��Ȳ���� �� ��°��� �˻������� for + if�� ��ġ
		 */
		Vector<Grade> temp = new Vector<Grade>();
		Grade grade = null;		// ��ü �ʱ�ȭ�� null
		
		for (int i = 0; i < grades.size(); i++) {
			String searchedName = grades.elementAt(i).getName();
			if (name.equalsIgnoreCase(searchedName)) {
				temp.add(new Grade(
						grades.elementAt(i).getHak(),
						grades.elementAt(i).getName(),
						grades.elementAt(i).getKor(),
						grades.elementAt(i).getEng(),
						grades.elementAt(i).getMath()));
				System.out.println(temp);
				break;
			} else {
				temp.remove(new Grade());
				
			}
		}
		return null;
	}
	
}
