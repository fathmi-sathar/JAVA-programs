import java.util.*;
class multip
{
  public static void main(String args[])
  {
    int i,j,k;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the row and column of first matrix");
    int r1=sc.nextInt();
    int c1=sc.nextInt();
    System.out.println("Enter the row and column of second matrix");
    int r2=sc.nextInt();
    int c2=sc.nextInt();
    int a[][]=new int[r1][c1];
    int b[][]=new int[r2][c2];
    int c[][]=new int[r1][c2];
    if(c1==r2)
    {
      System.out.println("Enter the first mtatrix");
      for(i=0;i<r1;i++)
      for(j=0;j<c1;j++)
      {
        a[i][j]=sc.nextInt();
        }
      System.out.println("Enter the second matrix");
      for(i=0;i<r2;i++)
      for(j=0;j<c2;j++)
      {
        b[i][j]=sc.nextInt();
        }
       for(i=0;i<r1;i++)
       for(j=0;j<c2;j++){
       c[i][j]=0;
       for(k=0;k<c1;k++)
       {
        c[i][j]+=a[i][k]*b[k][j];
        }
        }
       System.out.println("Product is");
       for(i=0;i<r1;i++){
       for(j=0;j<c2;j++)
       {
        System.out.print(c[i][j]+" ");
        }
        System.out.println();
        }
    }
    else
    System.out.println("invalid");
    }
    }
    
    
