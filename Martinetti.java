import java.util.Scanner;
import java.util.Random;
public class Martinetti{
    boolean[] board = new boolean[12];
    int position;
    boolean backDown = false;
    public Martinetti(){
        position = 0;
        for(int i = 0; i < 12; i++){
            board[i] = false;
        }
    }
    
    public boolean boardi(int i){
        return board[i];
    }
    
    public void restartGame(){
        for(int i = 0; i < 12; i++){
            board[i] = false;
        }
        backDown = false;
        position = 0;
    }
    
    public int posGameboard(){
        return position;
    }
    public boolean backDownTF(){
        return backDown;
    }
    public void simulateGame(Player player, int roll1, int roll2, int roll3){
        System.out.println(player.Name() + " rolled " + roll1 + ", " + roll2 + ", and " + roll3);
        System.out.println(player.Name()+ " is at " + position);
        for(int i = position; backDown == false;){
            if(roll1 == i+1||roll2 == i+1||roll3 == i+1){
                board[i] = true;
                i++;
                if(position >= 11&&board[11]==true){
                    position = 11;
                    break;
                }
            }else if (roll1+roll2 == i+1){
                board[i] = true;
                i++;
                if(position >= 11&&board[11]==true){
                    position = 11;
                    break;
                }
            }else if (roll2+roll3 == i+1){
                board[i] = true;
                i++;
                if(position >= 11&&board[11]==true){
                    position = 11;
                    break;
                }
            }else if (roll1+roll3 == i+1){
                board[i] = true;
                i++;
                if(position >= 11&&board[11]==true){
                    position = 11;
                    break;
                }
            }else if (roll1+roll2+roll3 == i+1){
                position = 11;
                board[i] = true;
                i++;
                if(position >= 11&&board[11]==true){
                    position = 11;
                    break;
                }
            }else{
                position=i;
                break;
            }
        }
        
        for(int i = position; backDown == true;){
            if(roll1 == i+1||roll2 == i+1||roll3 == i+1){
                board[i] = false;
                i--;
            }else if (roll1+roll2 == i+1){
                board[i] = false;
                i--;
            }else if (roll2+roll3 == i+1){
                board[i] = false;
                i--;
            }else if (roll1+roll3 == i+1){
                board[i] = false;
                i--;
            }else if (roll1+roll2+roll3 == i+1){
                if (i==12){
                    i = 11;
                }
                board[i] = false;
                i--;
            }else{
                position=i;
                break;
            }
        }
        if (board[11] == true){
            backDown = true;
        }
        System.out.println(player.Name()+ " is at " + position);
    }

    public String toString(){
        String boardp = "";
        for(int i = 0; i<12; i++){
            int ip = i+1;
            if (board[i]){
                boardp+= "\n"+ ip + "-[X] "+"\n";
            }else{
                boardp+= "\n"+ ip + "-[ ] "+"\n";
            }
        }
        return boardp;
    }
}