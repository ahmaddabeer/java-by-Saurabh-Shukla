import java.util.*;
class input
{

    public static void main(String[]args){

        System.out.println("Ener you name and age :");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();

        System.out.println("Name:"+name+ "Age"+age);
    }
}