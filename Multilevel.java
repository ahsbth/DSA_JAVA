import java.util.Scanner;
public class Multilevel{
    public static void main(String args[])
    {
       Third t=new Third();
       t.get();
       t.get1();
       t.get2();
       t.factorial();
       t.swapp();
       t.perimeter();

    }
}
class First{
    int x;
    int a=x;
    
    Scanner sc=new Scanner(System.in);
    public void get()
    {
      System.out.println("Enter First no=");
      x=sc.nextInt();
    }
   
    public void factorial()
    {
        long f=1;
        while(a>0)
        {
            f=f*a;
            a--;
        }
        System.out.println("Factorial="+f);
    }
}
class Second extends First{
    int y;
    public void get1()
    {
        System.out.println("Enter second no=");
        y=sc.nextInt();
    }
    public void swapp()
    {
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("After Swapping First no="+x+"\tSecond no="+y);
    }
}
class Third extends Second{
    int z;
    public void get2()
    {
        System.out.println("Enter third no=");
        z=sc.nextInt();
    }
    public void perimeter()
    {
        float s=(float)(x+y+z);
        System.out.println("Perimeter of Traingle="+s);
    }
}


    


    
