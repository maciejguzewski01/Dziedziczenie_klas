//represents donkey
public class Donkey implements Player{

    Donkey() {} //empty constructor

    @Override
    public Option show()
    {
        return Option.STONE;
    } //donkey always shows stone

    @Override
    public Gamer get_name() { return Gamer.DONKEY; } //returns name
}
