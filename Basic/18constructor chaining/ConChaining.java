class A {

    public A() {

        System.out.println("A 1");

    }
}

class B extends A {

    public B() {

        System.out.println("B 1");
    }
}

public class ConChaining {

    public static void main(String[] args) {

        B obj = new B();
    }

}