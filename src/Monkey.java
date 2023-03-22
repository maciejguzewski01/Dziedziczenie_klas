//represents monkey

import java.util.Random;
public class Monkey implements Player{

    Monkey() { } //empty constructor
    @Override

    //monkey shows randomly one of option
    public Option show()
    {
        Random generator;
        generator=new Random();
        int rand;
        Option answer;

        rand= generator.nextInt(3)+1;
        switch(rand)
        {
            case 1:
                answer=Option.PAPER;
                break;
            case 2:
                answer=Option.STONE;
                break;
            case 3:
                answer=Option.SCISSORS;
                break;
            default:
                answer=Option.NONE;
                break;
        }
        return answer;
    }

    @Override
    public Gamer get_name() { return Gamer.MONKEY; } //returns name
}
