package stack;

public class StackMain {
	public static void main(String[] args) {
		Stack stack = new StackImpl(3);
		stack.push("ȫ�浿");
		stack.push("������");
		stack.push("�̼���");
		
		System.out.println(stack.pop());
		System.out.println(stack.size());
		
	}
}
