import java.util.Random;

public class Parrot implements Player{
    Parrot()
    {

    }
    @Override
    public int show()
    {
        Random generator;
        generator=new Random();
        int answer;
        answer= generator.nextInt(2)+1;
        return answer;
    }
}
