import java.util.Scanner;
import java.util.Random;
public class Player{
    String name = "";
    int chips;
    Martinetti board = new Martinetti();
    int gameWins;
    public Player(String _name){
        name = _name;
        gameWins = 0;
    }
    public int posGameboard(){
        return board.posGameboard();
    }
    public boolean backDownTF(){
        return board.backDownTF();
    }
    
        
    public boolean boardi(int i){
        return board.boardi(i);
    }

    public void addWin(){
        gameWins++;
    }
    
    public void displayWins(){
        System.out.println(name +" has "+ gameWins+" win(s)!");
    }
    
    public String printBoard(){
        return board.toString();
    }

    public void simulateGame(){
        Die die1 = new Die(6);
        board.simulateGame(this, die1.Roll(), die1.Roll(), die1.Roll());
    }
    
    public void restartGame(){
        board.restartGame();
    }
    
    public String Name(){
        return name;
    }
    
    public String toString(){
        return name+" has "+gameWins;
    }

    public void setName(String s){
        this.name = s;
    }
}