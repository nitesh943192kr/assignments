import java.util.*;
public class Frequency
{
    /*
    *function to check 
    */
  static int isPalindrome(String s,char ch)
    {
      int l=s.length();
      int i=0;
      int t=0;
      while(i<l)
      {
          if(s.charAt(i)==ch)
          {
           t++;
          }
          i++;
      }
      return t;
    }

    public static void main(String arr[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any String ?");
        String str=in.next();
        System.out.println("Enter a letter ?");
        char ch = in.next().charAt(0); 
        System.out.println("The frequency of  "+ch+"  is\t"+isPalindrome(str,ch));      
    }
}