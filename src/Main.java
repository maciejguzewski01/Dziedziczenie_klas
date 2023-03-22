public class Main
{
    public static void test()
    {
        Donkey d;
        d=new Donkey();
        Monkey m;
        m= new Monkey();
        Parrot p;
        p= new Parrot();

        System.out.println("Donkey"+d.show());
        System.out.println("Donkey"+d.show());
        System.out.println("Donkey"+d.show());
        System.out.println("Monkey"+m.show());
        System.out.println("Monkey"+m.show());
        System.out.println("Monkey"+m.show());
        System.out.println("Parrot"+p.show());
        System.out.println("Parrot"+p.show());
        System.out.println("Parrot"+p.show());
    }

    public static void play()
    {
        Donkey d;
        d=new Donkey();
        Monkey m;
        m= new Monkey();
        Parrot p;
        p= new Parrot();
        Judge j;
        j=new Judge(d,m);
        int win=j.play();
        System.out.println(win);
    }
    public static void main(String [] args)
    {
        //test();
        play();


    }
}
