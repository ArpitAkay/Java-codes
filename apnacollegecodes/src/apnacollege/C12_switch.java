package apnacollege;
import java.util.*;
public class C12_switch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int button;
        button = sc.nextInt();
        // if(button == 1){
        //     System.out.println("Hello");
        // }
        // else if(button == 2){
        //     System.out.println("Namaste");
        // }
        // else if(button == 3){
        //     System.out.println("Bonjour");
        // }
        // else{
        //     System.out.println("Please enter a valid input");
        // }
        switch(button){
            case 1 :
                System.out.println("Hello");
                break;
            case 2 :
                System.out.println("Namaste");
                break;
            case 3 :
                System.out.println("Bonjour");
                break;
            default : 
                System.out.println("Please enter a valid input");
        }
        sc.close();
    }
}