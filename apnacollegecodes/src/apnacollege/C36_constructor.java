package apnacollege;
public class C36_constructor {
    int age;
    String name;

    public C36_constructor(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void get_value(){
        System.out.println("Age is " + age);
        System.out.println("Name is " + name);
    }
    public static void main(String args[]){
        C36_constructor obj1 = new C36_constructor(22, "Arpit Kumar");
        C36_constructor obj2 = new C36_constructor(21, "Ayush Agarwal");
        obj1.get_value();
        obj2.get_value();
    }
}