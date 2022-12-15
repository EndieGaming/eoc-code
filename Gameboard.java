import java.util.Scanner;
import java.util.Random;
public class Gameboard{
    boolean[] board = new boolean[12];
    int position;
    boolean backDown = false;
    public Gameboard(){
        position = 0;
        for(int i = 0; i < 12; i++){
            board[i] = false;
        }
    }
    
    public void restartGame(){
        backDown = false;
        position = 0;
    }
    
    public int posGameboard(){
        return position;
    }
    public boolean backDownTF(){
        return backDown;
    }
    public void takeTurn(Player player, int roll1, int roll2, int roll3){
        System.out.println(player + " rolled " + roll1 + ", " + roll2 + ", and " + roll3);
        for(int i = position; backDown == false;){
            if(roll1 == i+1||roll2 == i+1||roll3 == i+1){
                board[i] = true;
                i++;
                
                if(position == 12){
                    break;
                }
            }else if (roll1+roll2 == i+1){
                board[i] = true;
                i++;
                
                if(position == 12){
                    break;
                }
            }else if (roll2+roll3 == i+1){
                board[i] = true;
                i++;
                if(position == 12){
                    break;
                }
            }else if (roll1+roll3 == i+1){
                board[i] = true;
                i++;
                if(position == 12){
                    break;
                }
            }else if (roll1+roll2+roll3 == i+1){
                if(position == 12){
                    break;
                }
                board[i] = true;
                i++;
                if(position == 12){
                    break;
                }
            }else if (i==12){
                backDown = true;
            }else{
                position=i;
                break;
            }
        }
        for(int i = position; backDown == true;){
            if(roll1 == i+1||roll2 == i+1||roll3 == i+1){
                board[i] = false;
                i--;

                if(position == 0){
                    break;
                }
            }else if (roll1+roll2 == i+1){
                board[i] = false;
                i--;
 
                if(position == 0){
                    break;
                }
            }else if (roll2+roll3 == i+1){
                board[i] = false;
                i--;

                if(position == 0){
                    break;
                }
            }else if (roll1+roll3 == i+1){
                board[i] = false;
                i--;
                if(position == 0){
                    break;
                }
            }else if (roll1+roll2+roll3 == i+1){
                board[i] = false;
                i--;
                if(position == 0){
                    break;
                }
            }else{
                break;
            }
            position=i;
        }

    }

    public String toString(){
        String boardp = "";
        for(int i = 0; i<12; i++){
            if (board[i]){
                boardp+= i+1 + " [*] ";
            }else{
                boardp+= i+1 + " [ ] ";
            }
        }
        return boardp;
    }
}