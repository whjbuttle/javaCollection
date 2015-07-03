package thread;

public class AtmMain {
	public static void main(String[] args) {
		Atm atm = new Atm();
		
		Runnable hong = new AtmUser(atm, "ȫ�浿");
		Runnable kim = new AtmUser(atm, "������");
		Runnable lee = new AtmUser(atm, "�̼���");
		
		Thread thr1 = new Thread(hong);
		thr1.start();
		
		Thread thr2 = new Thread(kim);
		thr2.start();
		Thread thr3 = new Thread(lee);
		thr3.start();
	}
}
