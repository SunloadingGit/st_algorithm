package algorithm.Singleton;

public class Singleton3 {
	private static class SingletonHolder{
		private static final Singleton3 Instance = new Singleton3();
	}
	private Singleton3() {}
	public static Singleton3 getInstance() {
		return SingletonHolder.Instance;
	}
}
