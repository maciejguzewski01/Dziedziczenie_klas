//Judge is responsible for playing the game and presenting info about it
public class Judge {
    private Player player1;
    private Player player2;

    private Gamer winner;

    private Option option1;
    private Option option2;

    Judge(Player g1, Player g2) //constructor
    {
        player1= g1;
        player2=g2;
        option1=Option.NONE;
        option2=Option.NONE;
        winner=Gamer.ANY;
    }

    //manage the game
    public void play()
    {
        boolean over=false;
        int answer=-1;

        while(over==false)
        {
            Option p1=player1.show();
            Option p2=player2.show();

            if(p1==p2) continue; //I made assumption that game always has to end with result other than draw
            //warning- it means that two donkeys will play forever
            over=true;
            switch(p1){
                case PAPER:
                    if(p2==Option.SCISSORS) answer=2;
                    else if(p2==Option.STONE) answer=1;
                    break;
                case SCISSORS:
                    if(p2==Option.PAPER) answer=1;
                    else if(p2==Option.STONE) answer=2;
                    break;
                case STONE:
                    if(p2==Option.PAPER) answer=2;
                    else if(p2==Option.SCISSORS) answer=1;
                    break;
            }
            option1=p1;
            option2=p2;
        }

        winner=who_won(answer);

    }


   //checks who have won
   private Gamer who_won(int number)
   {
       Gamer answer=Gamer.ANY;
       if(number==1)
       {
               answer=player1.get_name();
       }
       else if(number==2)
       {
           answer=player2.get_name();
       }

       return answer;
   }

   public Option getOption1()
   {
       return option1;
   } //returns option chosen by player 1

    public Option getOption2()
    {
        return option2;
    } //returns option chosen by player 2

    public Gamer getPlayer1()
    {
        return player1.get_name();
    } //returns name of player 1

    public Gamer getPlayer2()
    {
        return player2.get_name();
    }//returns name of player 2

    public Gamer getWinner()
    {
        return winner;
    }//returns name of winner

    //displays info about the game
    public void info()
    {
        System.out.println("Player 1: "+player1.get_name()+", player 2: "+player2.get_name());
        System.out.println("Move 1:"+option1+", move 2: "+option2);
        System.out.println("Winner: "+winner);
    }
}
