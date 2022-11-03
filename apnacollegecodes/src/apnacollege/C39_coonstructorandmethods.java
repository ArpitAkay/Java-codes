package apnacollege;
public class C39_coonstructorandmethods {
    int age;
    public C39_coonstructorandmethods(int age){
        this.age = age;
    }
    public void getvalue(){
        System.out.println("Age is " + age);
    }
    public static void main(String args[]){
        C39_coonstructorandmethods obj = new C39_coonstructorandmethods(22);
        obj.getvalue();
    }
}
