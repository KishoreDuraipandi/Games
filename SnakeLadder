package snakeladder;
import java.util.* ;
public class SLMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 10*10 board creation
        // value is the place in the board
        Random random =new Random();
       int [][] board= new int [10][10];
        int value=0;
        for(int i=9;i>=0;i--){
            if(i%2!=0) {
                for (int j = 0; j < 10; j++)
                    board[i][j] = ++value;
            }
            else {
                for (int j = 9; j >= 0; j--)
                    board[i][j] = ++value;
            }
        }
        System.out.println("Enter the value of dice:");
        int input=0;
        //The game starts with 1 so the game will start when the dice give the value of 1
        // input = dice value
        
        while (input!=1) {
        	char chr = sc.next().charAt(0);
        	if(chr=='x') {
        	input =random.nextInt(6)+1 ;
        	if(input!=1)
        		System.out.println(input);
            System.out.println();
        	System.out.println("Re enter the value of dice:");
        	}
        }
        System.out.println();
        System.out.println(input);
        System.out.println();
        System.out.println("Lets Start the game:");
        
        int place=1;
        //Starting with 1 
        // the will go until win  or reach  the place 100
        while(input!=100) {
        	System.out.println("Enter the dice value:");
        	char chr = sc.next().charAt(0);
        	if(chr=='x') 
        	input =random.nextInt(6)+1 ;
        	System.out.println(input);
            System.out.println();
        	place +=input;
            if(place==20) {
                place=59;
                System.out.println("Wow...you got ladder");
                System.out.println();

            }
           else if(place==25) {
                place=37;
                System.out.println("Wow...you got ladder");
                System.out.println();

           }
            else if (place ==47) {
                place = 88;
                System.out.println("Wow...you got ladder");
                System.out.println();

            }
            else if(place ==60) {
                place = 80;
                System.out.println("Wow...you got ladder");
                System.out.println();

            }
            else if(place == 64) {
            place = 96;
            System.out.println("Wow...you got ladder");
            System.out.println();

            }
            else if (place ==38 ) {
                place = 8;
                System.out.println("Ooops !!!! The snake bites you");
                System.out.println();
            }
            else if (place == 50) {
                place = 29 ;
                System.out.println("Ooops !!!! The snake bites you");
                System.out.println();

            }
            else if (place == 65) {
                place = 46;
                System.out.println("Ooops !!!! The snake bites you");
                System.out.println();

            }
            else if (place == 92) {
                place = 16;
                System.out.println("Ooops !!!! The snake bites you");
                System.out.println();

            }
            else if (place == 98 ) {
                place = 44 ;
                System.out.println("Ooops !!!! The snake bites you");   
                System.out.println();

            }
            else if (place ==100) {
                System.out.println("Congrats $$ You Won The Game ");
                System.out.println();

                System.exit(0);
            }
            else if (place >100)
                place = place - input;
        for (int i=0;i<10;i++) {
            for (int j = 0; j < 10; j++) {
                if (board[i][j] == place)
                    System.out.print("X ");
                else
                    System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("You are now on the place "+ place);
        System.out.println();

        }
    }
}
