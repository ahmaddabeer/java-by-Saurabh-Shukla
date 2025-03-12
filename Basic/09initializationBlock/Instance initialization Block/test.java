public class test{
     
    private int x;
    {
        System.out.println("initialization Block :x = "+x);
        x = 5;
    }

    public test()
    {
        System.out.println("Constructor: x = "+x);
    }

    public static void main(String []args){

        test t1 = new test();
        test t2 = new test();
    }
}