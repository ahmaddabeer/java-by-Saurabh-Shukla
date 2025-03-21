class parent {
    public static void f1() {

        System.out.println("helo");

    }
}

class child extends parent {

    public static void f1() {

        System.out.println("you man");
    }
}


public class functionHiding

{

    public static void main(String []args){

        child.f1();
    }
}