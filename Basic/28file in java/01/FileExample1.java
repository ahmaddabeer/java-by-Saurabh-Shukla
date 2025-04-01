import java.io.File;
import java.io.IOException;

public class  FileExample1{

    public static void main(String []args) throws IOException
    {

        File f1 = new File("C:\\visual studio code project\\B.Tech.2 Semester\\java by Saurabh Shukla\\Basic\\28file in java\\01");
        
        f1.createNewFile();
        System.out.println("Is exist :"+f1.exists());
    }
}