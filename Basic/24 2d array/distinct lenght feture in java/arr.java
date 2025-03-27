
public class arr {

    public static void main(String []args){


        int a[][] = new int [4][];

        a[0] = new int [5];
        a[1] = new int [3];

        System.out.println("a[0]="+a[0].length);//length is 5
        System.out.println("a[0]="+a[1].length);//length is 3
        System.out.println("a[0]="+a[3].length);//null
        System.out.println("a[0]="+a[4].length);//null

    }
    
}
