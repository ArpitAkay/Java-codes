package apnacollege;
public class C42_object {
    String species;
    public C42_object(String speciesOfBear) {
      species = speciesOfBear;
    }
    private void getvalue() {
    	System.out.println("Species : " + species);
    }
   
    public static void main(String[] args) {
      C42_object baloo = new C42_object("Sloth bear"); 
      System.out.println(baloo); // Prints: Bear@4517d9a3
      baloo.getvalue();
      // set object to null
      baloo = null;
      System.out.println(baloo); // Prints: null
    }
  }