import java.util.Random;
public class Die{
    private int max;
    int num;
    Random rand = new Random();
    public Die(int max){
        this.max = max;
    }
    public int Roll(){
        int num = (int)(Math.random()*max)+1;
        this.num=num;
        return num;
    }
    public String toString(){
        return "dice roll is "+num;
    }
}
