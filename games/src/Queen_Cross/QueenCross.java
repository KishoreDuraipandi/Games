package Queen_Cross;

import java.util.Scanner;
//program to place the queen in chess board with out cross each other
public class QueenCross {
    public  static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                if (z == j)
                    System.out.print("Q ");
                else {
                    System.out.print("- ");
                }
            }
                if  ((z==n-1 || z==n-2)&&i!=n-1)
                    z=0;
                else if(z>n-2)
                    z=z-n;
                else
                    z+=2;
            System.out.println();
        }
    }
}

