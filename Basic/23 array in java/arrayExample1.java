import java.util.*;


class arrayExample1

{
    public static void main(String[]args)

    {

        int [] arr = new int [5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 5 number ");

        for(int i=0; i<5; i++){

            arr[i] = sc.nextInt();

        }


        for(int i = 0; i<5; i++){

            System.out.println("arr ["+i+"]="+arr[i]);
        }
    }
}

