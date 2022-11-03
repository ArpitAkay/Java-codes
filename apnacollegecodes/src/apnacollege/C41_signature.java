//The signature is 'C41_signature(String furType, boolean containsClaws)'.
package apnacollege;

public class C41_signature {
    String furType;
    boolean containsClaws;
    public C41_signature(String furType, boolean containsClaws){
        this.furType = furType;
        this.containsClaws = containsClaws;
    }

    public void getvalue(){
        System.out.println("Furtype : " + furType);
        System.out.println("Contains Claws : " + containsClaws);
    }
    public static void main(String args[]){
        C41_signature obj = new C41_signature("Long-Hairs", true);
        obj.getvalue();
    }
}
