import java.util.Scanner;
class prime
{
  public static void main(String args[])
  {
    int c=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    for(int i=1;i<n;i++)
    {
      if(n%i==0)
      c++;
      }
     if(c>1)
     {
       System.out.println("NOT");
       }
       else
       {
        System.out.println("PRIME");
        }
     }
     }
