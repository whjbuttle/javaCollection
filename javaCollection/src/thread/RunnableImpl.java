package thread;

public class RunnableImpl implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			// Thread �� �����带 ������ Ŭ�����̴�.
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}
