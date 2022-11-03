package apnacollege;
//2D Array

import java.util.*;

public class C32_2Darrayquestion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row;
        row =  sc.nextInt();
        System.out.print("Enter number of columns : ");
        int col;
        col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter the array : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the number to seach : ");
        int num;
        num = sc.nextInt();
        System.out.println("Your array : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j] == num){
                    System.out.println(i + " " + j);
                    System.out.println(arr[i][j]);
                }   
            }
        }
        sc.close();
    }
}