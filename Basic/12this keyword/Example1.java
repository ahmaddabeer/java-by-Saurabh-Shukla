class Box
{

    public void sendBox()
    {
        GiftTaker gf = new GiftTaker();
        gf.acceptGift(this);

    }
}

public class Example1

{

    public static void main(String []args)//static member function
    {

        b1.sendBox();
    }
}