class A extends Thread
{
  public void run()
  {
   System.out.println("Even");
   for(int i=1;i<=100;i++)
   {
     if(i%2==0)
     System.out.print(i+" ");
     }
     }
   }
 class B extends Thread
 {
   public void run()
   {
     System.out.println("Odd:");
       for(int i=1;i<=100;i++)
   {
     if(i%2!=0)
     System.out.print(i+" ");
     }
     }
   }
 class Threadpgm
 {
   public static void main(String args[]) throws InterruptedException
   {
     A even=new A();
     B odd=new B();
     even.start();
     even.join();
     odd.start();
     }
     }
