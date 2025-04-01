import java.io.File;
import java.io.IOException;

public class  FileExample1{

    public static void main(String []args) throws IOException
    {

        File f1 = new File("C:\\visual studio code project\\B.Tech.2 Semester\\java by Saurabh Shukla\\Basic\\28file in java\\01");
        
        f1.createNewFile();
        System.out.println("Is exist :"+f1.exists());
        System.out.println("can file Read:"+f1.canWrite());
        System.out.println("File name :"+f1.getName());
        System.out.println("Length of file :"+f1.length());

    }
} 