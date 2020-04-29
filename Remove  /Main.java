import java.util.Scanner;
class Main
{
   public static void main(String[] args)
   {
       String strOrig, word;
       Scanner scan = new Scanner(System.in);
       
       strOrig = scan.nextLine();
       
       strOrig = strOrig.replaceAll("the ","");
	   System.out.print(strOrig);       
   }
}