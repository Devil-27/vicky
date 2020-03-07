import java.util.*;
class Rot
{
   public static void main(String args[])
   {
      String str,str1;
      String sau="";
      char ch;
      System.out.println("Enter the text");
      Scanner sc=new Scanner(System.in);
      str=sc.nextLine();
      str1=str.toUpperCase();
      for(int i=0;i<str1.length();i++)
      {
         int n=(int)str1.charAt(i);
         if(n>=65 && n<=77)
         {
              int m=n+13;
              char o=(char)m;
             sau+=o;
         }
         if(n>=78 && n<=90)
         {
            int w=n-13;
            char p=(char)w;
            sau+=p;
         }
      }
      System.out.println(sau);
     }
 }