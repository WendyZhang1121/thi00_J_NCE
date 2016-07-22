package thi00_J_NCE;
public final class Foo implements Runnable { 
	
	@Override public void run() {
		// ... 
		System.out.println("Thread test");
		}
	
	public static void main(String[] args) { 
		
		Foo foo = new Foo();
		new Thread(foo).run();
	} 
}