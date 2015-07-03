package hashMap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService{

	Map<String,Object> map = new HashMap<String,Object>();
	Member member = new Member();
	
	@Override
	public void join(String name, String addr, int age, String id,
			String password) {
		member.setName(name);
		member.setAddr(addr);
		member.setAge(String.valueOf(age));
		member.setId(id);
		member.setPassword(password);
		/*
		map.put(member.getId(), new Member(member.getName(),
				member.getAddr(), member.getAge(),member.getId(), 
				member.getPassword()));
		*/
		map.put("id", member.getId());
		map.put("password", member.getPassword());
		map.put("name", member.getName());
		map.put("age", member.getAge());
		map.put("addr", member.getAddr());
	}

	@Override
	public String login(String id, String password) {
		String msg = "";
		// if ���� true�� �ְ� � ��Ȳ�̸� true �� ��ȯ������ ���
		if (map.get("id").equals(id) && map.get("password").equals(password)) {	// �� ���� ��� ����
			msg = "ȯ���մϴ�. "+ member.getAddr()+"�� ��� "+ member.getAge()+ "�� �ǽô� " + member.getName() +"��";
		} else if (map.get("id").equals(id) && !map.get("password").equals(password)) {
			msg = "��й�ȣ�� �ٸ��ϴ�. �ٽ� �Է����ּ���.";
		} else {
			msg = "�Է��Ͻ� ID�� �������� �ʰų� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.";
		}
		
		return msg;
	}

}
