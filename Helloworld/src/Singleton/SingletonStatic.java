package Singleton;

class SingletonClass {
	private static SingletonClass SINGLE_INSTANCE = null;

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		if (SINGLE_INSTANCE == null) {
			synchronized (SingletonClass.class) {
				SINGLE_INSTANCE = new SingletonClass();
			}
		}
		return SINGLE_INSTANCE;
	}
}

class SingletonStatic {

	public static void main(String[] args) {

		SingletonClass c = SingletonClass.getInstance();
		SingletonClass c1 = SingletonClass.getInstance();

		System.out.println(c);
		System.out.println(c1);
	}
}