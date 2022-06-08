

public class Main {
   public static void main(String[] args) {
      int temperature = 22;

      if(temperature > 30) {
         System.out.println("It's a hot day");
         System.out.println("Drink a lot of Water");
      } else if ( temperature <= 30 && temperature >= 20 ) {
         System.out.println("It is a nice day");
      } else {
         System.out.println("It is code");
      }
 }
}