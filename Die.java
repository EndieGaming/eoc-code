import java.util.Random;
public class Die{
    private int max;
    int num;
    public Die(int max){
        this.max = max;
        Random rand = new Random();
    }
    public int Roll(){
        int num = (int)(Math.random()*max)+1;
        this.num=num;
        return num;
    }
    public int rollRn(){
        return num;
    }
}
