import java.util.Scanner;
class M_Rooh
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number: ");
    
    int a = sc.nextInt();
    
    if(a%2== 0)
    {
      System.out.println("The value of a is an even number.");
    }else{
      System.out.println("The value of a is an odd number.");
    }
  }
}
