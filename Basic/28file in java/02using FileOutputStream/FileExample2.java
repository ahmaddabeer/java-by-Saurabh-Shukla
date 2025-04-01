import java.io.*;
public class FileExample2
{

    public static void main(String []args) throws IOException
    {

        int i ;
        FileOutputStream fout = new FileOutputStream("C:\\visual studio code project\\B.Tech.2 Semester\\java by Saurabh Shukla\\Basic\\28file in java\\02");
        String s = "TATA";
        char ch[]=s.toCharArray();

        for(i=0; i<s.length(); i++){

            fout.write(ch[i]);
        }
        fout.close();
    }
}