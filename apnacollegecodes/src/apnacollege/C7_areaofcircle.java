package apnacollege;
import java.util.*;

public class C7_areaofcircle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float r;
        System.out.print("Enter the radius of a circle : ");
        r = sc.nextFloat();
        final float pi = 3.14f;
        float a;
        a = pi * r * r;
        System.out.println("Area of a circle is = " + a);
        sc.close();
    }
}