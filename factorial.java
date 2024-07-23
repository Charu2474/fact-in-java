import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner g=new Scanner(System.in);
        int n1=g.nextInt();
        int res=1;
        if(n1>=0&&n1<=9)
        {
            for(int i=1;i<=n1;i++)
            {
                res*=i;
            }
            System.out.println("The Factorial of "+n1+" is "+res);
        }
        else
        {
            System.out.println("Invalid Input");
        }
            
    }
}
