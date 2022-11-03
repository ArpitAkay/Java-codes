package apnacollege;
//2D matrixay

import java.util.*;

public class C59_2Darray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row;
        row =  sc.nextInt();
        System.out.print("Enter number of columns : ");
        int col;
        col = sc.nextInt();
        int matrix[][] = new int[row][col];
        System.out.println("Enter the array : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println(matrix.length);
        
        for(int i = 0; i < matrix[0].length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println("Your array : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        
        for(int[] rowOfStrings : matrix) {
            for(int s : rowOfStrings) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}