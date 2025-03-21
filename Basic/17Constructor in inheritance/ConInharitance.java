


class A {

    int A;

    public A(int x) {

        A = x;
        System.out.println("A");
    }
}

class B extends A {

        int b;

    public B() {

        super(4);
        System.out.println("B");
    }
}

class Example {

        public static void main(String[] args) {

        B obj = new B();
    }
}
