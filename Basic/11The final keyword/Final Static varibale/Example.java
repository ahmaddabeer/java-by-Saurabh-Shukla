public class Example {

    private final int x;// This is final instance member variable
    private final static int y;// final static member varibale
    static {
        y = 5;
    }

    Example() {
        x = 4;
    }

    public static void main(String[] args) {
        Example e1 = new Example();
    }
}