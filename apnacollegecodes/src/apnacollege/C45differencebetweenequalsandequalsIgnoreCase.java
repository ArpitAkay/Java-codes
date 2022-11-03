package apnacollege;
public class C45differencebetweenequalsandequalsIgnoreCase {
	public static void main(String args[]) {
		String str1 = "Arpit Kumar";
		String str2 = "Aditya Kumar";
		System.out.println(str1.length());
		System.out.println(str2.length());
		
		String str;
		str = str1.concat(str2);
		System.out.println(str);
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str1.indexOf('K'));
		
		System.out.println(str1.charAt(0));
		
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
	}
}