import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
    int[] numbers = new int[5];
    numbers[0]= 1;
    numbers[1]= 2;
    numbers[2]= 3;
    numbers[3]= 4;
    numbers[4]= 5;
    
    System.out.println(numbers);
    System.out.println(Arrays.toString(numbers));


    int[] newNumbers = {2,3,4,5,1,6};
    System.out.println(numbers.length);
 }
}