import java.util.*;

public class PlusOne {

    // Function to count digits in a number
    public static int checkDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    // Function to add one to the number represented by the array
    public static int[] plusOne(int[] arr) {
        int newDigit = 0;
        int k = arr.length - 1;

        // Convert array to number
        for (int i = 0; i < arr.length; i++) {
            newDigit += arr[i] * Math.pow(10, k);
            k--;
        }

        // Display original number
        System.out.println("Number formed is: " + newDigit);

        newDigit++;

        // Count number of digits in new number
        int count = checkDigit(newDigit);
        System.out.println("New number has digits: " + count);

        // If number of digits increased, create new array
        int[] result;
        if (count > arr.length) {
            result = new int[count];
        } else {
            result = new int[arr.length];
        }

        k = result.length - 1;
        while (newDigit > 0) {
            result[k] = newDigit % 10;
            newDigit /= 10;
            k--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {8, 9, 9};

        int[] result = plusOne(arr);

        System.out.print("Final array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
