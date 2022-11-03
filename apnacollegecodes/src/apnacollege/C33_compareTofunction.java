package apnacollege;
//Strings

import java.util.*;

public class C33_compareTofunction {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String firstname = "Arpit";
        String lastname = "Kumar";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());
        for(int i=0; i<fullname.length(); i++){
            System.out.print(fullname.charAt(i) + " ");
        }
        System.out.println();
        String fullname2 = "Arpit kumar";
        if(fullname.compareTo(fullname2) == 0){
            System.out.println("Equals");
        }
        else if(fullname.compareTo(fullname2) > 0){
            System.out.println(fullname + " is greater than " + fullname2);
        }
        else{
            System.out.println(fullname + " is less than " + fullname2);
        }
        String sentence = "Arpit is a good";
        String str = sentence.substring(11,15);
        System.out.println(str);
        sc.close();
    }
}
