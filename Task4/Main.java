import java.util.Scanner;
class M_Rooh
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Intermediate Marks: ");
    float I = sc.nextFloat();
    
    System.out.println("Enter Matriculation Marks: ");
    float M = sc.nextFloat();
    
    System.out.println("Enter Test Marks: ");
    float T = sc.nextFloat();
    
    float i = (I/1100)* 30f;
    float m = (M/850)*10f;
    float CPN = i + m + T;
    
    System.out.println("TCPN is: " + CPN);
  }
}
