package Pattersn_Questions;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the row:");
//        int n=input.nextInt();
        int n=5;
        pattern_12(7,3);
    }

    private static void pattern_alpha(int n) {
        int num=1;
        for( int row=1;row<=n;row++){
            if(row%2!=0){
                num=num+row-1;
                for(int col =1;col<=row;col++){
                    System.out.print(num+" ");
                    num=num+1;
                }
            }

            if(row%2==0){
                num=num+row-1;
                for(int col =1;col<=row;col++){
                    System.out.print(num+" ");
                    num=num-1;
                }

            }

            System.out.println();
        }
    }

    private static void pattern_1(int n) {
        for(int row = 0; row <n; row++){
            for (int col = 1; col <=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern_2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++)
                System.out.print("* ");
            System.out.println();
        }
    }
    private static void pattern_3(int n){
        for(int i=0;i<n;i++){
            for(int col=n-i;col>0;col--)
                System.out.print("* ");
            System.out.println();
        }
    }
    private static void pattern_4(int n) {
        for (int i = 0; i <=n; i++) {
            for (int col = 0; col < i; col++)
                System.out.print(col+1+" ");
            System.out.println();
        }
    }
    private static void pattern_5(int n){
        for (int row = 0; row < 2*n; row++) {
            int star=row<n-1?row:2*n-row-2;
            for (int col = 0; col <= star; col++)
                System.out.print("* ");
            System.out.println();
        }
    }
    private static void pattern_6(int n){
        for(int i=0;i<n;i++){
//            int limit=i;
            for(int space=0;space<=i;space++)
                System.out.print(" ");
            for(int col=0;col<n-i;col++)
                System.out.print("*");
            System.out.println();
        }

    }
    private static void pattern_7(int n){
        for(int row=0;row<n;row++){
            for(int space=0;space<n-row-1;space++)
                System.out.print(" ");
            for(int col=0;col<row*2+1;col++)
                System.out.print("*");
            System.out.println();
        }
    }
    private static void pattern_8(int n){
        for(int row=0;row<n;row++) {
            for (int space = 0; space < row; space++)
                System.out.print(" ");
            for(int col=0;col<2*(n-row)-1;col++)
                System.out.print("*");
            System.out.println();
        }
    }
    private static void pattern_9(int n){
        for(int row = 0; row <=n; row++) {
            for (int space = 0; space <= n - 1 - row; space++)
                System.out.print(" ");
            for (int col = 0; col < row; col++)
                System.out.print("* ");
            System.out.println();
        }
    }
    private static void pattern_10(int n){
        for(int row = 0; row <=n; row++) {
            for (int space = 0; space <= row; space++)
                System.out.print(" ");
            for (int col = 0; col <n- row; col++)
                System.out.print("* ");
            System.out.println();
        }
    }
    private static void pattern_11(int n){
        for(int row=0;row<2*n-1;row++){
            int space= row<n ? row :2*n-row-2;
            int star=row<n?n-row:row-3;
                for (int s = 0; s<space; s++)
                    System.out.print(" ");
                for(int col=0;col<star;col++)
                    System.out.print("* ");
                System.out.println();
            }
        }
    private static void pattern_12(int row,int col ){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int fromLeft=j+1;
                int fromTop=i+1;
                int fromRight=col-j;
                int fromBottom=row-i;
                int value=Math.min(Math.min(fromBottom,fromTop),Math.min(fromLeft,fromRight));
                if(value%2!=0){
                    System.out.print("X ");
                }else{
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }







}



