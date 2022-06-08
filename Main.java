import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
   int temperature = 22;
   boolean isWarm =  temperature > 20 && temperature < 28;
   System.out.println(isWarm);

   boolean hasHighIncome = true;
   boolean hasGoodCredit = true;
   boolean  hasCriminalRecord = true;
   boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
   System.out.println(isEligible);
 }
}