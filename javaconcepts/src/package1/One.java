package package1;

import package2.Two;

class child extends Two {
	public void childfunc() {
		protectedfunc();
	}
}

class anothercls {
	public void function() {
		
	}
	void b() {
		function();
	}
}

public class One {
	public static void main(String args[]) {
		Two t2 = new Two();
//		t2.privatefunc();
		t2.publicfunc();
//		t2.protectedfunc();
//		t2.defaultfunc();	
		
		child c = new child();
		c.childfunc();
		anothercls obj = new anothercls();
		obj.function();
	}
	
}
