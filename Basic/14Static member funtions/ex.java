class parent 
{
    public static void f1()
    {System.out.println("helo");}


}

class child extends parent
{


}

public class ex
{

    public static void main(String[]args){
        child.f1();
    }
}