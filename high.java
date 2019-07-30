package High;
import java.util.Scanner;
public class high {

  public static void main(String[] args) {
   Scanner inp=new Scanner(System.in);
   float s1,s2,s3,high;
   System.out.println("Enter the Salaries");
   s1=inp.nextFloat();
   s2=inp.nextFloat();
   s3=inp.nextFloat();
   high=s1;
   if(high<s2)
   high=s2;
   if(high<s3)
   high=s3;
   System.out.println(+high);
  }
}
