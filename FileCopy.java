import java.io.*;

class FileCopy
{
    public static void main(String args[])
    {
        try
        {
            FileInputStream fin = new FileInputStream("a.txt");
            FileOutputStream fout = new FileOutputStream("b.txt");

            int data;

            while((data = fin.read()) != -1)
            {
                fout.write(data);
            }

            fin.close();
            fout.close();

            System.out.println("File copied successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}