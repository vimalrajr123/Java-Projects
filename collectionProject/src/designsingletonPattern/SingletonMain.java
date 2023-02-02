package designsingletonPattern;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				SingletonPattern s1 = SingletonPattern.getobj();
				
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				SingletonPattern s2 = SingletonPattern.getobj();
				
			}
		});
		
		t1.start();
		t2.start();

	}

}
