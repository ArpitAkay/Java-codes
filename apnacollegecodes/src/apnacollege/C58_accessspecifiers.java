package apnacollege;
class One {
	protected int a =20;
}

class Two{
	One o = new One();
	public void printvalue() {
		System.out.println(o.a);
	}
}


public class C58_accessspecifiers {
	public static void main(String args[]) {
		Two t = new Two();
		t.printvalue();
	}
}
