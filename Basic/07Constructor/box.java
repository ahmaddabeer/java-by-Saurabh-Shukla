public class box{


    private int l,b,h;

    public box(){//this is constructor 

        l=20;b=44;h=66;
    }

    public static void main(String []args){

        box b1 = new box();

        System.out.println("l = "+b1.l);
        System.out.println("b = "+b1.b);
        System.out.println("h = "+b1.h);
    }

}