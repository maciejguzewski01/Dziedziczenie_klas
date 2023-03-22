//0- Donkey, 1-Monkey, 2-Parrot
public class Judge {
    private Player player1;
    private Player player2;
    Judge(Player g1, Player g2)
    {
        player1= g1;
        player2=g2;
    }

    public int play()
    {
        boolean winner=false;
        int answer=-1;
        while(winner==false)
        {
            int p1=player1.show();
            int p2=player2.show();


            if(p1==p2) continue;
            //1- paper, 2-scissors, 3- stone
            winner=true;
            switch(p1){
                case 1:
                    if(p2==2) answer=2;
                    else if(p2==3) answer=1;
                    break;
                case 2:
                    if(p2==1) answer=1;
                    else if(p2==3) answer=2;
                    break;
                case 3:
                    if(p2==1) answer=2;
                    else if(p2==2) answer=1;
                    break;
            }
           /* if((p1==1)&&(p2==2)) answer=2;
            else if((p1==2)&&(p2==1)) answer=1;
            else if((p1==1)&&(p2==3)) answer=1;
            else if((p1==3)&&(p2==1)) answer=2;
            else if((p1==2)&&(p2==3)) answer=2;
            else if((p1==3)&&(p2==2)) answer=1;
*/
        }
        return answer;
    }


}
