//represents parrot
import java.util.Random;

public class Parrot implements Player{
    Parrot() {} //empty constructor

    //parrot randomly shows stone or paper
    @Override
    public Option show()
    {
        Random generator;
        generator=new Random();
        int rand;
        rand= generator.nextInt(2)+1;

        Option answer;
        switch(rand)
        {
            case 1:
                answer=Option.PAPER;
                break;
            case 2:
                answer=Option.STONE;
                break;
            default:
                answer=Option.NONE;
                break;
        }

        return answer;
    }

    public Gamer get_name()
    {
        return Gamer.PARROT;
    } //returns name
}
