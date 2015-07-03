package stack;

public interface Stack {
	
	// ������ �ֻ����� ��ü�� �����Ѵ�
	public void push(Object obj);
	
	// ������ �ֻ����� ��ü�� �����ϸ鼭 �����´�
	public Object pop();
	
	// ������ ����ִ��� ���θ� ��ȯ�Ѵ�
	public boolean isEmpty();
	
	// ������ �� ���ִ��� ���θ� ��ȯ�Ѵ�
	public boolean isFull();
	
	// ������ ����� ��ü�� ���� ��ȯ�Ѵ�
	public int size();
}
