import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Player[] Players;
        Die die1 = new Die(6);
        boolean gameOver = false;
        Scanner s = new Scanner(System.in);
        System.out.println("What is the number of players?: ");
        int playerNum = s.nextInt();
        Players = new Player[playerNum];
        for(int i =0; i < playerNum; i++) {
            System.out.println("What is the name for player " + (i+1) + ": ");
            Players[i] = new Player(scan.nextLine());
        }

        while (!gameOver){
            for(int i = 0; i<playerNum; i++){
                System.out.println(Players[i].toString() + "'s turn.");
                System.out.println(Players[i].toString() + "'s board: "+ Players[i].printBoard());
                Players[i].takeTurn();
                System.out.println(Players[i].toString() + "'s board now: "+ Players[i].printBoard());
                if (Players[i].backDownTF()&&Players[i].posGameboard()==0){
                    gameOver=true;
                    Players[i].addWin();
                    System.out.println(Players[i].toString()+" won!");
                    break;
                }
            }
            if(gameOver == true){
                System.out.println("Do you want to play again? type true to continue");
                String playAgain = s.next();
                if(playAgain.equals("true")){
                    for (int i = 0; i<playerNum; i++){
                        Players[i].restartGame();
                    }
                    gameOver = false;
                }else{
                    gameOver = true;
                }
            }
        }
    }
}
