// Java End-of-File
import java.io.*;
import java.util.*;

public class Q09 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in).useDelimiter("\\s*.\\s*");
        for(int i=1;sc.hasNextLine()==true;i++)
        {
            System.out.println(i+" "+sc.nextLine());
        }
    }
}