package snakeladder;
import java.util.* ;
public class SnakeLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Board Size:");
        int n = sc.nextInt();
        int [][] board= new int [n][n];
        int value=0;
        for(int i=n-1;i>=0;i--){
            if(i%2!=0) {
                for (int j = 0; j < n; j++)
                    board[i][j] = ++value;
            }
            else {
                for (int j = n - 1; j >= 0; j--)
                    board[i][j] = ++value;
            }
        }
        System.out.println("Enter the number of rolls:");
        int num_rolls = sc.nextInt();
        System.out.println("Enter the value of dice:");
        int [] dice= new int [num_rolls];
        int place=0;
        for(int i=0;i<num_rolls;i++){
            dice [i]=sc.nextInt();
            place +=dice[i];
            if(place==20)
                place=59;
           else if(place==25)
                place=37;
            else if (place ==47)
                place = 88;
            else if(place ==60)
                place = 80;
            else if(place == 64)
            place = 96;
            else if (place ==38 )
                place = 8;
            else if (place == 50)
                place = 29 ;
            else if (place == 65)
                place = 46;
            else if (place == 92)
                place = 16;
            else if (place == 98 )
                place = 44 ;
            else if (place ==100) {
                System.out.println("You Won The Game ");
                System.exit(0);
            }
            else if (place >100)
                place = place - dice [i];
        }
        System.out.println("You was now in: "+ place);
        for (int i=0;i<n;i++){
            for(int  j=0;j<n;j++){
                if(board[i][j]==place)
                    System.out.println("your place on board is : (" + i +","+j + ")" );
            }
        }
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == place)
                    System.out.print("X ");
                else
                    System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
    }
}
