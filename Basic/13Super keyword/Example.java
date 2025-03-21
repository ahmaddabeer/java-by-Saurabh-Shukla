class A
{
    public void f1()
    {

    }
}

class B extends A
{

    public void f1()
    {
        super.f1();
    }
}

class Example 
{
    public static void main (String []args){
        B obj = new B();
        obj.f1;
    }
}