// Java String Revese
import java.io.*;
import java.util.*;

public class Q16 
{
    public static void main(String[] args) 
    {    
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String rev = "";
        for(int i = A.length()-1; i >= 0; i--)
            rev += A.charAt(i);
        if (Objects.equals(rev, A))
            System.out.println("Yes");
        else 
            System.out.println("No");
    }
}



