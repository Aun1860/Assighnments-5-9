import java.util.*;
class Menu{
        public static void main(String args[]){
       int a;
     Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
   System.out.println("enter 1 for Biryani*** 2 for seekh kabab*** 3 for karhai*** 4 for naan*** 5 for Tikka");
   switch(a){
  case 1:
  System.out.println("Biryani = Rs=200");
  break;

  case 2:
  System.out.println("seekh kabab = Rs=300");
  break;

   case 3:
  System.out.println("karhai = Rs=200");
  break;

    case 4:
  System.out.println("Naan = Rs=50");
  break;


    case 5:
  System.out.println("Tikka = Rs=600");
  break;

    default:
    System.out.println("Please Enter Number From 1 to 5");

}
       

}
  }