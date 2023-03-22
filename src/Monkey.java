import java.util.Random;
public class Monkey implements Player{

    Monkey()
    {

    }
    @Override
    public int show()
    {
        Random generator;
        generator=new Random();
        int answer;
        answer= generator.nextInt(3)+1;
        return answer;
    }
}
