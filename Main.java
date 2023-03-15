import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
    Scanner liczba1 = new Scanner(System.in);
    Scanner liczba2 = new Scanner(System.in);
    Scanner liczba3 = new Scanner(System.in);
    System.out.println("Podaj 1 liczbe");
    int l1 = liczba1.nextInt();

     System.out.println("Podaj 2 liczbe");
     int l2 = liczba2.nextInt();

     System.out.println("Podaj 3 liczbe");
     int l3 = liczba3.nextInt();

    double max=0;
    if(l1>l2 && l1>l3)
    {
      max=l1;
    }
    else if(l2>l1 && l2>l3)
    {
      max=l2;
    }
    else if(l3>l1 && l3>l2)
    {
      max=l3;
    }
    System.out.println(max);
  }
}