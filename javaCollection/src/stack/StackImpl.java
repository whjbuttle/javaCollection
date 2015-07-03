package stack;

public class StackImpl implements Stack{
	/*
	 �ڷᱸ���� �ڵ��� ���� �������̽��� �����ϸ鼭 �ݵ�� 
	 �޼ҵ尡 �������� ó���� ���� �δ� �迭�̳� �ڷᱸ���� �ʵ忡 �ξ�� �Ѵ�
	 */
	
	private Object[] objects;	// �ʵ忡 Object Ÿ���� �迭����
	private int pointer;
	
	public StackImpl() {
		this(10);
	}
	
	public StackImpl(int capacity) {
		objects = new Object[capacity];	// �迭�� �����ϴµ� �ּ��� �ణ�� �������� ����
		pointer = 0;					// �ε��� �ʱ�ȭ�� 0����
	}

	@Override
	public void push(Object obj) {
		if (isFull()) {
			System.out.println("���� �뷮�� �ʰ��Ͽ����ϴ�.");
			// ������ �� > �찡 �ƴ϶� �� > ������ ���̴� ����
		} else {
			objects[pointer++] = obj;
		}
	}

	@Override
	public Object pop() {
		if (isEmpty()) {
			System.out.println("���ÿ� ����� ��ü�� �����ϴ�.");
			return null;
		} else {
			Object obj = objects[--pointer];
			objects[pointer] = null;
			return obj;
		}
	}

	@Override
	public boolean isEmpty() {
		
		return pointer ==0;
	}

	@Override
	public boolean isFull() {
		return pointer == objects.length;
		// objects �� �迭�̹Ƿ� index ũ�Ⱚ�� ��Ÿ���� length ���
	}

	@Override
	public int size() {
		return pointer;
	}

}
