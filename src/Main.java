/*
Maciej Gużewski 259656
Programowanie w języku Java lab
22.03.2023
Dziedziczenie klas- gra w "papier, kamień, nożyce"
 */

public class Main
{

    //tests parrot, donkey and monkey
    public static void test()
    {
        Donkey d;
        d=new Donkey();
        Monkey m;
        m= new Monkey();
        Parrot p;
        p= new Parrot();
/*
        System.out.println("Donkey "+d.show());
        System.out.println("Donkey "+d.show());
        System.out.println("Donkey "+d.show());
        System.out.println("Monkey "+m.show());
        System.out.println("Monkey "+m.show());
        System.out.println("Monkey "+m.show());
        System.out.println("Parrot "+p.show());
        System.out.println("Parrot "+p.show());
        System.out.println("Parrot "+p.show());
  */
        for(int i=0;i<100;++i)
        {
            System.out.println("Parrot "+p.show());
        }
    }

    //tests playing
    public static void play()
    {
        Donkey d;
        d=new Donkey();
        Monkey m;
        m= new Monkey();
         Parrot p;
        p= new Parrot();
        Judge j;
        j=new Judge(d,p);
       // j.info();
        j.play();
      //  j.info();
        j.play();
      //  j.info();

        for(int i=0;i<1000;++i)
        {
            j.play();
            //j.info();
        }
    }

    //makes simulation
  public static void simulation()
  {
      Simulation s;
      s=new Simulation();
      s.make_simulation();
  }
    public static void main(String [] args)
    {
        //test();
       //play();
       // simulation();


    }
}
