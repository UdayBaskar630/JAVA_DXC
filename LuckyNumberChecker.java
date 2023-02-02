package DXC;

import java.util.Scanner;

public class LuckyNumberChecker {

    public static boolean isLuckyNumber(int num) {
        int sum = 0;
        int position = 2; 
        while (num > 0) {
            int digit = num % 10;
            if (position % 2 == 0) { 
                sum += digit * digit;
            }
            num /= 10;
            position++;
        }
        return sum % 9 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
    	int num = sc.nextInt();
        if (isLuckyNumber(num)) {
            System.out.println(num + " is a lucky number.");
        } else {
            System.out.println(num + " is not a lucky number.");
        }
    }
}