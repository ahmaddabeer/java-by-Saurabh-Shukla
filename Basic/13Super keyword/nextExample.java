class outer {

    int z;
}

class inner extends outer {
    int z;

    public void f2() {
        int z;
        z = 2;
        this.z = 3;
        super.z = 4;

    }

  
}