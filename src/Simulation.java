//makes 10000 simulations and displays results

public class Simulation {
    Simulation() { }; //empty constructor

    /*table
    0- first player wins
    1- second player wins
    2- num paper first player
    3- num scissor first player
    4- num stone first player
    5- num paper first player
    6- num scissor first player
    7- num stone first player
     */
    public void make_simulation() //main function that makes simulation
    {
        simulation_one(); //don-mon
        simulation_two(); //don-par
      simulation_three(); //mon-par

    }

    //simulation one donkey-monkey
private void simulation_one()
{
    int sim1[];
    sim1= new int[8];

    Donkey d;
    d=new Donkey();
    Monkey m;
    m= new Monkey();

    Judge j;
    j=new Judge(d,m);

    for(int i=0;i<10000;++i)
    {
        j.play();
        Gamer w=j.getWinner();
        if(w==Gamer.DONKEY) sim1[0]++;
        else sim1[1]++;

        Option o1,o2;
        o1=j.getOption1();
        o2=j.getOption2();
        switch(o1)
        {
            case PAPER:
                sim1[2]++;
                break;
            case SCISSORS:
                sim1[3]++;
                break;
            case STONE:
                sim1[4]++;
                break;
        }

        switch(o2)
        {
            case PAPER:
                sim1[5]++;
                break;
            case SCISSORS:
                sim1[6]++;
                break;
            case STONE:
                sim1[7]++;
                break;
        }
    }
    System.out.println("Donkey; WINS="+sim1[0]+", Paper="+sim1[2]+", Scissors="+sim1[3]+", Stone="+sim1[4]);
    System.out.println("Monkey; WINS="+sim1[1]+", Paper="+sim1[5]+", Scissors="+sim1[6]+", Stone="+sim1[7]);
    System.out.println();
}

    //simulation two donkey- parrot
    private void simulation_two()
    {
        int sim2[];
        sim2= new int[8];

        Donkey d;
        d=new Donkey();
        Parrot p;
        p= new Parrot();
        Judge j;
        j=new Judge(d,p);

        for(int i=0;i<10000;++i)
        {
            j.play();
            Gamer w=j.getWinner();
            if(w==Gamer.DONKEY) sim2[0]++;
            else sim2[1]++;

            Option o1,o2;
            o1=j.getOption1();
            o2=j.getOption2();
            switch(o1)
            {
                case PAPER:
                    sim2[2]++;
                    break;
                case SCISSORS:
                    sim2[3]++;
                    break;
                case STONE:
                    sim2[4]++;
                    break;
            }

            switch(o2)
            {
                case PAPER:
                    sim2[5]++;
                    break;
                case SCISSORS:
                    sim2[6]++;
                    break;
                case STONE:
                    sim2[7]++;
                    break;
            }
        }
        System.out.println("Donkey; WINS="+sim2[0]+", Paper="+sim2[2]+", Scissors="+sim2[3]+", Stone="+sim2[4]);
        System.out.println("Parrot; WINS="+sim2[1]+", Paper="+sim2[5]+", Scissors="+sim2[6]+", Stone="+sim2[7]);
        System.out.println();
    }

    //simulation two monkey- parrot
    private void simulation_three()
    {
        int sim3[];
        sim3= new int[8];

        Monkey m;
        m=new Monkey();
        Parrot p;
        p= new Parrot();
        Judge j;
        j=new Judge(m,p);

        for(int i=0;i<10000;++i)
        {
            j.play();
            Gamer w=j.getWinner();
            if(w==Gamer.MONKEY) sim3[0]++;
            else sim3[1]++;

            Option o1,o2;
            o1=j.getOption1();
            o2=j.getOption2();
            switch(o1)
            {
                case PAPER:
                    sim3[2]++;
                    break;
                case SCISSORS:
                    sim3[3]++;
                    break;
                case STONE:
                    sim3[4]++;
                    break;
            }

            switch(o2)
            {
                case PAPER:
                    sim3[5]++;
                    break;
                case SCISSORS:
                    sim3[6]++;
                    break;
                case STONE:
                    sim3[7]++;
                    break;
            }
        }
        System.out.println("Monkey; WINS="+sim3[0]+", Paper="+sim3[2]+", Scissors="+sim3[3]+", Stone="+sim3[4]);
        System.out.println("Parrot; WINS="+sim3[1]+", Paper="+sim3[5]+", Scissors="+sim3[6]+", Stone="+sim3[7]);
        System.out.println();
    }
}
