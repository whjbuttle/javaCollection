package hashMap;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ���.");
		String id = scanner.next();
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		String password = scanner.next();
		System.out.println("�̸��� �Է��ϼ���.");
		String name = scanner.next();
		System.out.println("���̸� �Է��ϼ���.");
		int age = scanner.nextInt();
		System.out.println("�ּҸ� �Է��ϼ���.");
		String addr = scanner.next();
		
		/*
		 ��ü�� �����ؼ� �ϼ���Ű����
		 ��ü�� �����ϴ� ������ �� �Ѱ���
		 ��ü�� �ҷ����� �޼ҵ带 Ȱ���ϱ� ���ؼ�
		 */
		MemberService service = new MemberServiceImpl();
		service.join(name, addr, age, id, password);
		
		while (true) {	// ���ѷ��� ������ if ���ǿ��� break �� �ʼ��� �����ؾ� �Ѵ�
			System.out.println("�α����� �ϼ���");
			System.out.println("���̵� �Է��ϼ���");
			id = scanner.next();
			System.out.println("��й�ȣ�� �Է��ϼ���.");
			password = scanner.next();
			String msg = service.login(id, password);
			String flag = msg.substring(0, 5);
			if (flag.equals("ȯ���մϴ�")) {
				System.out.println(msg);
				break;
			} else if (flag.equals("��й�ȣ��")) {
				System.out.println(msg);
				continue;	// break�� �ݴ� ����. ������ ��� �����ϴ� ��ɾ�
			} else if (flag.equals("�Է��Ͻ� ")) {
				System.out.println(msg);
				continue;
			} else {
				System.out.println(msg);
				continue;
			}
			
			
		} 
		
	}

}
