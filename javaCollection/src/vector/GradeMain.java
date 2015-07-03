package vector;

import java.util.Scanner;

public class GradeMain {
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		Grade hong = new Grade("1111", "ȫ�浿", 90, 80, 70);
		Grade kang = new Grade("2222", "������", 80, 60, 70);
		Grade kim = new Grade("3333", "������", 40, 50, 60);
		Grade lee = new Grade("4444", "�̼���", 100, 100, 100);
		
		service.input(hong);
		service.input(kang);
		service.input(kim);
		service.input(lee);
		
		System.out.println("=== ��ü ��ȸ ===");
		service.printList();
		
		System.out.println("=== �й����� ��ȸ ===");
		Scanner scanner = new Scanner(System.in);
		System.out.println(service.searchGradeByHak(scanner.next()));
		
		System.out.println("=== �̸����� ��ȸ ===");
		System.out.println(service.searchGradesByName(scanner.next()));
	}
}
