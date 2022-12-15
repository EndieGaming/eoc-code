import java.util.Scanner;
import java.util.Random;
public class Player{
    String name = "";
    int chips;
    Gameboard board = new Gameboard();
    int gameWins;
    public int posGameboard(){
        return board.posGameboard();
    }
    public boolean backDownTF(){
        return board.backDownTF();
    }
    public Player(String _name){
        name = _name;
        gameWins = 0;
    }
    
    public void addWin(){
        gameWins++;
    }
    
    public void displayWins(){
        System.out.println(name +" has "+ gameWins+" wins.");
    }
    
    public String printBoard(){
        return board.toString();
    }

    public void takeTurn(){
        Die die1 = new Die(6);
        board.takeTurn(this, die1.Roll(), die1.Roll(), die1.Roll());
    }
    
    public void restartGame(){
        board.restartGame();
    }
    
    public String toString(){
        return name;
    }

    public void setName(String s){
        this.name = s;
    }
}