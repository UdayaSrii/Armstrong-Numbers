import java.util.Scanner;
public class ArmstrongNumbers {
    public static boolean isArmstrong(int num ){
        int originalNumber = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == originalNumber;
    }
    public static void printArmstrongNumbers(int start, int end) {
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range (start astarting number of the range) : ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number of the range: ");
        int end = sc.nextInt();
        printArmstrongNumbers(start, end);
    }
}

