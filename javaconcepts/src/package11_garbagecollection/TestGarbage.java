package package11_garbagecollection;

public class TestGarbage {
	
	public void finalize() {
		System.out.println("object is garbage collected");
	}
	
	public static void main(String args[]) {
		TestGarbage g1 = new TestGarbage();
		TestGarbage g2 = new TestGarbage();
		g1 = null;
		g2 = null;
		System.out.println();
		System.gc();
	}
}
