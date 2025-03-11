package pack1;
import pack2.student;
public class Example{
    public static void main(String []args){


        student s1 = new student();
        s1.setRollno(100);
        s1.setName("Dabeer ahmad");
        System.out.println("Roll No."+s1.getRollno());
        System.out.println("Name :"+s1.getName());

    }
}