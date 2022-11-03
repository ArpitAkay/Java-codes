package apnacollege;
public class C35_classesandobject {
    int age;
    String name;

    public void set_value(){
        age = 22;
        name = "Arpit Kumar";
    }

    public void get_value(){
        System.out.println("Age is " + age);
        System.out.println("Name is " + name);
    }
    public static void main(String args[]){
        C35_classesandobject obj = new C35_classesandobject();
        obj.set_value();
        obj.get_value();
    }
}