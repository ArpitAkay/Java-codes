package apnacollege;

import java.util.Optional;

public class C61_optionalclass {
	
	public String getMyDefault() {
	    System.out.println("Getting Default Value");
	    return "Default Value";
	}
	
	public static void main(String[] args) {
		Optional<String> empty = Optional.empty();
		System.out.println(empty.isPresent());
		System.out.println(empty.isEmpty());
		
		String name1 = "baeldung";
	    Optional<String> opt1 = Optional.of(name1);
	    System.out.println(opt1.isPresent());
	    System.out.println(opt1.isEmpty());
	    
//	    String name2 = null;		//the argument passed to the of() method can't be null. Otherwise, we'll get a NullPointerException:
//	    Optional.of(name2);
	    
	    String name3 = "baeldung";
	    Optional<String> opt2 = Optional.ofNullable(name3);
	    System.out.println(opt2.isPresent());
	    System.out.println(opt2.get());
	    
	    String name4 = null;
	    Optional<String> opt3 = Optional.ofNullable(name4);
	    System.out.println(opt3.isPresent());
//	    System.out.println(opt3.get());		gives exception java.util.NoSuchElementException
	    
	    Optional<String> opt4 = Optional.of("baeldung");
	    opt4.ifPresent(name5 -> System.out.println(name5.length()));
	    
	    String nullName1 = null;
	    String name5 = Optional.ofNullable(nullName1).orElse("john");
	    System.out.println(name5);
	    
	    String nullName2 = null;
	    String name6 = Optional.ofNullable(nullName2).orElseGet(() -> "john");
	    System.out.println(name6);
	    
//	    String text1 = null;
//
//	    String defaultText = Optional.ofNullable(text1).orElseGet(this::getMyDefault);
//	    System.out.println(defaultText);
//
//	    defaultText = Optional.ofNullable(text1).orElse(getMyDefault());
//	    System.out.println(defaultText);
	    
//		String text2 = "Text present";
//
//		System.out.println("Using orElseGet:");
//		String defaultText = Optional.ofNullable(text2).orElseGet(this::getMyDefault);
//		assertEquals("Text present", defaultText);
//
//		System.out.println("Using orElse:");
//		defaultText = Optional.ofNullable(text2).orElse(getMyDefault());
//		assertEquals("Text present", defaultText);
	}
}
