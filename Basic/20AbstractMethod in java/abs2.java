abstract class person {

    abstract void show();
}

class student extends person {

    void show() {
        // some code

    }

}

class AbstractExample3 {

    public static void main(String[] args) {

        student s = new student();
        s.show();
    }
}
