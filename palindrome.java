import java.util.*;
class Palindrome
{
    /*
    *function to check it is palindrome or not
    */
  static int isPalindrome(String s)
    {
      int l=s.length();
      int i=0;
      int t=0;
      while(i!=l)
      {
          if(s.charAt(i)==s.charAt(l-(i+1)))
        {
         t=1;
         i++;
        }
        else
        {
             t=0;
             break;
        }
      }
      return t;
    }

    public static void main(String arr[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any String ?");
        String str=in.next();
        int t=isPalindrome(str);
        if(t==1)
        {
            System.out.println("It is a palindrome string");
        }
        else
        {
            System.out.println("Not a palindrome string");
        }
    }
}