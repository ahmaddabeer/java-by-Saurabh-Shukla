class Box {

    private int lenght,breath,height;
    public void setDimension(int l, int b, int h)
    {

        lenght = l; breath = b; height = h;
    }
    public void showDimension(){

        System.out.println("L="+lenght);
        System.out.println("B="+breath);
        System.out.println("H="+height);
    }
}

class example {

    public static void main(){

        Box samllBox = new Box();
        samllBox.setDimension(12,33,434);
        samllBox.showDimension();
        samllBox = new Box();

        samllBox.showDimension(); 
        
    }
}